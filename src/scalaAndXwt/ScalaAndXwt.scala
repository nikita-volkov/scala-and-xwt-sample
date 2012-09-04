package scalaAndXwt

import org.eclipse.core.databinding.observable.Realm
import org.eclipse.e4.xwt.XWT
import org.eclipse.jface.databinding.swt.SWTObservables
import org.eclipse.swt.widgets.Display

import scalaAndXwt.state.State

object ScalaAndXwt extends App {

  Realm.runWithDefault(
    SWTObservables.getRealm( Display.getDefault() ),
    new Runnable() {
      def run() {

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
    }
  )

}