package swtTestApp.converters

import org.eclipse.e4.xwt.IValueConverter

class C2 extends IValueConverter {
  def getFromType = classOf[ Int ]
  def getToType = classOf[ Int ]
  def convert( a : Any ) = {
    def b =
      a match {
        case null | ""  => 0d
        case a : String => a.toDouble
      }
    def c = math.sqrt( ( b - 0.05 ) / ( 60 - 0.05 ) ) * 1000
    c.toInt.asInstanceOf[ Object ]
  }
  def convertBack( a : Any ) = {
    def b = Option( a ).getOrElse( 0 ).asInstanceOf[ Int ]
    def c = 0.05 + ( 60 - 0.05 ) * math.pow( b / 1000d, 2 )
    ( "%03.02f" format c ).asInstanceOf[ Object ]
  }
}
