import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object ListaPrimos {

  def main(args: Array[String]): Unit = {

    var numeros = llenarList()

    numPrimo(numeros)
    println("Lista normal " + numeros)
    println("sumatoria " + sumarNumeros(numeros))
    promedioNumeros(numeros)

  }

  /* while ((primo) && (contador!=i)){
    if ((i % contador) == 0)
      primo = false;
    contador+=1
  }*/

  def numPrimo(numeros: ListBuffer[Int]): Unit = {
    var numPrimo = new ListBuffer[Int]()
    var cont = 1

    for (i <- numeros) {

      for (f <- 1 to i) {
        if ((i % cont) == 0 && cont < i)
          cont += 1

      }
      if (cont > 2)
        0
      else
        numPrimo += i
      cont = 1

    }
    println(" Numeros primos " + numPrimo)

  }

  def llenarList(): ListBuffer[Int] = {
    var numeros = new ListBuffer[Int]()
    println("Cuantos numeros tendra la lista: ")
    var n = readInt()
    for (i <- 0 until n) {
      println("Inserta el valor " + (i + 1))
      numeros += readInt()
    }
    return numeros
  }

  def sumarNumeros(numeros: ListBuffer[Int]): Int = {

    var s = 0
    for (i <- numeros) {
      s += i

    }
    return s
  }

  def promedioNumeros(numeros: ListBuffer[Int]): Unit = {

    var s = sumarNumeros(numeros)

    println("Promedio " + (s.toDouble / numeros.size.toDouble))
  }
}