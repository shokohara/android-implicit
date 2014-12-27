name := "android-implicit"

version := "0.0.1-SNAPSHOT"

organization := "com.github.shoscala"

scalaVersion := "2.11.4"

resolvers += Resolver.mavenLocal

libraryDependencies += "com.google.android" % "android" % "4.1.1.4" % "provided"

libraryDependencies += "com.android.support" % "support-v4" % "19.0.1"

exportJars := true
