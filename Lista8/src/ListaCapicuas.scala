import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object ListaCapicuas {
  def main(args: Array[String]): Unit = {
    var numeros = llenarList()
    println("Lista con numeros capicuas " + obtenerCapicuas(numeros))
  }

  def llenarList(): ListBuffer[String] = {
    var numeros = new ListBuffer[String]()
    println("Inserta el numero de elementos que tendra la lista: ")
    var num = readInt()
    for (i <- 0 until num) {
      println("Inserta valor numero " + (i + 1))
      numeros += readLine()
    }
    return numeros
  }

  def obtenerCapicuas(numeros: ListBuffer[String]): ListBuffer[String] = {
    var numCapicuas = new ListBuffer[String]()
    var cap = numeros

    for (i <- cap) {
      for (j <- cap) {
        if (i == j.reverse) {
          numCapicuas += i
        }
      }
    }
    return numCapicuas
  }
}