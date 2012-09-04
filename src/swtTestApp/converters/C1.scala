package swtTestApp.converters

import org.eclipse.e4.xwt.IValueConverter
import org.eclipse.core.databinding.conversion.IConverter

class C1 extends IValueConverter {
  def getFromType = classOf[ Int ]
  def getToType = classOf[ String ]
  def convert( a : Any ) =
    convert( ( Option( a ) getOrElse 0 ).asInstanceOf[ Int ] )
      .asInstanceOf[ Object ]
  def convert( a : Int ) : String =
    "%05.02f" format ( a / 1000d )
  def convertBack( a : Any ) = ???
}
