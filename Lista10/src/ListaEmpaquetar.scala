import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object ListaEmpaquetar {

  def main(args: Array[String]): Unit = {
    var paquete = llenarList()
    println("Lista empaquetada " + empaquetar(paquete))
  }

  def llenarList(): ListBuffer[String] = {
    var paquete = new ListBuffer[String]()
    println("Inserta el numero de elementos que tendra la lista: ")
    var num = readInt()
    for (i <- 0 until num) {
      println("Inserta palabra numero " + (i + 1))
      paquete += readLine()
    }
    return paquete
  }

  def empaquetar(paquete: ListBuffer[String]): ListBuffer[String] = {
    var lisEmpaquetar = new ListBuffer[String]()

    println("Inserta la palabra para empaquetar: ")
    var palabra = readLine()
    println("Inserta numero de veces que se debe empaquetar: ")
    var num = readInt()
    for (i <- paquete) {
      lisEmpaquetar += i
      if (i == palabra) {
        for (j <- 1 until num)
          lisEmpaquetar += i
      }
    }
    return lisEmpaquetar
  }
}