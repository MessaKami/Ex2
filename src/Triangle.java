public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Triangle triangle) {
        a = triangle.a;
        b = triangle.b;
        c = triangle.c;
    }

    public double perimetre() {
        return this.a + this.b + this.c;
    }

    public double area() {
        if (!estTriangleValide()) {
            System.err.println("Les longueurs ne forment pas un triangle valide.");
            return Double.NaN;
        }
        double s = (this.a + this.b + this.c) / 2.0;
        double result = Math.sqrt(s * (s - this.a) * (s - this.b) * (s - this.c));
        return result;
    }

    private boolean estTriangleValide() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public String toString() {
        return "Voici les points du triangle " + "\n" +
                "a = " + a + "\n" +
                "b = " + b + "\n" +
                "c = " + c + "\n" +
                "Son périmètre est de " + perimetre() + "\n" +
                "Son aire est de " + area() + "\n";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static void main(String[] args) {
        Triangle ABC = new Triangle(50, 50.9, 18.8);
        System.out.println(ABC);
        Triangle DCE = new Triangle(ABC);
        DCE.setA(60);
        DCE.setB(61);
        DCE.setC(22);
        System.out.println(DCE);
    }


}
