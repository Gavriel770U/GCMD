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
The current version of the GCMD as `.jar` 
Use the following commands in your OS cmd to create `.jar`:

NOTE: before it, switch your directory to the `src` directory.

`javac -d ../build *.java`

`cd ../build`

`jar cfm GCMD.jar MANIFEST.MF *.class`
### EXE
soon I will add `.exe` file of the GCMD so everyone will be able to use it.

![image](https://github.com/Gavriel770U/GCMD/assets/71229809/235d39dc-0d93-4ea2-b6b3-8c9b6bf50efb)
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
