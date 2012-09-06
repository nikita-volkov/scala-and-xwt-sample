package scalaAndXwt.state

import scala.beans.BeanProperty

import scalaAndXwt.util.WritableValue

object State {
  @BeanProperty val tasksOpen = new WritableValue( 2 )
  @BeanProperty val tasksRunning = new WritableValue( 4 )
  @BeanProperty var requestsInterval = 5000
  @BeanProperty val requestsIntervalMin = 50
  @BeanProperty val requestsIntervalMax = 60000 * 5
}