import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object ListaPalindromo {

  def main(args: Array[String]): Unit = {
    var palabras = llenarList()
    println("Lista con palabras palindromas: " + obtenerPalindroma(palabras))
  }

  def llenarList(): ListBuffer[String] = {
    var palabras = new ListBuffer[String]()
    println("Inserta el numero de palabras que tendra la lista: ")
    var num = readInt()
    for (i <- 0 until num) {
      println("Inserta la palabra numero " + (i + 1))
      palabras += readLine()
    }
    return palabras
  }

  def obtenerPalindroma(palabras: ListBuffer[String]): ListBuffer[String] = {
    var palindromas = new ListBuffer[String]()
    var palabra = palabras

    for (i <- palabra) {
      for (j <- palabra) {
        if (i == j.reverse) {
          palindromas += i
        }
      }
    }
    return palindromas
  }
}