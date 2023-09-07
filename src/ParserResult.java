// בס"ד בעזה"י

import java.util.*;

public class ParserResult
{
    public String output;
    public boolean exitFlag;
    public boolean clearFlag;

    public ParserResult()
    {
        this.output = "";
        this.exitFlag = false;
        this.clearFlag = false;
    }

    public ParserResult(String output)
    {
        this.output = output;
        this.exitFlag = false;
        this.clearFlag = false;
    }

    public ParserResult(String output, boolean exitFlag)
    {
        this.output = output;
        this.exitFlag = exitFlag;
        this.clearFlag = false;
    }

    public void setHelpOutput()
    {
        this.output = " about - information about this program\n" + " echo - echo a string to the console\n" + " exit - exit the program\n> ";
    }

    public void setErrorOutput()
    {
        this.output = "command not found";
    }
}