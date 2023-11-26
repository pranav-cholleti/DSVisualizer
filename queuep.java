package dsp;
import java.util.*;
import java.util.Queue;
import java.awt.*;
import java.awt.event.*;
public class queuep extends Frame{
    private Queue<Integer> queue;

    public queuep(Queue<Integer> queue) {
        this.queue = queue;
        setTitle("Queue");
        setSize(400, 400);
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
        int x = 50;
        int y = getHeight()-200;
        int horizontalSpacing = 10;

        Graphics2D g2 = (Graphics2D) g;
        g.setFont(new Font("Consolas", Font.BOLD, 15));
        for (Integer element : queue) {
            g.setColor(Color.BLUE);
            g.fillRect(x,y,50,50);
            g.setColor(Color.WHITE);
            g.drawString(element.toString(),x+20,y+30);
            x+=60;
        }
        if(x>400){
            setSize(x+200,400);
        }
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        g.drawLine(x-(queue.size()*60)-10,y+60,x,y+60);
        g.drawLine(x-(queue.size()*60)-10,y-10,x,y-10);
        g.drawString("F",x-(queue.size()*60)+10,y-30);
        g.drawString("R",x-30,y-30);
    }
}
