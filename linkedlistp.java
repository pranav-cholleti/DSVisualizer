package dsp;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class linkedlistp extends Frame{
    private LinkedList<Integer> linkedList;

    public linkedlistp(LinkedList<Integer> ll) {
        this.linkedList = ll;
        setTitle("LinkedList");
        setSize(600, 400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        int x = 120;
        int y = 250;
        Graphics2D g2 = (Graphics2D) g;
        g.setFont(new Font("Consolas", Font.BOLD, 20));
        g.drawString("HEAD", x-80, y + 25);
        for (Integer element : linkedList) {
            g.setFont(new Font("Consolas", Font.BOLD, 20));
            g.setColor(Color.BLACK);
            g.drawString("->", x-25, y + 25);
            g.setColor(Color.ORANGE);
            g.fillRect(x, y, 100, 40);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Consolas", Font.BOLD, 15));
            g.drawString(element.toString(), x + 40, y + 25);
            x += 130;
        }
        if(x>600){
            setSize(x+200,400);
        }
        g.setFont(new Font("Consolas", Font.BOLD, 20));
        g.setColor(Color.BLACK);
        g.drawString("->", x-25, y + 25);
        g.setFont(new Font("Consolas", Font.BOLD, 20));
        g.drawString("NULL", x, y + 25);

        // Drawing arrows to indicate the next pointer
        g.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2));
    }
}
