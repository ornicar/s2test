import sbt._
import Keys._

object Build extends Build {

  lazy val hu = Project("hu", file(".")).settings(
    libraryDependencies := Seq("org.specs2" %% "specs2" % "1.8.2")
  )
}
