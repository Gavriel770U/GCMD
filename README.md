# GCMD - Gavriel's Command Line Console
__________________________________________________________________
A custom cmd in java using basic built-in swing and awt GUI.
__________________________________________________________________
## How to run?
There are few options.
### IDE
Run `main.java` in your IDE.
### Your OS cmd
Use the following commands from the folder where you have saved the source code:

`javac *.java`

`java main.java`
### Jar
Jar is basically a java executable, in this source in the `build` folder there will be all `.class` files and manifest (`.MF`) with `.jar`, so only if you update the code you can run this.

The current version of the GCMD as `.jar` is inside the `build` folder so you can run it as regular application.

Use the following commands in your OS cmd to create `.jar`:

NOTE: before it, switch your directory to the `src` directory.

`javac -d ../build *.java`

`cd ../build`

`jar cfm GCMD.jar MANIFEST.MF *.class`
### EXE
`.exe` of the current version of the GCMD exists in the source's main branch, and it is the easiest way to run GCMD.

![image](https://github.com/Gavriel770U/GCMD/assets/71229809/235d39dc-0d93-4ea2-b6b3-8c9b6bf50efb)
__________________________________________________________________
## Converting `.jar` To `.exe`
If you updated the code and you have compiled the code and converted it into `.jar` and you want more users to use the version of the GCMD as executable and not as jar without downloading OpenJDK you can download the **[launch4j](https://sourceforge.net/projects/launch4j/)** program in the link below:

Then, when you finished the setup of the program, open it.

Choose the **Basic** section, then in the **Output file** field choose or write the directory with filename in which the `.exe` will be saved.

For instance: `C:\Users\your_user\Desktop\GCMD.exe`

In the **Jar** field choose or write the source `.jar` file that will be copied and converted as `.exe`.

*Optional: in the **Icon** field you can choose `.ico` image to be the icon of the `.exe`*

*NOTE: The original `.ico` of the GCMD is in the source with the `.exe` file.*

__________________________________________________________________
## Features
### Keywords Highlighting 
For now it is very simple and has some issues that should be fixed.
![image](https://github.com/Gavriel770U/GCMD/assets/71229809/e410dc64-79a6-433b-a4a6-4abdbbde113e)
### Commands (Shall be added soon...)
* help
* about
* echo
* background
* exit
