# spark-wikipedia-dump-loader-example
[![Build Status](https://travis-ci.org/nwtgck/wikipedia-dump-loader-example-scala.svg?branch=master)](https://travis-ci.org/nwtgck/wikipedia-dump-loader-example-scala)

An example of [spark-wikipedia-dump-loader](https://github.com/nwtgck/spark-wikipedia-dump-loader)

## Run

```bash
cd <this repo>
sbt stage 
./target/universal/stage/bin/spark-wikipedia-dump-loader-example
```

NOTE: `sbt run` doesn't work (I don't know the reason), However, run by IntelliJ is fine. 

## Main.scala

You can find [Main.scala](src/main/scala/io/github/nwtgck/spark_wikipedia_dump_loader_example/Main.scala).

