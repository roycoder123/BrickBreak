import java.awt.*;
//Author: Roy Rozin   Date: 12/5/2024   Description: Creates methods for the ball. Includes getter and setter methods that return and set x and y position as well as velocity. 
//Also has draw and move methods.
public class Ball {
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int xVelocity;
	private int yVelocity;
	private int size;
	

	//constructor(s):
	public Ball(int xPos, int yPos, int size) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.size = size;
		xVelocity = 1;
		yVelocity = 1;
	}

	//methods:

	//getter methods
	public int getXpos(){
		return xPos;
	}

	public int getYpos(){
		return yPos;
	}

	public int getSize(){
		return size;
	}

	//setter methods
	public void setX(int x){
		xPos = x;
	}

	public void setY(int y){
		yPos = y;
	}

	public void setXVelocity(int xVelocity){
		this.xVelocity = xVelocity;
	}

	public void setYVelocity(int yVelocity){
		this.yVelocity = yVelocity;
	}

	//pre-condition: none
	//post-condition: reverses the x-velocity of the ball by multiplying it by -1
	public void reverseX(){
		xVelocity *= -1;
	}
	
	//pre-condition: none
	//post-condition: reverses the y-velocity of the ball by multiplying it by -1
	public void reverseY(){
		yVelocity *= -1;
	}	

	//pre-condition: none
	//post-condition: draws the ball onto the screen with a specific position and dimensions
	public void draw(Graphics g) {
		g.fillOval(xPos, yPos, size, size);
	}

	//pre-condition: none
	//post-condition: increases the position of the ball by the x and y velocity amount (moving the ball)
	public void move(){
		xPos += xVelocity;
		yPos += yVelocity;
	}
}
