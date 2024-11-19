package ex07;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class DiskPanel extends JPanel {
  int radius=100;
  int getRadius() {
    return radius;
  }
  void setRadius(int r) {
    radius = r;
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Rectangle rect = g.getClip().getBounds();
    int x = (int)rect.getWidth();
    int y = (int)rect.getHeight();
    int center_x = (int)(x/2)-radius;
    int center_y = (int)(y/2)-radius;
    g.fillOval(center_x, center_y, radius*2, radius*2);
  }
}
