name := "wikipedia-dump-loader-example-scala"

version := "0.1"

scalaVersion := "2.11.12"

// Add dependency of `wikipedia-dump-loader` in GitHub
// (from: https://github.com/sbt/sbt/issues/3489)
dependsOn(RootProject(uri("https://github.com/nwtgck/wikipedia-dump-loader-scala.git#6c63b83782f1e3249c001235d5e6057b98ecad5e")))

enablePlugins(JavaAppPackaging)