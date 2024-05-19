ThisBuild / scalaVersion := "2.13.6"

lazy val gfs = (project in file("modules/gfs"))
  .settings(
    libraryDependencies ++= Dependencies.gfsDeps
  )

lazy val root = (project in file("."))
  .settings(name := "gfs")
  .aggregate(
    gfs
  )
