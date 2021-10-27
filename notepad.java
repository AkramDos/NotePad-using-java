import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class notepad extends JFrame implements MouseListener{
	TextArea textArea=new TextArea();
	Label L=new Label("File");
	int width=1000;
	int hight=600;
    public notepad() {
    	super("NotePad");
    	this.setLayout(null);
    	this.setSize(width,hight);
    	this.setBackground(new Color(255,255,255));
    	this.setLocationRelativeTo(null);
    	this.setVisible(true);
    	this.show();
    	this.setResizable(false);
    	L.setBounds(0,0,30,20);
    	L.addMouseListener(this);
    	this.add(L);
    	textArea.setBackground(new Color(255,255,255));
    	textArea.setEditable(true);
    	textArea.setLocation(0,20);
    	textArea.setSize(width-8,hight-50);
    	this.add(textArea);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * Invoked when a mouse button has been pressed on a component.
     */
     public void mouseClicked(MouseEvent e)
     {
     	if(e.getSource()==L)
     	{
     		
     	}
     }

    /**
     * Invoked when a mouse button has been pressed on a component.
     */
    public void mousePressed(MouseEvent e)
    {
    	
    }

    /**
     * Invoked when a mouse button has been released on a component.
     */
    public void mouseReleased(MouseEvent e)
    {
    	L.setBackground(new Color(238,238,238));
     	L.setForeground(new Color(0,0,0));
    }

    /**
     * Invoked when the mouse enters a component.
     */
    public void mouseEntered(MouseEvent e)
    {
    	L.setBackground(new Color(0,0,0));
     	L.setForeground(new Color(255,255,255));
    }

    /**
     * Invoked when the mouse exits a component.
     */
    public void mouseExited(MouseEvent e)
    {
    	L.setBackground(new Color(238,238,238));
     	L.setForeground(new Color(0,0,0));
    }
    public static void main (String[] args) {
    	new notepad();
}
    
}