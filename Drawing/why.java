
//GraphicsLab07st.java
//This is the Student Version of the GraphicsLab07 assignment.


import java.awt.*;
import java.applet.*;



public class why extends Applet
{	
	boolean checkDims(int x, int width) 
	{
	    if(width<4 && x+width<1000)
	    return true;
	}
	
	public void paint(Graphics g)
	{
		 boolean ok = checkDims(x, width);
		    if(!ok) return;
		    x = 0;
		    
		g.drawRect(x, y, width, length);
		int newX = x + width + 10;
		int newY = 100;
		int newLength = (int) Math.round(length * .75);
		int newWidth = (int) Math.round(width * .75);
		g.setColor(Color.BLACK);
		drawSquare(g, newX, newY, newWidth, newLength);
	}
	
	
}



