package swtTestApp;

import java.net.URL;


import org.eclipse.e4.xwt.IConstants;
import org.eclipse.e4.xwt.XWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class SwtTestApp {

	public static void main(String args[]) throws Exception {
		URL url = SwtTestApp.class.getResource(SwtTestApp.class.getSimpleName()
				+ IConstants.XWT_EXTENSION_SUFFIX);
		Control control = XWT.load(url, new State2());
		Shell shell = control.getShell();
		shell.layout();
		centerInDisplay(shell);
		// run events loop
		shell.open();
		while (!shell.isDisposed()) {
			if (!shell.getDisplay().readAndDispatch())
				shell.getDisplay().sleep();
		}
	}

	private static void centerInDisplay(Shell shell) {
		Rectangle displayArea = shell.getDisplay().getClientArea();
		shell.setBounds(
				displayArea.width / 4, displayArea.height / 4,
				displayArea.width / 4, displayArea.height / 4
				);
	}

}
