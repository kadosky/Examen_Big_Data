object ExamenBigData {

  def ModifList(liste:List[String]): List[String] =  {
    val listeFinal = liste.filter(l => l.endsWith("n"))
    return listeFinal
  }

  def main(args: Array[String]): Unit = {

  }
}
