import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GuggenmosProject03 extends PApplet {

//  Gregory Guggenmos
//  Online API's
//  February, 25th, 2016

XML xml;

public void setup ()
{
  	
  	String url = "http://www.mapsofworld.com/flags/france-flag.html";
  	xml= loadXML ("http://www.yadvashem.org/yv/en/righteous/statistics.asp");

}

public void draw()
{
	background (0);

}

public void loadPage ()
{
}
class Star 
{
	int xoffset= 10;
	int yoffset=8;
	float firstPoint;
	public Star (float initLoc)
	{
	 	firstPoint = initLoc;
	}
	
	public	void drawStar () 
	{
		noFill();
		stroke(255);
		triangle (firstPoint, firstPoint, firstPoint+xoffset, firstPoint+(2*yoffset), firstPoint+(2*xoffset), firstPoint);
		triangle (firstPoint, firstPoint+(yoffset), firstPoint+xoffset, firstPoint-yoffset, firstPoint+(2*xoffset), firstPoint+(yoffset));
	}
}
  public void settings() { 	size(1200, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GuggenmosProject03" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
