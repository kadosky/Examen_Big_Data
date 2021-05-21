/*
 DIOP ASSANE IDSI 2021
* */
import scala.collection.breakOut
import scala.collection.immutable.ListMap
object ExamenBigData {

  def ModifList(liste:List[String]): List[String] =  {
    return liste.filter(element =>element.endsWith("n"))
  }

  def avoir_domaine(lien:String) : String ={ // elle permet d'avoir les domaines des liens
    return lien.replace("https://www.","").split("/")(0)
    /*
      pour cette fonction remplace le "https://www." par un vide et ensuite j'effectue
      un split par "/" diviser le texte et pour terminer je prend le valeur 0 de la liste
      obtenue
    */
  }

  def liste_double(): Unit ={
    val Maliste = List(("ecommercemag.fr",null),
      ("https://www.journalducm.com/contact/","Payant"),
      ("https://www.zatsaz.com/",null),
      ("https://www.lerevenu.com/",null),
      ("https://www.cadre-dirigfdeant-magazine.com/","Payant"),
      ("https://www.silicon.fr/services/contact#annoner","Payant"),
      ("https://www.channelbiz.fr/nous-contacter/",null),
      ("https://www.itespresso.fr/",null),
      ("https://www.industrie-mag.com/article4.html","invite"),
      ("https://www.jesuisundev.com/article-invite/","invite"),
      ("https://www.numerama.com/",null)
    )
    // je cree d'abord une liste avec les domaines et ensuite je fais une fusion avec la 2nde colonne
    val finalListe =  (ListMap(Maliste:_*).keys.toList.map(l => avoir_domaine(l) ) zip ListMap(Maliste:_*).values).toList // funsionner les 2 dans une liste de tuple

    println(finalListe)
  }

  def main(args: Array[String]): Unit = {
    val listetest = List("julien","Paul", "jean", "rac", "trec", "joel", "ed","chris", "maurice")
    println(ModifList(listetest))
    liste_double()
  }


}
