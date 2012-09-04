package scalaAndXwt

import org.eclipse.e4.xwt.XWT

import scalaAndXwt.state.State

object ScalaAndXwt extends App {

  val shell =
    XWT.load( getClass.getResource( "ui/MainShell.xwt" ), State )
      .getShell

  shell.layout()

  { // centerInDisplay
    val area = shell.getDisplay.getClientArea
    shell.setBounds( 480, 300, 480, 300 )
  }

  shell.open()

  // manage events
  while ( !shell.isDisposed ) {
    if ( !shell.getDisplay.readAndDispatch() ) {
      shell.getDisplay.sleep();
    }
  }

}