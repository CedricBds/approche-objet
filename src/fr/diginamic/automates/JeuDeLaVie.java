package fr.diginamic.automates;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * @author squad
 *
 */
public class JeuDeLaVie {
	static int WIDTH = 50;
	static int HEIGHT = 50;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Game of life");
		//frame.setSize(5 * WIDTH, 5 * HEIGHT);
		frame.setVisible(true);
		//frame.setResizable(true);
        JSlider s = new JSlider();
        s.setPreferredSize(new Dimension(JeuDeLaVie.WIDTH, JeuDeLaVie.HEIGHT));
        
        frame.add(s, BorderLayout.NORTH);
        
		Grid grid = new Grid(WIDTH, HEIGHT);
		Dimension dim = new Dimension(10 * WIDTH,10 * HEIGHT);
		Dimension slot = new Dimension(10, 10);
		Canvas canvas = new Canvas(dim, slot, grid);
		frame.add(canvas, BorderLayout.SOUTH);
        
		frame.pack();

        
		for(;;){
			canvas.play();
			try{

				Thread.sleep(s.getValue() * 50);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

}