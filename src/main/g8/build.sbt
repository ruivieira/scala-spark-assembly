
// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.12",
      resolvers ++= Seq(
        "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
        "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/",
        "Artima Maven Repository" at "http://repo.artima.com/releases"
      ),
      libraryDependencies := Seq(
        "org.apache.spark" %% "spark-core" % "2.3.1",
        "org.apache.spark" %% "spark-mllib" % "2.3.1",
        "org.scalanlp" %% "breeze" % "0.13.2",
        "org.scalanlp" %% "breeze-natives" % "0.13.2",
        "org.scalactic" %% "scalactic" % "3.0.5",
        "org.scalatest" %% "scalatest" % "3.0.5" % "test"
      )
    )),
    name := "scala-spark-assembly.g8",
    mainClass in assembly := Some("com.example.Main"),
    assemblyMergeStrategy in assembly := {
      case PathList("org","aopalliance", xs @ _*) => MergeStrategy.last
      case PathList("javax", "inject", xs @ _*) => MergeStrategy.last
      case PathList("javax", "servlet", xs @ _*) => MergeStrategy.last
      case PathList("javax", "activation", xs @ _*) => MergeStrategy.last
      case PathList("org", "apache", xs @ _*) => MergeStrategy.last
      case PathList("com", "google", xs @ _*) => MergeStrategy.last
      case PathList("com", "esotericsoftware", xs @ _*) => MergeStrategy.last
      case PathList("com", "codahale", xs @ _*) => MergeStrategy.last
      case PathList("com", "yammer", xs @ _*) => MergeStrategy.last
      case "about.html" => MergeStrategy.rename
      case "META-INF/ECLIPSEF.RSA" => MergeStrategy.last
      case "META-INF/mailcap" => MergeStrategy.last
      case "META-INF/mimetypes.default" => MergeStrategy.last
      case "plugin.properties" => MergeStrategy.last
      case "log4j.properties" => MergeStrategy.last
      case "git.properties" => MergeStrategy.last
      case x =>
        val oldStrategy = (assemblyMergeStrategy in assembly).value
        oldStrategy(x)
    }
  )
