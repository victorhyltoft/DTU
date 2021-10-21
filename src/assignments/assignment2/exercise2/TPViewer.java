package assignments.assignment2.exercise2;

import javax.swing.*;
import java.awt.*;

public class TPViewer {

	static JFrame viewer;
	static JPanel panel;
	static int[][] array;
	static final int CELLSIZE = 20;


	public static void main(String[] args) {
		// CHANGE VALUES IN THE NEXT THREE LINES 
		int width = 44;
		int height = 28;
		int[] initial = { 0 };
		//-------------------------------------

		TrianglePattern tp = new TrianglePattern(width, height, initial);
		init();
		run(tp);
	}

	private static void init() {
		viewer = new JFrame();
		panel = new JPanel() {
			public void paintComponent(Graphics gr) {
				super.paintComponent(gr);
				int width = panel.getWidth();
				int height = panel.getHeight();
				int noofrows = array.length;
				int noofcols = array[0].length;
				int cellwidth = width / noofcols;
				int cellheight;
				cellwidth = CELLSIZE;
				cellheight = CELLSIZE;
				gr.setColor(Color.BLACK);
				for (int r = 0; r < array.length; r++) {
					for (int c = 0; c < array[0].length; c++) {
						if (array[r][c] == 0) {
							gr.drawRect(c * cellwidth, r * cellheight,
									cellwidth, cellheight);
						} else {
							gr.fillRect(c * cellwidth, r * cellheight,
									cellwidth, cellheight);
						}

					}
				}
			}

		};

		panel.setBackground(Color.white);

		viewer.getContentPane().add(panel);

		viewer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewer.setLocation(50, 50);
		viewer.setSize(1100, 600);

	}

	private static void run(TrianglePattern tp) {
		viewer.setVisible(true);
		array = new int[tp.getH()][tp.getN()];
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[0].length; c++) {
				array[r][c] = tp.getValueAt(r, c);

			}
		}

		panel.repaint();

	}

}
