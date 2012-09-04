package swtTestApp

import org.eclipse.e4.xwt.IValueConverter

class SecToMilisecConverter extends IValueConverter {
  def getFromType = classOf[ String ]
  def getToType = classOf[ Int ]
  def convert( a : Any ) = {
    def int =
      a match {
        case null | ""  => 0
        case a : String => a.toFloat * 1000 toInt
      }
    int.asInstanceOf[ Object ]
  }
  def convertBack( a : Any ) = {
    def float =
      a match {
        case null | 0 => 0f
        case a : Int  => a / 1000f
      }
    ( "%03.01f" format float ).asInstanceOf[ Object ]
  }
}
