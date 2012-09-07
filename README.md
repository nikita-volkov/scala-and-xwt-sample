#Scala and XWT
This is a sample project covering the most important aspects of integration of Scala and XWT such as components composition, state (model) management, event handling and data binding. It is tested with Scala 2.10. 

##Introduction to XWT
XWT is an XML wrapper around SWT graphical user interface framework for JVM developed by Eclipse Foundation. It provides the user with ability to write UI in a completely declarative style and clearly decouples the presentation and business logic of the application. It beats the hell out of Scala's messy Swing library and without any doubt the Swing itself. If you have ever heard about such technologies as Flex (MXML), XUL or XAML, XWT is very similar.

##Issues

###Current `pom` version is configured to run on 64-bit OSX
This is due to conflicts that arise when jars targeted at different platforms are present in the classpath. To be able to run this on other platforms, uncomment the appropriate library in the `pom` or just use the Eclipse-plugin version of the project, which is maintained on the `develop` and `master` branches. 

###Main thread on OSX
Due to [this issue](http://stackoverflow.com/q/3976342/485115) you'll have to append `-XstartOnFirstThread` to VM parameters in your run configuration.

##Useful Links
Unfortunately there's not much decent documentation on XWT around yet, so I grouped the links I found useful while exploring this technology:

* [Presentation](http://wiki.eclipse.org/images/a/ab/XWT.pdf)
* [Main Doc](http://wiki.eclipse.org/E4/XWT)
* [Rules, Events, Namespaces](http://wiki.eclipse.org/E4/XWT/SWT2XWT)
* http://www.ibm.com/developerworks/opensource/library/os-eclipse-e4/
* http://www.dvteclipse.com/documentation/e/SWT.2FXML_Reference.html
* https://github.com/basicsharp/EightPuzzle/wiki/Installing-XWT-GUI-Framework-on-Eclipse-3.7-Indigo
* [SWT Widgets Listing](http://www.eclipse.org/swt/widgets/)