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
    }

    public ParserResult(String output)
    {
        this.output = output;
        this.exitFlag = false;
    }

    public ParserResult(String output, boolean exitFlag)
    {
        this.output = output;
        this.exitFlag = exitFlag;
    }
}