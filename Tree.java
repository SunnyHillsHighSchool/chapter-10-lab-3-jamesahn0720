//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas
{
	public Tree()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.drawString("Lab14h - Tree Lab", 50, 50);
		
		tree(window);
		star(window);



	}
	
	public void tree(Graphics window)
	{
		int[] treeXPoints = {400,200,600};
		int[] treeYPoints = {100,500,500};
		Polygon tree = new Polygon(treeXPoints,treeYPoints,treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);
		
		window.setColor(Color.BLACK);
    window.fillRect(380,500,40,50);

    window.setColor(Color.BLUE);
    window.fillOval(405,160,20,20);
    window.fillOval(375,280,20,20);
    window.fillOval(350,430,20,20);
    window.setColor(Color.RED);
    window.fillOval(455,265,20,20);
    window.fillOval(340,315,20,20);
    window.fillOval(440,375,20,20);
    window.setColor(Color.YELLOW);
    window.fillOval(425,220,20,20);
    window.fillOval(260,435,20,20);
    window.fillOval(325,445,20,20);
    window.setColor(Color.ORANGE);
    window.fillOval(355,385,20,20);
    window.fillOval(415,455,20,20);
    window.fillOval(510,453,20,20);


	}

	public void star(Graphics window)
	{


int[] starXPoints = {400,390,370,390,380,400,420,410,430,410};
		int[] starYPoints = {75,95,95,100,120,110,120,100,95,95};
    Polygon star = new Polygon(starXPoints,starYPoints,starYPoints.length);
    window.setColor(Color.YELLOW);
		window.fillPolygon(star);


	}
}
