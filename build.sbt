import _root_.sbtassembly.AssemblyPlugin.autoImport._
import _root_.sbtassembly.PathList

name := "SBTScala"
version := "1.0"
scalaVersion := "2.10.4"

// Do not include Scala in the JAR
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

// Java Dependencies
//libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.9" // Placed in the lib directory

// META-INF discarding
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

//mainClass in assembly := Some("com.robotoil.test1")

lazy val dse_run = taskKey[Unit]("Builds the package and ships it to the DSE cluster")
dse_run := {
  ("dse spark-submit " + assembly.value) !
}

    