import scala.collection.mutable.ListBuffer
import scala.io.StdIn._

object ListaEliminar {
  def main(args: Array[String]): Unit = {
    var palabras = new ListBuffer[String]()
    var p = new ListBuffer[String]()
    var i = 0
    println("Ingrese el numero de palabras:")
    var num = readInt()
    var cont = 0
    while (i < num) {
      println("ingrese palabra " + (i + 1))
      palabras += readLine()
      i += 1
    } //while

    println("Ingrese la palabra a eliminar")
    var pal = readLine()
    //val p=  palabras.toList
    //p dropWhile (x => x==pal)
    for (e <- palabras) {

      if (e != pal) {

        p += e

      }

    }
    println(palabras)
    println(p)

  }

}