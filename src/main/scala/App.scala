import scala.util.Try

object App extends App {
   scala.io.Source.stdin.getLines().foreach{ line =>
     Try {
        line.toLong
     }.foreach{ longNum =>
       println(java.lang.Long.toString(longNum, 36))
     }
   }
}
