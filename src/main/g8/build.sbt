name := "$name$"

version := "0.1.0"

organization := "$organization$"

scalaVersion := "$scala_version$"

scalacOptions ++= Seq("-deprecation", "-unchecked")

javacOptions ++= Seq("-g")

crossPaths := false // drop off Scala suffix from artifact names.
autoScalaLibrary := false // exclude scala-library from dependencies

/** Shell */
shellPrompt := { state => System.getProperty("user.name") + " " +System.getProperty("user.dir") + " sbt> " }

//libraryDependencies ++= {
//  Seq(
//    "javax.servlet"     % "javax.servlet-api"       % "3.0.1"
//  )
//}
