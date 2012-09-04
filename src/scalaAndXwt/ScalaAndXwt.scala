package scalaAndXwt

import java.net.URL
import org.eclipse.e4.xwt.IConstants
import org.eclipse.e4.xwt.XWT
import org.eclipse.swt.graphics.Rectangle
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.Shell
import reflect.runtime._
import scalaAndXwt.state.State

object ScalaAndXwt extends App {

  val shell =
    XWT.load( getClass.getResource( "ui/MainShell.xwt" ), new State )
      .getShell
  //    XWT.load(
  //      getClass.getResource(
  //        currentMirror.reflect( ScalaAndXwt.this ).symbol.name +
  //          IConstants.XWT_EXTENSION_SUFFIX
  //      ),
  //      new State
  //    ).getShell

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