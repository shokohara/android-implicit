name := "android-implicit"

version := "0.0.1-SNAPSHOT"

organization := "com.github.shoscala"

libraryDependencies += "com.android.support" % "support-v4" % "19.0.1"

libraryDependencies += "com.google.android" % "android" % "2.2.1" % "provided"

crossScalaVersions := Seq("2.10.4","2.11.0-RC3")

exportJars := true

incOptions := incOptions.value.withNameHashing(true)