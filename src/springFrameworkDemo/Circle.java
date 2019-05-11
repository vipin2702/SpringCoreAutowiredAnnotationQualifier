package springFrameworkDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {

	private Point center;
	
	
	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("pq")
	public void setCenter(Point centers) {
		this.center = centers;
	}


	public void draw() {
		System.out.println("Circle drawn with center:\n"
				+ getCenter().getX() + "," +getCenter().getY());
	}

}
