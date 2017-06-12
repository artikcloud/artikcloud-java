lazy val root = (project in file(".")).
  settings(
    organization := "cloud.artik",
    name := "artikcloud-java",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    publishMavenStyle := true,
    resolvers += Resolver.mavenLocal,
    resolvers += "samihub-artifactory" at "https://artifactory.samsungsami.io/artifactory/libs-release",
    resolvers += "samihub-artifactory-snapshots" at "https://artifactory.samsungsami.io/artifactory/libs-snapshot",
    credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
    publishTo := {
      val artifactory = "https://artifactory.samsungsami.io/"
      if (isSnapshot.value)
        Some("snapshots" at artifactory + "artifactory/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime)
      else
        Some("releases"  at artifactory + "artifactory/libs-release-local")
    },
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
