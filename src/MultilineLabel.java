// בס"ד בעזה"י

/* class to work with several labels as one big text */

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class MultilineLabel
{
    private final static String FIRST_OUTPUT = "> ";

    public ArrayList<JLabel> multiline = new ArrayList<>();
    private Font font;
    private int frameWidth;
    private int currentLine;

    public MultilineLabel(JPanel panel, int frameWidth, int frameHeight, Font font)
    {
        this.font = font;
        this.frameWidth = frameWidth;
        this.currentLine = 0;

        /* Initialize multiline label ArrayList */

        boolean start = true;
        FontMetrics fontMetrics = panel.getFontMetrics(font);
        int fontHeight = fontMetrics.getHeight();

        for (int i = 0; i < frameHeight / fontHeight; i++)
        {
            JLabel label = new JLabel("");
            label.setSize(frameWidth, fontHeight);
            label.setLocation(0, fontHeight * i);
            label.setForeground(Color.WHITE);
            label.setFont(font);
            if (start)
            {
                label.setText(FIRST_OUTPUT);
                start = false;
            }
            this.multiline.add(label);
            panel.add(this.multiline.get(i));
        }
    }

    private int calcStringWidth(String str, Font font)
    {
        FontMetrics fontMetrics = multiline.get(0).getFontMetrics(font);
        int totalWidth = 0;

        for (char c : str.toCharArray())
        {
            totalWidth += fontMetrics.charWidth(c);
        }

        return totalWidth;
    }

    public void write(String input)
    {
        FontMetrics fontMetrics = multiline.get(0).getFontMetrics(this.font);
        // initialize with the width of the current line that is already filled
        String adj = this.multiline.get(this.currentLine).getText().replace("<html><nobr>", "").replace("</nobr></html>", "").replace("<font color='blue'>", "").replace("</font>", "");
        int totalWidth = calcStringWidth(adj, this.font);

        for (char c : input.toCharArray())
        {
            int charWidth = fontMetrics.charWidth(c);
            if (totalWidth + charWidth > frameWidth || c == '\n')
            {
                currentLine++;
                totalWidth = 0;
                if (currentLine >= multiline.size()) 
                {
                    // No more lines left, stop writing
                    return;
                }
            }

            this.multiline.get(this.currentLine).setText(this.multiline.get(this.currentLine).getText() + c);
            totalWidth += charWidth;
        }
    }

    // TEMP: delete characters from the multiline
    /** NOTE: has some issues: deletes '>' that cannot be deleted, 
              issues with the highlighted commands (HTML),
              and others...
    */

    public void delete(int amount)
    {
        for(int i = 0; i<amount; i++)
        {
            String lineContent = this.multiline.get(this.currentLine).getText();
            if(lineContent.length() - 1 < 0)
            {
                this.currentLine--;
                lineContent = this.multiline.get(this.currentLine).getText();
            }
            lineContent = lineContent.substring(0, lineContent.length()-1);
            this.multiline.get(this.currentLine).setText(lineContent);
        }
    }

    public void clear()
    {
        this.currentLine = 0;
        for(int i = 0; i < this.multiline.size(); i++)
        {
            this.multiline.get(i).setText("");
        }
    } 

    public String getTotalContent()
    {
        String totalContent = "";
        
        for(int i = 0; i < this.multiline.size(); i++)
        {
            totalContent += this.multiline.get(i).getText();
        }

        return totalContent;
    }
}