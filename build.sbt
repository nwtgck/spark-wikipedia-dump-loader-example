name := "spark-wikipedia-dump-loader-example"

version := "0.1"

scalaVersion := "2.11.12"

// Add dependency of `spark-wikipedia-dump-loader` in GitHub
// (from: https://github.com/sbt/sbt/issues/3489)
dependsOn(RootProject(uri("https://github.com/nwtgck/spark-wikipedia-dump-loader.git#3ddea892f3650493d3af5bc8f2f8199b9e4c8548")))

enablePlugins(JavaAppPackaging)