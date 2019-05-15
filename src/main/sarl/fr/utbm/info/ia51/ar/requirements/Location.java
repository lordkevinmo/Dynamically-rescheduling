/**
 * 
 */
package fr.utbm.info.ia51.ar.requirements;

import java.awt.geom.Point2D;

/**
 * @author Koffi AGBENYA
 * 
 * This enumeration is the definition of Location. Here, we define Location as
 * an coordinate of a point in the plan. x-coordinate can be considered as 
 * latitude and y-coordinate as longitude.
 * The properties are : 
 * double x : which represent x-coordinate
 * double y : which represent y-coordinate 
 *
 */
public enum Location {
	
	UTBMBELFORT(0d, 0d),
	UTBMSEVENANS(32d, 25d);

	private double x;
	private double y;
	
	Location(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @return the x coordinate
	 */
	public double getX() {
		return this.x;
	}
	
	/**
	 * 
	 * @param x is the value of x-coordinate which we set to Location x property 
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * 
	 * @return the y coordinate
	 */
	public double getY() {
		return this.y;
	}
	
	/**
	 * 
	 * @param y is the value of y-coordinate which we set to location y property 
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Calculate the distance between two locations
	 * @param l location represent the destination where user are going
	 * @return the distance in double value.
	 */
	public double distance(Location l) {
		return Point2D.distance(x, y, l.getX(), l.getY());
	}
}
