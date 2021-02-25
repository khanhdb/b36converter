name := "b36converter"

version := "0.1"

maintainer := "khanhdb"

organization := "sandinh"

scalaVersion := "2.13.5"

name in Universal := name.value

name in UniversalDocs := (name in Universal).value

name in UniversalSrc := (name in Universal).value

packageName in Universal := packageName.value

val root = project.in(file(".")).enablePlugins(UniversalPlugin).enablePlugins(JavaAppPackaging)
