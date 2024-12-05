import java.awt.*;
//Author: Roy Rozin   Date: 12/5/2024   Description: Creates method for player (paddle). Includes getter and setter methods that return and set x and y position as well as velocity. 
//Also has draw and move methods.
public class Paddle {
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle(int xPos, int yPos, int width, int height) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		velocity = 1;
	}

	//methods:
	//getter methods
	public int getX() { 
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int getVelocity() {
		return velocity;
	}

	//setter methods

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	//pre-condition: has to be an integer
	//post-condition:adds input of velocityAddition to the velocity variable (increases/decreases velocity)
	public void addVelocity(int velocityAddition) {
		velocity += velocityAddition;
	}
	
	//pre-condition: none
	//post-condition: velocity becomes negative, which reverses the movement of the paddle
	public void reverseVelocity(){
		velocity *= -1;
	}

	//pre-condition: none
	//post-condition: draws the paddle onto the screen with a specific position and dimensions
	public void draw(Graphics g) {
		g.fillRect(xPos, yPos, width, height);
	}
	
	//pre-condition: none
	//post-condition: increases the position of the paddle by the velocity amount (moving the paddle)
	//also decreases/increases velocity towards direction of 0 so that it doesn't speed up infinitely
	public void move(){
		xPos += velocity;
		if (velocity > 0) {
			velocity--;
		}
		else if(velocity < 0) {
			velocity++;
		}
	}
}


