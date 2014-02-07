package $organization$.$name;format="lower,word"$

import org.rogach.scallop._

class $name;format="Camel"$Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  version("$name;format="Camel"$ $version$ (c) $copyright$")
  banner("""Usage: $name;format="Camel"$ [OPTION].... [foo|bar] [OPTION].... [foo|bar]
            |$name;format="Camel"$ is......[describe the app here]
            |""".stripMargin)
  footer("\n for all other information, see [url]")

  val option1 = opt[Int]("option1")
}


object $name;format="Camel"$ {
  def main(args: Array[String]){
    val conf = new $name;format="Camel"$Conf(args)

    println(conf.option1)
  }
}

