package CompositePattern;

public class TestCompositePattern {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Triangle tri1 = new Triangle();
		Circle cir = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		drawing.draw("Red");
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(cir);
		drawing.draw("Green");
	}

}