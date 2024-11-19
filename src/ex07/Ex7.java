package ex07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Ex7 {

  private JFrame frame;
  private DiskPanel colorPanel;
  private CurrentColor crrntBckColor = new CurrentColor();
  private CurrentColor crrntForColor = new CurrentColor();

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ex7 window = new Ex7();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Ex7() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel btnPanel = new JPanel();
    frame.getContentPane().add(btnPanel, BorderLayout.NORTH);
    
    JButton btnRed = new JButton("Red");
    btnRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeRed();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnRed);
    
    JButton btnGreen = new JButton("Green");
    btnGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeGreen();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnGreen);
    
    JButton btnBlue = new JButton("Blue");
    btnBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntBckColor.changeBlue();
        colorPanel.setBackground(c);
      }
    });
    btnPanel.add(btnBlue);
    
    colorPanel = new DiskPanel();
    colorPanel.setBackground(Color.BLACK);
    frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
    
    JPanel underBtnPanel = new JPanel();
    frame.getContentPane().add(underBtnPanel, BorderLayout.SOUTH);
    underBtnPanel.setLayout(new GridLayout(2, 1, 0, 0));
    
    JPanel underColorBtnPanel = new JPanel();
    underBtnPanel.add(underColorBtnPanel);
    
    JButton btnFRed = new JButton("fRed");
    underColorBtnPanel.add(btnFRed);
    
    JButton btnFGreen = new JButton("fGreen");
    underColorBtnPanel.add(btnFGreen);
    
    JButton btnFBlue = new JButton("fBlue");
    underColorBtnPanel.add(btnFBlue);
    btnFBlue.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeBlue();
        colorPanel.setForeground(c);
      }
    });
    btnFGreen.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeGreen();
        colorPanel.setForeground(c);
      }
    });
    btnFRed.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Color c = crrntForColor.changeRed();
        colorPanel.setForeground(c);
      }
    });
    
    JPanel CircleSizeBtnPanel = new JPanel();
    underBtnPanel.add(CircleSizeBtnPanel);
    
    JButton btnLargeButton = new JButton("Large");
    btnLargeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(100);
        colorPanel.repaint();
      }
    });
    CircleSizeBtnPanel.add(btnLargeButton);
    
    JButton btnMediumButton = new JButton("Medium");
    btnMediumButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(50);
        colorPanel.repaint();
      }
    });
    CircleSizeBtnPanel.add(btnMediumButton);
    
    JButton btnSmallButton_1 = new JButton("Small");
    btnSmallButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        colorPanel.setRadius(30);
        colorPanel.repaint();
      }
    });
    CircleSizeBtnPanel.add(btnSmallButton_1);
  }

}
