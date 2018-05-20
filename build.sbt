name := "spark-wikipedia-dump-loader-example"

version := "0.1"

scalaVersion := "2.11.12"

// Add dependency of `spark-wikipedia-dump-loader` in GitHub
// (from: https://github.com/sbt/sbt/issues/3489)
dependsOn(RootProject(uri("https://github.com/nwtgck/spark-wikipedia-dump-loader.git#e6e358dd8cdd5b6200b89f5d2aa76c74b5c1d0d7")))

enablePlugins(JavaAppPackaging)