
//GraphicsLab07st.java
//This is the Student Version of the GraphicsLab07 assignment.


import java.awt.*;
import java.applet.*;



public class why extends Applet
{	
	
	
	public void paint(Graphics g)
	{
		 g.fillRect(0, 100, 200, 200);
	}
	
	public void drawSquare(Graphics g, int x, int y, int length, int width)
	{
		 boolean ok = checkDims(x, width);
		    if(!ok) return;
		g.drawRect(x + width + 10, y, (int) (width + (width * .75)), (int) (length + (length * .75)));
		int newX = x + width + 10;
		int newY = 100;
		int newLength = (int) Math.round(length * .75);
		int newWidth = (int) Math.round(width * .75);
		g.setColor(Color.BLACK);
		drawSquare(g, newX, newY, newWidth, newLength);
	}
	
	boolean checkDims(int x, int width) 
	{
	    if(width<4 && x+width<1000)
	 
	    return true;
		return false;
		 
	}
}



