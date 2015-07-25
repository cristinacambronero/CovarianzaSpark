mvn package

SPARK_HOME/bin/spark-submit --class "org.cristina.CarteraInversionSpark" --master spark://quickstart.cloudera:7077 /home/cloudera/Desktop/CarteraInversionSpark/target/CI-spark-1.0.jar <fichero de entrada> <fichero de salida>

/home/cloudera/spark-1.4.0-bin-hadoop2.6/bin/spark-submit --class "org.cristina.CarteraInversionSpark" --master spark://quickstart.cloudera:7077 /home/cloudera/Desktop/CarteraInversionSpark/target/CI-spark-1.0.jar /home/cloudera/Desktop/CarteraInversionSpark/CI10.txt salidaSpark

/usr/bin/spark-submit --class "org.cristina.CarteraInversionSpark" --master spark://quickstart.cloudera:7077 /home/cloudera/Desktop/CarteraInversionSpark/target/CI-spark-1.0.jar
