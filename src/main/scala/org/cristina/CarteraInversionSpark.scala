package org.cristina

import org.apache.spark.mllib.linalg.{Vector,DenseVector,Vectors}
import org.apache.spark.SparkContext
import org.apache.spark.mllib.recommendation.{ALS,Rating,MatrixFactorizationModel}
import org.apache.spark.mllib.linalg.{Matrix,Matrices}
import org.apache.spark.mllib.linalg.distributed.{RowMatrix, CoordinateMatrix, MatrixEntry}
import org.apache.spark.rdd.RDD
import org.apache.spark.mllib.stat.{MultivariateStatisticalSummary, Statistics}
import scala.language.implicitConversions
import breeze.linalg.{squaredDistance}
import org.apache.spark.SparkConf



/**
 * Created by cloudera on 6/23/15.
 */
object CarteraInversionSpark{

  def main(args: Array[String]){
	  
  val fileEntrada = args(0) 
  val fileSalida = args(1) 
  val conf = new SparkConf().setAppName("CI") 
  val sc = new SparkContext(conf) 
  val file = sc.textFile(fileEntrada) 
  val num_data = file.map(line => line.split('\t').tail.map(x=>x.toDouble)) 
  val v = num_data.map(line => Vectors.dense(line))
  val x = new RowMatrix(v) 
  val m = x.computeCovariance() 
  val p = println(m)
    
  sc.makeRDD(m.toArray,1).saveAsTextFile(args(1))
 

  }

}


