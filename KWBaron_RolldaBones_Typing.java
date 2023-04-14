/*
Kevin Baron
1/10/13
Roll da Bones Way #1: Typing
*/

import java.awt.*;
import java.util.Scanner;

public class KWBaron_RolldaBones_Typing {

	public static final int COLUMNWIDTH = 20;
	public static final int COLUMNSPACE = 10;
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(600, 600);
		Graphics g = panel.getGraphics();
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		g.drawString("Roll da Bones", 250, 60);
		Scanner console = new Scanner(System.in);
		g.setFont(new Font("Arial", Font.PLAIN, 16));
		for (int i = 2; i <= 12; i++) {
			System.out.print("How many " + i + "'s rolled? ");
			int height = console.nextInt();
			int x = 300 - (5 * COLUMNSPACE + (11 * COLUMNWIDTH / 2))  + (COLUMNWIDTH + COLUMNSPACE) * (i - 2);
			int y = 560 - height;
			g.fillRect(x, y, COLUMNWIDTH, height);
			g.drawString("" + height, x, y - 1);
			g.drawString("" + i, x, 576);
		}//eo for
	}//eo main
	
}//eo class