package fr.utbm.info.ia51.ar.requirements;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Koffi AGBENYA
 * 
 * This enumeration is the definition of Location. Here, we define Location as
 * an coordinate of a point in the plan. x-coordinate can be considered as
 * latitude and y-coordinate as longitude.
 * The properties are :
 * double x : which represent x-coordinate
 * double y : which represent y-coordinate
 */
@XmlRootElement(name = "Location")
@XmlAccessorType(XmlAccessType.PROPERTY)
@SarlSpecification("0.9")
@SarlElementType(10)
@SuppressWarnings("all")
public class Location {
  private double x;
  
  private double y;
  
  private String name;
  
  public Location() {
  }
  
  public Location(final double x, final double y, final String name) {
    this.x = x;
    this.y = y;
    this.name = name;
  }
  
  /**
   * @return the x coordinate
   */
  @Pure
  public double getX() {
    return this.x;
  }
  
  /**
   * @param x is the value of x-coordinate which we set to Location x property
   */
  @XmlElement(name = "x")
  public void setX(final double x) {
    this.x = x;
  }
  
  /**
   * @return the y coordinate
   */
  @Pure
  public double getY() {
    return this.y;
  }
  
  /**
   * @param y is the value of y-coordinate which we set to location y property
   */
  @XmlElement(name = "y")
  public void setY(final double y) {
    this.y = y;
  }
  
  /**
   * Calculate the distance between two locations
   * @param l location represent the destination where user are going
   * @return the distance in double value.
   * 
   * def public double distance(Location l) {
   * return Point2D.distance(x, y, l.getX(), l.getY());
   * }
   */
  @Pure
  public String getName() {
    return this.name;
  }
  
  @XmlElement(name = "name")
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public String toString() {
    return this.name;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Location other = (Location) obj;
    if (Double.doubleToLongBits(other.x) != Double.doubleToLongBits(this.x))
      return false;
    if (Double.doubleToLongBits(other.y) != Double.doubleToLongBits(this.y))
      return false;
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
    result = prime * result + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
    result = prime * result + Objects.hashCode(this.name);
    return result;
  }
}
