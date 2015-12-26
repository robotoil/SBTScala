package com.robotoil.scala

object test1 {
  def main (args: Array[String]) {

    println("\nHello. I am starting the program now.\n")

    //------------

    class Upper {
      def upper(strings: String*): Seq[String] = {
        strings.map((s:String) => s.toUpperCase()) }
    }
    val up = new Upper
    Console.println(up.upper("A", "First", "Scala", "Program"))

    //--------










println("\ngoodbye.\n")

  }
}

