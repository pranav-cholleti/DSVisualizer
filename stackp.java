package dsp;
import java.util.Stack;
import java.awt.*;
import java.awt.event.*;

public class stackp extends Frame{
    private Stack<Integer> stack;
    public stackp(Stack<Integer> stack) {
        this.stack = stack;
        setTitle("Stack");
        setSize(400,stack.size()*50 + 200);
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
        int x = 100;
        int y = getHeight() - 120;
        Graphics2D g2 = (Graphics2D) g;
        for (Integer element : stack) {
            g.setColor(Color.BLUE);
            g.fillRect(x, y, 100, 40);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Consolas", Font.BOLD, 15));
            g.drawString(element.toString(), x + 40, y + 25);
            y -= 50;
        }
        g.setColor(Color.RED);
        g2.setStroke(new BasicStroke(2));
        int m[]={x-30,x-30,x+130,x+130};
        int n[]={y+30,y+(stack.size()*50)+50,y+(stack.size()*50)+50,y+30};
        for (int i = 0; i < 3; i++) 
            g.drawLine(m[i], n[i], m[i + 1], n[i + 1]);
        }
}
