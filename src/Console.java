// בס"ד בעזה"י

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* GCMD Console class */

public class Console implements KeyListener
{
    /* CONSTANTS */
    private final static int FRAME_WIDTH = 600;
    private final static int FRAME_HEIGHT = 400;
    private final static String CONSOLE_TITLE = "GCMD - Gavriel's Command Line Console";

    private final static int NEWLINE_CHAR = '\n';
    private final static int SHIFT_INT_VALUE = 65535;
    private final static int BACKSPACE_INT_VALUE = 8;
    private final static int EMPTY_STRING_LENGTH = 0;
    private final static int DEC = 1;
    private final static int ZERO_INDEX = 0;

    /* PARAMETERS */
    private JFrame frame;
    private JPanel panel;
    private Font font;
    private MultilineLabel multilineVisualOutput;
    private String output = "> ";
    private Parser parser;

    /* FUNCTIONS */
    private <T> void print(T info)
    {
        System.out.print(info);
    }

    private <T> void println(T info)
    {
        System.out.println(info);
    }

    private void initPanel(JPanel panel)
    {
        panel.setBackground(Color.BLACK);
        panel.setLayout(null);
    }

    private void initFrame(JFrame frame, JPanel panel)
    {
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(CONSOLE_TITLE);
        frame.add(panel);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    public Console()
    {
        this.panel = new JPanel();
        initPanel(this.panel);

        this.font = new Font("Consolas", Font.PLAIN, 16);

        this.multilineVisualOutput = new MultilineLabel(this.panel, FRAME_WIDTH, FRAME_HEIGHT, this.font);

        this.parser = new Parser(this.multilineVisualOutput);

        this.frame = new JFrame();
        initFrame(this.frame, this.panel);
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        this.multilineVisualOutput.clear();
        char c = e.getKeyChar();
        println((int)(c));
        if(NEWLINE_CHAR == c)
        {
            this.output += "\n> ";
            //this.multilineVisualOutput.write("\n> ");
        }
        else if(SHIFT_INT_VALUE == (int)(c))
        {
            /* skip Shifts */
        }
        else if(BACKSPACE_INT_VALUE == (int)(c))
        {
            if(this.output.length() > EMPTY_STRING_LENGTH)
            {
                /* Backspace has been pressed */
                this.output = this.output.substring(ZERO_INDEX, this.output.length() - DEC);
                //this.multilineVisualOutput.delete(1);
            }
        }
        else
        {
            this.output += c;
            //this.multilineVisualOutput.write(Character.toString(c));
        }

        this.multilineVisualOutput.write(this.output);
        this.parser.highlight();

        println((int)c);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public String toString()
    {
        return "GCMD\nSource code: https://github.com/Gavriel770U/GCMD";
    }
}