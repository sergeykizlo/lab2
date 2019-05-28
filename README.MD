# Lab 2
##### Create a Polygon class. A polygon is defined by sequence of vertices.
- It shall be possible to create an empty polygon and then add vertices one by one.
- Each vertex is defined as a point with two integer coordinates in 2D coordinate space. Vertices are immutable.
- It shall be possible to get a specific vertex of polygon by vertex sequence number. Attempt to get a non-existing
- vertex shall result in IndexOutOfBounds expection thrown.
- It shall be possible to delete a vertex specified by vertex number.
- Printing out a polygon shall result in each vertex coordinates being printed.
- Use no collections and no arrays in Polygon implementation.
- Here follows a short demo of Polygon capabilities:
```
import org.junit.Test;
public class PolygonC onsoleDemo {
public static void main(String[] args) {
Polygon polygon = new Polygon();
System.out.println("Empty: " + p olygon);
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
/*
Em pty: Empty polygon
Triangle: (1, 2) (3, 10) (5, 4)
Segment: (3, 10) (5, 4)
First vertex: (3, 10)
Get missing vertex
Exception in threa d "main" java.lang.IndexOutOfBoundsException
at polygon.Polygon.getVertex(Polygon.java:55)
at polygon.PolygonConsoleDemo.main(PolygonCon soleDemo.java:19)
*/
```