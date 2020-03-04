import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object Lista {
  def main(args: Array[String]): Unit = {
    var palabras = new ListBuffer[String]()
    var i = 0
    println("Ingrese el numero de palabras:")
    var num = readInt()

    while (i < num) {
      println("ingrese palabra " + (i + 1))
      palabras += readLine()
      i += 1
    } //while

    println("Ingrese palabra a buscar:")
    var pal = readLine()
    var cont = 0
    for (e <- palabras) {
      if (e.equals(pal)) {
        cont += 1
      }

    }
    println(palabras)
    println("La palabra " + pal + " aparece " + cont + " veces")

  } //main
}//object