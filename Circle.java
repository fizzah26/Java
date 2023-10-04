public class Circle {
    int rad;
    double area;
    double perimeter;

    public Circle(int rad) {
        this.rad = rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }


    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double calArea() {

        return Math.PI * rad * rad;
    }

    public double calPerimeter() {
        return 2 * Math.PI * rad;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(5);

        System.out.println(c1.calArea());
        System.out.println(c1.calPerimeter());

    }
}
