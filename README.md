#Introduction to XWT
XWT is an XML wrapper around SWT graphical user interface framework for JVM developed by Eclipse Foundation. It provides the user with ability to write UI in a completely declarative style and clearly decouples the presentation and business logic of the application. It beats the hell out of Scala's messy Swing library and without any doubt the Swing itself. If you have ever heard about such technologies as Flex (MXML), XUL or XAML, XWT is very similar.

#Project Status
This project covers advanced features such as components composition, state (model) management, event handling and data binding. It is tested with Scala 2.10. 

#Issues

##Main thread on Mac
Due to [this issue](http://stackoverflow.com/q/3976342/485115) you'll have to append `-XstartOnFirstThread` to VM parameters in your run configuration.

##No jars for platforms other than Mac included in project's repository
Currently this distribution includes only `org.eclipse.swt.cocoa.macosx` library of all SWT libraries for different platforms. To be able to run this project on platforms other than Mac you'll have to provide it with the appropriate jar or just use the Eclipse-plugin version of this project maintained on the `develop` and `master` branches.

[There is](http://swt-repo.googlecode.com/) a Google Code project hosting the latest SWT artifacts. You can choose an artifact for your platform from [this list](http://swt-repo.googlecode.com/svn/repo/org/eclipse/swt/).

#Useful Links
Unfortunately there's not much decent documentation on XWT around yet, so I grouped the links I found useful while exploring this technology:

* [Presentation](http://wiki.eclipse.org/images/a/ab/XWT.pdf)
* [Main Doc](http://wiki.eclipse.org/E4/XWT)
* [Rules, Events, Namespaces](http://wiki.eclipse.org/E4/XWT/SWT2XWT)
* http://www.ibm.com/developerworks/opensource/library/os-eclipse-e4/
* http://www.dvteclipse.com/documentation/e/SWT.2FXML_Reference.html
* https://github.com/basicsharp/EightPuzzle/wiki/Installing-XWT-GUI-Framework-on-Eclipse-3.7-Indigo
* [SWT Widgets Listing](http://www.eclipse.org/swt/widgets/)