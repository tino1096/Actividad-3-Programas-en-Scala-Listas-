import scala.collection.mutable.ListBuffer

import scala.io.StdIn._

object ListaSustituirPalabra {

  def main(args: Array[String]): Unit = {
    var palabras = new ListBuffer[String]()
    var p = new ListBuffer[String]()
    var i = 0
    println("Ingrese el numero de palabras:")
    var num = readInt()

    while (i < num) {
      println("ingrese palabra " + (i + 1))
      palabras += readLine()
      i += 1
    } //while
    println("//////////////////////////")
    println("Ingrese palabra uno:")
    var pal = readLine()
    println("//////////////////////////")

    println("Ingrese palabra dos:")
    var pal2 = readLine()
    println(palabras)
    //var p=  palabras.toList

    for (e <- palabras) {

      if (e.equals(pal2)) {
        p += pal
      } else {
        p += e
      }

    }
    println(p)

  }

}