name := "eff-monad"

version := "0.1"

scalaVersion := "2.12.4-bin-typelevel-4"

libraryDependencies += "org.atnos" %% "eff" % "4.6.0"

// to write types like Reader[String, ?]
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")

// to get types like Reader[String, ?] (with more than one type parameter) correctly inferred for scala 2.11 < 2.11.9
// you can use the [Typelevel Scala compiler](http://typelevel.org/scala)
scalaOrganization in ThisBuild := "org.typelevel"

// to get types like Reader[String, ?] (with more than one type parameter) correctly inferred for scala 2.12.x
scalacOptions += "-Ypartial-unification"
//libraryDependencies += "org.typelevel" %% "cats-core" % "0.9.0"
