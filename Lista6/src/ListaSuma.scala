import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object ListaSuma {
  def main(args: Array[String]): Unit = {

    var numeros = llenarList()
    println("Lista con las sumas: " + sumarNumeros(numeros))
    println("Lista normal: " + numeros)
  }

  def llenarList(): ListBuffer[Int] = {
    var numeros = new ListBuffer[Int]()
    println("Cuantos numeros tendra la lista: ")
    var n = readInt()
    for (i <- 0 until n) {
      println("Inserta el valor: " + (i + 1))
      numeros += readInt()
    }
    return numeros
  }

  def sumarNumeros(numeros: ListBuffer[Int]): ListBuffer[Int] = {
    var numerosSuma = numeros
    var n = new ListBuffer[Int]()
    var s = 0
    for (i <- numerosSuma) {
      s += i
      n += s
    }
    return n
  }
}