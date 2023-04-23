package fr.diginamic.jdr;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Character extends Program {
	
	public int lifePoints;
	public int strenght;
	public int score;
	//walking index
	public static int w = 1;
	//idle index
	public static int i = 1;
	
	
	public static double[] currentPos = {0 , 0};
	
	public static Boolean isGameLoaded = false;
	
	
	public Character(int lifePoints, int strenght, int score) {
		this.lifePoints = lifePoints;
		this.strenght = strenght;
		this.score = score;
	}
	
	
	public void attack() {
		
	}
	
	
	public static JLabel getCharacterIdle(int type) {
		
        JLabel character = new JLabel(new ImageIcon("./Warrior_Idle_"+type+".png"));
        character.setSize(new Dimension(400, 400));
        
        

        return character;

	}
	
	
	public static void getCharacterIdleAnim() {
		
	

		 new Timer(250, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					
					Component c = Character.getCharacterIdle(Character.getI());
					
			
					
					
					Character.setI(Character.getI() + 1);
					gameLayer.setLayer(c, 1);


					if (gameLayer.getLayer(c) == 1) {
						// remove for animate the older character
						
						if (gameLayer.getComponentsInLayer(1).length != 0) {
							gameLayer.remove(gameLayer.getComponentsInLayer(1)[0]);
							}
						}

					gameLayer.add(c, 0);
					gameLayer.repaint();
					gameLayer.revalidate();

					
					if (!Character.isGameLoaded) {
						//x
						Character.currentPos[0] = gameLayer.getComponentsInLayer(1)[0].getLocation().getX();
						//y
						Character.currentPos[1] = gameLayer.getComponentsInLayer(1)[0].getLocation().getY();
System.out.println(Arrays.toString(currentPos));
						Character.isGameLoaded = true;
					}
					
						
				if (Character.getI() == 6) {
					Character.setI(1);
				}
				

				}
		
				}).start();	
			
	
	}
	
	public static JLabel getCharacterWalking(int type) {
	     JLabel characterWalking = new JLabel(new ImageIcon("./Warrior_Run_"+type+".png"));
	     characterWalking.setSize(new Dimension(400, 400));
	        
	        

	   return characterWalking;
	
	}


	
	
	public static void moveTo(Point point) {
		
		 new Timer(250, new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					
					Component c_w = Character.getCharacterWalking(Character.getW());
					Character.setW(Character.getW() + 1);
					
					gameLayer.setLayer(c_w, 2);

					

					if (gameLayer.getLayer(c_w) == 2) {
						// remove for animate the older character
						
						if (gameLayer.getComponentsInLayer(2).length != 0) {
							gameLayer.remove(gameLayer.getComponentsInLayer(2)[0]);
							}
						}
					
					
					c_w.setLocation(point);
					
					gameLayer.add(c_w, 1);
					gameLayer.repaint();
					gameLayer.revalidate();
					gameFrame.setContentPane(gameLayer);
													
						
				if (Character.getW() == 8) {
					Character.setW(1);
				}
				

				}
		
				}).start();	
		 
		
	
		
	}
	
	
 
	/**
	 * 
	 * @return idle image index
	 */
	public static int getI() {
		return i;
	}

	public static void setI(int i) {
		Character.i = i;
	}
	
	
	public static int getW() {
		return w;
	}

	public static void setW(int w) {
		Character.w = i;
	}
}
