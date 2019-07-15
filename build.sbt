name := "ArangoDBScalaTest"

version := "0.1"

//libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "1.4.1"
//libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.2.0"

// WORKING BUT NULL POINTER ERROR AND REPRODUCIBLE - spark 1.0.10 and scala 12
//scalaVersion := "2.12.8"
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"
//libraryDependencies += "com.arangodb" % "arangodb-spark-connector_2.12" % "1.0.10"

// WOKRING AND REPRODUCIBLE - spark 1.0.8 and scala 11
scalaVersion := "2.11.12"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.4.3"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.4.3"
libraryDependencies += "com.arangodb" % "arangodb-spark-connector" % "1.0.8"

// WOKRING NULL POINTER EXCEPTION AND REPRODUCIBLE - 1.0.9 and scala 12
//scalaVersion := "2.12.8"
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"
//libraryDependencies += "com.arangodb" % "arangodb-spark-connector_2.12" % "1.0.9"
