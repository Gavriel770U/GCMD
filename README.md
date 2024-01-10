# GCMD - Gavriel's Command Line Console
__________________________________________________________________
A custom cmd / CLI written in java using basic built-in javax.swing and java.awt GUI.
### IMPORTANT NOTE: all the `.exe` files that exists now are for Windows, and there is no guarantee that it will work for other OS such as Linux or macOS.
### IMPORTANT NOTE2: the `.exe` and `.jar` files sometimes will be the older versions of the GCMD until I will be satisfied by the updates before I publish them.
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

| javac -d ../build *.java

| cd ../build

| jar cfm GCMD.jar MANIFEST.MF *.class
### EXE
`.exe` of the current version of the GCMD exists in the source's main branch, and it is the easiest way to run GCMD.

![image](https://github.com/Gavriel770U/GCMD/assets/71229809/235d39dc-0d93-4ea2-b6b3-8c9b6bf50efb)
__________________________________________________________________
## Converting `.jar` To `.exe`
If you updated the code and you have compiled the code and converted it into `.jar` and you want more users to use the version of the GCMD as executable and not as jar without downloading OpenJDK you can download the **[launch4j](https://sourceforge.net/projects/launch4j/)** program.

Then, when you finished the setup of the program, open it.

Choose the **Basic** section, then in the **Output file** field choose or write the directory with filename in which the `.exe` will be saved.

For instance: `C:\Users\your_user\Desktop\GCMD.exe`

In the **Jar** field choose or write the source `.jar` file that will be copied and converted as `.exe`.

*Optional: in the **Icon** field you can choose `.ico` image to be the icon of the `.exe`*

*NOTE: The original `.ico` of the GCMD is in the source with the `.exe` file.*

In the **Java download URL** field write `https://www.java.com/en/download/`

### Example:
![image](https://github.com/Gavriel770U/GCMD/assets/71229809/79eae484-3fde-4a2f-85da-e913e264407f)

Then, go to the **JRE** section and click on it.

In the **Min JRE version** field write `1.4.0`

*Optional: you can select `JDK required` and `64-Bit required`*

### Example:
![image](https://github.com/Gavriel770U/GCMD/assets/71229809/fe974388-f9e8-4513-9c98-0484ad8d4e52)

Then, press on ![image](https://github.com/Gavriel770U/GCMD/assets/71229809/23b481bd-abbb-4b70-8802-6a2a163cecd4) and choose a file directory and name that ends with `.exe` where the output executable shall be saved.
__________________________________________________________________
# Features
## Keywords Highlighting 
For now it is very simple and has some issues that should be fixed.
![image](https://github.com/Gavriel770U/GCMD/assets/71229809/e410dc64-79a6-433b-a4a6-4abdbbde113e)
## Commands (Shall be added soon...)
### * help
Command that prints the list of commands and what do they do.
* about
### * echo
Command that prints all the text after the echo command, like real echo.
* background
### * exit
Command that exists the GCMD.
* clear
### Preview
![image](https://github.com/Gavriel770U/GCMD/assets/71229809/cc4325c8-7082-4128-9120-47a6f023dedd)

