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