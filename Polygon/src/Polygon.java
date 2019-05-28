
public class Polygon {
	private int nodeCount;
	private Point head;
	private Point tail;

	public Polygon() {
		this.tail = null;
		this.nodeCount = 0;
	}

	public int size() {
		return nodeCount;
	}

	public boolean isEmpty() {
		return this.nodeCount == 0;
	}

	public void add(Point point) {

		Point newPoint = point;
		newPoint.next = null;

		if (this.tail == null) {
			this.head = newPoint;
			this.tail = newPoint;
		} else {

			Point last = this.tail;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newPoint;

		}
		this.nodeCount++;
	}

	public Point getVertex(int index) {
		Point current = this.head;
		Integer counter = 0;

		while (counter != index) {
			if (current == null) {
				throw new IndexOutOfBoundsException();
			}
			current = current.next;
			counter++;
		}

		return current;
	}

	public boolean delete(int index) {
		Point pointToDelete = getVertex(index);
		Point pointToDeletePrevious = pointToDelete.previous;
		Point pointToDeleteNext = pointToDelete.next;

		if (pointToDeletePrevious != null) {
			pointToDeletePrevious.next = pointToDeleteNext;
			pointToDeleteNext.previous = pointToDeletePrevious;
		} else {
			pointToDelete = pointToDeleteNext;
			this.head = pointToDeleteNext;
		}
		this.nodeCount--;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Point point = head;
		try {
			if (this.size() == 0) {
				sb.append("Empty polygon");
			} else {
				while (point != null) {
					sb.append("(");
					sb.append(point.x);
					sb.append(",");
					sb.append(point.y);
					sb.append(")");
					point = point.next;
					if (point != null) {
						sb.append(",");
					}
				}
			}
		} catch (Exception e) {
			
		}
		return sb.toString();
	}
}
