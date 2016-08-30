name := "meetup-scala-client"

organization := "com.meetup"

version := "0.0.1"

crossPaths := false

autoScalaLibrary := false

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "io.swagger" % "swagger-codegen" % "2.2.0",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"
)

initialCommands := "import com.meetup.codegen._"