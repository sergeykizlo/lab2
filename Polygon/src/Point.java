
public class Point {

	public Point next = null;
	public Point previous = null;
	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		try {
				sb.append("(");
				sb.append(this.x);
				sb.append(",");
				sb.append(this.y);
				sb.append(")");
				
			
		} catch (Exception e) {
		
		}
		return sb.toString();
	}
}
