object console {
  
  val parsers = new AreaParsers
  
  def repl() {
    var more = true
    while(more) {
      print("-> ")
      var cmmd = readLine
      if (cmmd == "quit") {more = false; println("bye")}
      else {
        var areaCmmd = parsers.parseAll(parsers.command, cmmd).get
        println("area = " + areaCmmd.execute)
      }
    }
  }

  def main(args: Array[String]): Unit = {repl}

}