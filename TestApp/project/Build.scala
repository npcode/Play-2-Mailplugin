import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "TestApp"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "info.schleichardt" %% "play-2-mailplugin" % "0.6.1",
      "com.icegreen" % "greenmail" % "1.3"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
