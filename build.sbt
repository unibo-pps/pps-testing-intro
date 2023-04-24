ThisBuild / resolvers += Resolver.jcenterRepo

val junitJupiterVersion = "5.9.2"

lazy val root = (project in file("."))
  .settings(
    scalaVersion := "3.2.2",
    name := "pps-lecture-testing",
    libraryDependencies ++= Seq(
      // Junit api for cucumber
      "org.junit.jupiter" % "junit-jupiter-api" % junitJupiterVersion % Test,
      "org.junit.jupiter" % "junit-jupiter-engine" % junitJupiterVersion % Test,
      "org.scalatest" %% "scalatest" % "3.2.15" % Test,
      "org.scalatestplus" %% "selenium-4-1" % "3.2.12.1" % Test,
      "io.cucumber" %% "cucumber-scala" % "8.14.1" % Test,
      s"org.scalatestplus" %% "scalacheck-1-15" % "3.2.10.0" % Test,
      "org.slf4j" % "slf4j-log4j12" % "2.0.5" % Test
    ),
    Test / parallelExecution := false
  )

// Cucumber configuration
// Run by:  sbt> cucumber
enablePlugins(CucumberPlugin)
CucumberPlugin.glues := List("testLecture/code/e3bdd/steps")
