import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object EliminarDosListas {
  def main(args: Array[String]): Unit = {
    println("Inserta el numero de palabras que tendra la lista: ")
    var n = readInt()
    var palabras1 = llenarLista(n)
    println("Inserta el numero de palabras que tendra la segunda lista: ")
    var m = readInt()
    var palabras2 = llenarLista(m)

    println("Lista con palabras eliminadas " + eliminarPalabra(palabras1, palabras2))
  }

  def llenarLista(n: Int): ListBuffer[String] = {
    var palabras1 = new ListBuffer[String]()

    for (i <- 0 until n) {
      println("Inserta la palabra numero " + (i + 1))
      palabras1 += readLine()
    }
    return palabras1
  }

  def eliminarPalabra(palabras1: ListBuffer[String], palabras2: ListBuffer[String]): ListBuffer[String] = {
    val palabra2 = palabras2
    val palabrasEliminar = palabras1
    var pal = 0

    for (i <- palabrasEliminar) {
      pal += 1
      for (j <- palabra2) {

        if (i == j) {
          palabrasEliminar.remove(pal)
        }
      }
      //pal=0
    }
    return palabrasEliminar
  }
}