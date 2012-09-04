package scalaAndXwt.ui

import scala.util.Random

import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Event

import scalaAndXwt.state.State

class Status( parent : Composite, style : Int )
  extends Composite( parent, style ) {
  
  def onRefreshClick( e : Event ) {
    State.tasksRunning.value = Random.nextInt( 100 )
    State.tasksOpen.value = Random.nextInt( 100 )
  }
  
}