name := "spark-infotheoretic-feature-selection"

version := "0.1"

organization := "com.github.sramirez"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(

  "org.apache.spark" % "spark-core_2.11" % "2.0.1" % "provided",
  "org.apache.spark" % "spark-graphx_2.11" % "2.0.1" % "provided",
  "org.apache.spark" % "spark-mllib_2.11" % "2.0.1" % "provided",
  "org.apache.spark" % "spark-hive_2.11" % "2.0.1" % "provided",

  //"com.holdenkarau" % "spark-testing-base_2.11" % "2.0.1_0.6.0" % "provided",
  "org.scalatest" % "scalatest_2.11" % "2.2.2" % "provided",
  "junit" % "junit" % "4.12" % "provided"
)


resolvers ++= Seq(
  "Apache Staging" at "https://repository.apache.org/content/repositories/staging/",
  "Typesafe" at "http://repo.typesafe.com/typesafe/releases",
  "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"
)

publishMavenStyle := true


