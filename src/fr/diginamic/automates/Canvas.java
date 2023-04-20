package fr.diginamic.automates;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	public final Dimension slot;
	public Grid grid;

	public Canvas(final Dimension size, final Dimension slot, Grid grid) {
		this.slot = slot;
		this.grid = grid;

		setPreferredSize(size);
	}

	public void paintComponent(final Graphics graphics) {

		final Graphics2D ctx = (Graphics2D) graphics;
		ctx.scale(slot.width, slot.height);
		ctx.setColor(Color.WHITE);
		ctx.clearRect(0, 0, grid.width, grid.height);
		ctx.setColor(Color.BLACK);

		for (int i = 0; i < JeuDeLaVie.WIDTH; i++) {
			for (int j = 0; j < JeuDeLaVie.HEIGHT; j++) {
				if (!grid.grid[i][j])
					continue;
				ctx.fillRect(i, j, 1, 1);
			}
		}
	}

	public void play() {
		final boolean[][] nextGrid = new boolean[JeuDeLaVie.WIDTH][JeuDeLaVie.HEIGHT];

		for (int i = 0; i < JeuDeLaVie.WIDTH; i++) {
			for (int j = 0; j < JeuDeLaVie.HEIGHT; j++) {
				nextGrid[i][j] = grid.leaveOrDie(grid.getNeighbors(i, j), grid.grid[i][j]);
			}
		}

		grid.grid = nextGrid;
		repaint();
	}
}