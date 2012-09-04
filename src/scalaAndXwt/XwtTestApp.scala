package scalaAndXwt

import java.net.URL;

import org.eclipse.e4.xwt.IConstants;
import org.eclipse.e4.xwt.XWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

class XwtTestApp {

}
object XwtTestApp extends App {

  val shell =
    XWT.load(
      getClass.getResource(
        reflect.runtime.currentMirror.reflect( this ).symbol.name +
          IConstants.XWT_EXTENSION_SUFFIX
      ),
      new State
    ).getShell

  shell.layout()

  { // centerInDisplay
    val area = shell.getDisplay.getClientArea
    shell.setBounds( area.width / 4, area.height / 4, area.width / 4, area.height / 4 )
  }

  shell.open()

  // manage events
  while ( !shell.isDisposed ) {
    if ( !shell.getDisplay.readAndDispatch() ) {
      shell.getDisplay.sleep();
    }
  }

}