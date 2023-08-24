// בס"ד בעזה"י

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Console implements KeyListener
{
    /* CONSTANTS */
    private final static int FRAME_WIDTH = 600;
    private final static int FRAME_HEIGHT = 400;
    private final static String CONSOLE_TITLE = "GCMD - Gavriel's Command Line Console";

    /* PARAMETERS */
    private JFrame frame;
    private JPanel panel;
    private Font font;
    private JLabel visualOutput;
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
        char c = e.getKeyChar();
        println((int)(c));
        if(c == '\n')
        {
            this.multilineVisualOutput.write("\n> ");
        }
        else if(65535 == (int)(c))
        {
            /* skip Shifts */
        }
        else
        {
            this.multilineVisualOutput.write(Character.toString(c));
        }

        println((int)c);
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public String toString()
    {
        return "GCMD\nSource code: https://github.com/Gavriel770U";
    }
}