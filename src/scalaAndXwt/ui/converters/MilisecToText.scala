package scalaAndXwt.ui.converters

import org.eclipse.e4.xwt.IValueConverter
import org.eclipse.core.databinding.conversion.IConverter

class MilisecToText extends IValueConverter {
  def getFromType = classOf[ Int ]
  def getToType = classOf[ String ]
  def convert( a : Any ) =
    convert(
      ( Option( a ) getOrElse 0 ).asInstanceOf[ Int ]
    ).asInstanceOf[ Object ]
  def convert( a : Int ) : String =
    "%03.02f" format ( a / 1000d )
  def convertBack( a : Any ) =
    convertBack(
      a match {
        case null | ""  => 0d
        case a : String => a.toDouble
      }
    ).asInstanceOf[ Object ]
  def convertBack( a : Double ) =
    a * 1000 toInt
}
