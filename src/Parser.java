// בס"ד בעזה"י

/* class to parse the gcmd custom commands */

import java.util.*;

public class Parser
{
    private String[] commands = {"help", "about", "echo", "background", "exit"};
    private MultilineLabel multiline;

    public Parser(MultilineLabel multiline)
    {
        this.multiline = multiline;
    }

    public ParserResult parse()
    {
        boolean start = true; 

        if(start)
        {

        }
        else
        {

        }

        // TEMP: simple highlighting for commands:
        // NOTE: doesn't support multiline command for now, doesn't work good with different commands on the same line.
        for(int i = 0; i<this.multiline.multiline.size(); i++)
        {
            for(String str : commands)
            {
                if(this.multiline.multiline.get(i).getText().contains(str))
                {
                    String command = this.multiline.multiline.get(i).getText().replace("<html><nobr>", "").replace("</nobr></html>", "").replace("<font color='blue'>", "").replace("</font>", "").replace(str, "<font color='blue'>"+str+"</font>");
                    this.multiline.multiline.get(i).setText("<html><nobr>"+command+"</nobr></html>");
                }
            }
        }
        return null;
    }
}