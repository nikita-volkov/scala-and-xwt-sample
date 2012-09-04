package scalaAndXwt.state

import scala.beans.BeanProperty

object State {
  @BeanProperty var tasksOpen : Int = 2
  @BeanProperty var tasksRunning : Int = 6
  @BeanProperty var requestsInterval : Int = 5000

}