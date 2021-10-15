val akkaVersion = "2.6.16"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-simple",
    version := "0.1.0",

    scalaVersion := "3.0.2",

    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.6",

    libraryDependencies ++= Seq(
       "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
       "com.typesafe.akka" %% "akka-slf4j"       % akkaVersion,
       "org.scalatest"     %% "scalatest"        % "3.2.10" % Test,
    ).map(_.cross(CrossVersion.for3Use2_13))
  )
