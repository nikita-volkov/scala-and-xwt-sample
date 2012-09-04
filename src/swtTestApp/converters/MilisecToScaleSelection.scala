package swtTestApp.converters

import org.eclipse.e4.xwt.IValueConverter

class MilisecToScaleSelection extends IValueConverter {
  def getFromType = classOf[ Int ]
  def getToType = classOf[ Int ]
  def convert( a : Any ) =
    milisecToScale(
      Option( a ).getOrElse( 0 ).asInstanceOf[ Int ]
    ).asInstanceOf[ Object ]

  def convertBack( a : Any ) =
    scaleToMilisec(
      Option( a ).getOrElse( 0 ).asInstanceOf[ Int ]
    ).asInstanceOf[ Object ]

  def milisecToScale( a : Int ) =
    math.sqrt( ( a - 50d ) / ( 60000 - 50 ) ) * 1000 toInt

  def scaleToMilisec( a : Int ) =
    50 + ( 60000 - 50 ) * math.pow( a / 1000d, 2 ) toInt
}
