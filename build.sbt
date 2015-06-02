name := "play-ws-cache"

organization := "com.typesafe.play"

scalaVersion := "2.11.6"

version := "1.0.0-SNAPSHOT"

crossScalaVersions := Seq("2.10.5", "2.11.6")

publishMavenStyle := false

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Good practice options
scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-Xlint",
  "-deprecation",
  "-Yno-adapted-args",
  "-Ywarn-numeric-widen",
  "-Xfatal-warnings"
)

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-ws" % "2.4.0",
  "com.google.code.findbugs" % "jsr305" % "3.0.0", // required to suppress @NotNull compiler errors
  "com.typesafe.play" %% "cachecontrol" % "1.0.0",
  "com.typesafe.play" %% "play-specs2" % "2.4.0-SNAPSHOT" % "test"
)

