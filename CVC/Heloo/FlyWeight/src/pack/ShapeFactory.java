package pack;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Shape> colorMap = new HashMap<String, Shape>();
	public static Shape getCircle(String color) {
		Circle circle = (Circle) colorMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			System.out.println("Creating circle of color:" + color);
		}
		return circle;
	}
}
