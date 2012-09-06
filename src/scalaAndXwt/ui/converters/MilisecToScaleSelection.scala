package scalaAndXwt.ui.converters

import org.eclipse.e4.xwt.IValueConverter
import scalaAndXwt.state.State

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
    math.pow(
      ( a - State.requestsIntervalMin toDouble ) /
        ( State.requestsIntervalMax - State.requestsIntervalMin ),
      1d / 3
    ) * 1000 toInt

  def scaleToMilisec( a : Int ) =
    State.requestsIntervalMin +
      ( State.requestsIntervalMax - State.requestsIntervalMin ) *
      math.pow( a / 1000d, 3 ) toInt
}
