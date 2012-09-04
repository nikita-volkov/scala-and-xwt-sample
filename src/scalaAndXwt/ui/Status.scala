package scalaAndXwt.ui
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Event
import scalaAndXwt.state.State
import scala.util.Random

class Status( parent : Composite, style : Int )
  extends Composite( parent, style ) {
  def onRefreshClick( e : Event ) {
    State.tasksRunning = Random.nextInt( 100 )
    State.tasksOpen = Random.nextInt( 100 )
    println( State.tasksOpen )
    
  }
}