name := "wikipedia-dump-loader-example-scala"

version := "0.1"

scalaVersion := "2.11.12"

// Add dependency of `wikipedia-dump-loader` in GitHub
// (from: https://github.com/sbt/sbt/issues/3489)
dependsOn(RootProject(uri("git://github.com/nwtgck/wikipedia-dump-loader-scala.git#3c410b924ff7e793be2996141319f6a4dfe1835c")))