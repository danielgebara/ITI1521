package LAB5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI extends JFrame implements ActionListener {
    public static final int MAX_POINTS = 10;
    private Point[] tabPoints = new Point[MAX_POINTS];
    private int number = 0;
    private JPanel draw;
    public static final int DRAW_SIZE = 400;
    private Color changeColorDraw = Color.BLACK;
   
    public GUI(){
       super("GUI 6");
       setSize(DRAW_SIZE, DRAW_SIZE);
        
        JPanel panneau1 = new JPanel();
        panneau1.setBackground(Color.BLUE);
        add(panneau1, BorderLayout.NORTH);
        
        JButton bouton1, bouton2;
        bouton1 = new JButton("Shape");
        bouton1.addActionListener(this);
        panneau1.add(bouton1);

        bouton2 = new JButton("Quit");
        bouton2.addActionListener(this);
        panneau1.add(bouton2);

        draw = new DrawPanel();
        draw.setBackground(Color.WHITE);
        add(draw, BorderLayout.CENTER); 
              
        setJMenuBar(createMenu());
        
         setDefaultCloseOperation(EXIT_ON_CLOSE);
   
  }
        JMenuBar createMenu() {
        JMenuBar bar = new JMenuBar();
        
        JMenu menu = new JMenu("Color Menu");
        bar.add(menu);
        
        JMenuItem item = new JMenuItem("Black");
        item.addActionListener(this);
        menu.add(item);
        
        item = new JMenuItem("Red");
        item.addActionListener(this);
        menu.add(item);
        
        item = new JMenuItem("Green");
        item.addActionListener(this);
        menu.add(item);
        
        item = new JMenuItem("Blue");
        item.addActionListener(this);
        menu.add(item);
        
        return bar;
    }

   public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (number < MAX_POINTS) {
            Point p = new Point((int) (Math.random() * DRAW_SIZE), (int) (Math.random() * DRAW_SIZE));
            addPoint(p);
            draw.repaint();
        } else if (cmd.equals("Quit")) {
            System.exit(0);
        } else if (cmd.equals("Black")) {
            changeColorDraw = Color.BLACK;
            draw.repaint();
        } else if (cmd.equals("Red")) {
            changeColorDraw = Color.RED;
            draw.repaint();
        } else if (cmd.equals("Green")) {
            changeColorDraw = Color.GREEN;
            draw.repaint();
        } else if (cmd.equals("Blue")) {
            changeColorDraw = Color.BLUE;
            draw.repaint();
        }
    }


   private void addPoint(Point p) {
        if (number < MAX_POINTS)
            tabPoints[number++] = p;
    }

    private class DrawPanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(changeColorDraw);
            for (int i = 0; i < number-1; i++) {
                Point p1 = tabPoints[i];
                Point p2 = tabPoints[i + 1];
                g.drawLine(p1.x, p1.y, p2.x, p2.y);
            }
        }
    }

   
   public static void main(String[] args) {
     GUI gui;
     gui = new GUI();
     gui.setVisible(true);
  }
}
