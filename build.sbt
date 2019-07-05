name := "twitter-structured-streaming"

version := "1.0"

organization := "org.twitter-structured-streaming"

scalaVersion := "2.11.8"

val sparkVersion = "2.4.3"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-catalyst" % sparkVersion
)
