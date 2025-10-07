import java.util.Scanner;

 class Circle {
    double radiusInMm;
    Circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumferences(){
        return 2 * radiusInMm * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radiusInMm,2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm:" + radiusInMm + ", Circumferences in mm:" + getCircumferences() + ", Area in mm2:" + getArea();
                }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the world of circle\n");
        System.out.print("Please enter your radius:");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
    }

