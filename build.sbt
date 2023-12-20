import Dependencies._

ThisBuild / scalaVersion := "3.3.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "net.cipherdogs"
ThisBuild / organizationName := "cipherdogs"
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

lazy val root = project
  .in(file("."))
  .settings(
    name := "example",
    scalacOptions ++= Seq("-deprecation", "-Wunused:imports"),
    libraryDependencies += munit % Test
  )

// Run scalafmt on compile.
scalafmtOnCompile := true

// Run scalafix on compile.
scalafixOnCompile := true
