package fr.diginamic.jdr;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class Program  {
	
	
	public static JLayeredPane gameLayer = new JLayeredPane();

    public static Character character = new Character(50, 50, 50);
    public static JFrame gameFrame = new JFrame();


	
	public static void main(String args[]) throws Exception {
		
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		JFrame frame = new JFrame();
		frame.setTitle("Cellda - Menu");
		
		
		 JButton startButton = new JButton("Start Game");
		  JPanel panel = new JPanel();

		  Icon imgicon = new ImageIcon("./epees.png");
		  
		 startButton.setPreferredSize(new Dimension(300, 50));
		 startButton.setIcon(imgicon);
		 panel.add(startButton);
		 
		  frame.add(panel, BorderLayout.CENTER);

		  frame.pack();
		  

		  
		  
		  //frame.setLocationRelativeTo(null);
		  
		  frame.setVisible(true);
		 
		 //Detecter le click du btn et mettre a disabled
		  startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			startButton.setVisible(false);
		
			//startGame
			Program.loadGame();

			}
			
		
			  
		  });
		 
	
		
	}
	
	public static void loadGame() {
		
		//center the frame
	        JLabel background = new JLabel(new ImageIcon("./bg.png"));
	        background.setSize(new Dimension(400, 400));
	        // add character
		       
	       

	 
	       gameFrame.setSize(new Dimension(400, 400));
	       
	       gameLayer.setLayer(background, 0);
	       gameLayer.add(background);
	        gameFrame.setContentPane(gameLayer);
	        

	       gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       gameFrame.setVisible(true);
	       gameFrame.setTitle("Cellda - Game");
	       
	       // add mouse listener to the frame
	       
	       gameFrame.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getPoint().getX());
				System.out.println(e.getPoint().getY());
				Character.moveTo(e.getPoint());
				gameFrame.repaint();
				gameFrame.validate();
				

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
	    	   
	       });
	       
			
			Character.getCharacterIdleAnim();
			
	}
	
	
	
}
