
public class Main {

	public static void main(String[] args) {
		Polygon polygon = new Polygon();
		System.out.println("Empty: " + polygon);
		polygon.add(new Point(1, 2));
		polygon.add(new Point(3, 10)) ;
		polygon.add(new Point(5, 4));
		System.out.println("Triangle: " + polygon);
		polygon.delete(0);
		System.out.println ("Segment: " + polygon);
		System.out.println("First vertex: " + polygon.getVertex(0));
		System.out.println("Get missing vertex");
		polygon.getVertex(5);
	}

}
