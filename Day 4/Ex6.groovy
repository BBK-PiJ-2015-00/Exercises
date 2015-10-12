Point a = new Point();
a.x = 10;
a.y = 0;
Point b = new Point();
b.x = 15;
b.y = 7;

Point clone = a.clone();
a.moveTo(100,100);

a.printPoint();
clone.printPoint();

class Point {
	double x;
	double y;
	
	void printPoint() {
		println ("X = " + this.x);
		println ("Y = " + this.y);
	}
	
	double distanceTo(Point p) {
		double distanceX = Math.abs(this.x-p.x);
		double distanceY = Math.abs(this.y-p.y);
		
		return Math.sqrt(distanceX*distanceX+distanceY*distanceY);
	}
	
	double distanceToOrigin() {
		Point origin = new Point();
		return this.distanceTo(origin);
	}
	
	void moveTo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	void moveTo(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	Point clone() {
		Point clone = new Point();
		clone.moveTo(this);
		return clone;
	}
}
