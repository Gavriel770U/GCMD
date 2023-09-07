// בס"ד בעזה"י

/* class to parse the GCMD custom commands */

import java.util.*;

public class Parser
{
    private String[] commands = {" help ", " about ", " echo ", " background ", " exit ", " clear "};
    private MultilineLabel multiline;

    public Parser(MultilineLabel multiline)
    {
        this.multiline = multiline;
    }

    public void highlight()
    {    
        // TEMP: simple highlighting for commands:
        // NOTE: doesn't support multiline command for now, doesn't work good with different commands on the same line.
        for(int i = 0; i < this.multiline.multiline.size(); i++)
        {
            commandSearch: for(String str : this.commands)
            {
                if(this.multiline.multiline.get(i).getText().contains(str))
                {
                    String command = this.multiline.multiline.get(i).getText().replace("<html><nobr>", "").replace("</nobr></html>", "").replace("<font color='blue'>", "").replace("</font>", "").replaceFirst(str, "<font color='blue'>"+str+"</font>");
                    this.multiline.multiline.get(i).setText("<html><nobr>"+command+"</nobr></html>");
                    break commandSearch;
                }
            }
        }

        // String content = this.multiline.getTotalContent();

        // for(String command : this.commands)
        // {
        //     content.replace(command, "<html><nobr><font color='blue'>"+command+"</font></nobr></html>");
        // }

        System.out.println(this.multiline.searchString("echo"));
    }

    public ParserResult parse()
    {
        ArrayList<String> content = this.multiline.getLinesContent();
        String lastCommand = "";
        try {
            lastCommand = content.get(content.size() - 1);
        }
        catch(Exception e)
        {
            /* no existing text */
            lastCommand = "";
        }
        ParserResult result = new ParserResult();

        if(lastCommand.contains(" help "))
        {
            result.setHelpOutput();
        }
        else if(lastCommand.contains(" exit "))
        {
            result.exitFlag=true;
        }
        else if(lastCommand.contains(" echo "))
        {
            result.output = lastCommand.substring(lastCommand.indexOf(" echo ")+" echo ".length()).replace("<html><nobr>", "").replace("</nobr></html>", "").replace("<font color='blue'>", "").replace("</font>", "")+"\n> ";
        }
        else
        {
            result.setErrorOutput();
        }

        return result;
    }
}