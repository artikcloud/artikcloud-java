lazy val root = (project in file(".")).
  settings(
    organization := "cloud.artik",
    name := "artikcloud-java",
    version := "2.0.7",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.0",
      "com.squareup.okhttp" % "okhttp" % "2.7.2",
      "com.squareup.okhttp" % "logging-interceptor" % "2.7.2",
      "com.squareup.okhttp3" % "okhttp-ws" % "3.4.1",
      "com.google.code.gson" % "gson" % "2.3.1",
      "joda-time" % "joda-time" % "2.9.3",
      "junit" % "junit" % "4.8.1" % "test"
    )
  )
