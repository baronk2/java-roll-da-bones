/*
Kevin Baron
1/11/13
Roll da Bones Way #2: File Reading
*/

import java.awt.*;
import java.util.Scanner;
import java.io.*;

public class KWBaron_RolldaBones_FileReading {

	public static final int COLUMNWIDTH = 30;
	public static final int COLUMNSPACE = 15;
	
	public static void main(String[] args) throws FileNotFoundException {
		DrawingPanel panel = new DrawingPanel(600, 600);
		Graphics g = panel.getGraphics();
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		g.drawString("Roll da Bones", 250, 60);
		Scanner file = new Scanner(new File("rolldabonesnumbers.txt"));
		g.setFont(new Font("Arial", Font.PLAIN, 16));
		while (file.hasNextInt()) {
			int numRoll = file.nextInt();
			int height = file.nextInt();
			int x = 300 - (5 * COLUMNSPACE + (11 * COLUMNWIDTH / 2))  + (COLUMNWIDTH + COLUMNSPACE) * (numRoll - 2);
			int y = 560 - height;
			g.fillRect(x, y, COLUMNWIDTH, height);
			g.drawString("" + height, x, y - 1);
			g.drawString("" + numRoll, x, 576);
		}//eo while
	}//eo main
	
}//eo class