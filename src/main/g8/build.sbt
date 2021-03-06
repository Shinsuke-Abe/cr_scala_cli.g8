name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.4.15" % "test",
  "org.rogach" %% "scallop" % "0.9.5"
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Read here for optional dependencies:
// http://etorreborre.github.io/specs2/guide/org.specs2.guide.Runners.html#Dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

initialCommands := "import $organization$.$name;format="lower,word"$._"

ideaExcludeFolders += ".idea"

ideaExcludeFolders += ".idea_modules"
