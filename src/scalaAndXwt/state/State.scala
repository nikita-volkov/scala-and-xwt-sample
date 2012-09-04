package scalaAndXwt.state

import scala.beans.BeanProperty
import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener
import scalaAndXwt.util.WritableValue

object State {
  @BeanProperty var tasksOpen : Int = new WritableValue(2)
  @BeanProperty var tasksRunning : Int = 6
  @BeanProperty var requestsInterval : Int = 5000

}