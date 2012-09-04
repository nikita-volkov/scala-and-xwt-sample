package swtTestApp

import org.eclipse.e4.xwt.IValueConverter

class MilisecToSecConverter extends IValueConverter {
  def getFromType = classOf[ Int ]
  def getToType = classOf[ String ]
  def convertBack( a : Any ) =
    a match {
      case null =>
        println( "convertBack", "null" )
        0f.asInstanceOf[ Object ]
      case "" =>
        println( "convertBack", "emptyString" )
        0f.asInstanceOf[ Object ]
      case a : String =>
        println( "convertBack", a )
        ( a.toFloat * 1000 ).toInt.asInstanceOf[ Object ]

    }
  def convert( a : Any ) =
    a match {
      case null =>
        println( "convert", "null" )
        0.asInstanceOf[ Object ]
      case 0 =>
        println( "convert", "emptyString" )
        0.asInstanceOf[ Object ]
      case a : Int =>
        println( "convert", a )
        a./( 100f ).round./( 10f ).toString.asInstanceOf[ Object ]
    }
}
