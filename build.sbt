name := "android-implicit"

version := "0.0.1-SNAPSHOT"

organization := "com.github.shoscala"

libraryDependencies += "com.android.support" % "support-v4" % "19.0.1"

libraryDependencies += "com.google.android" % "android" % "2.2.1" % "provided"

exportJars := true

incOptions := incOptions.value.withNameHashing(true)