name := "IronSource"

import sun.security.tools.PathList


version := "1.0"

scalaVersion := "2.11.0"

ivyScala := ivyScala.value map {
  _.copy(overrideScalaVersion = true)
}

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.1" % "provided" 
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.1" % "provided"
unmanagedClasspath in(Compile, runMain) += baseDirectory.value / "conf" / "hadoop"

unmanagedBase := baseDirectory.value / "lib"



//libraryDependencies += "net.liftweb" % "lift-json_2.10" % "3.0-M1"

// https://mvnrepository.com/artifact/org.json/json
//libraryDependencies += "org.json" % "json" % "20160810"
// https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk
//libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.7.4"
// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-aws
//libraryDependencies += "org.apache.hadoop" % "hadoop-aws" % "2.7.0"
// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations
//libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.7.0"
// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
//libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.0"
// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
//libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.0"
// https://mvnrepository.com/artifact/joda-time/joda-time
//libraryDependencies += "joda-time" % "joda-time" % "2.9.6"
//dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
//dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
//dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"
