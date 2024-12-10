public class Ex6 {

    private double a;
    private double b;

    public Ex6(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Ex6(Ex6 ex6) {
        this.a = ex6.a;
        this.b = ex6.b;
    }

    public double sum() {
        return this.a + this.b;
    }

    public double multiplicity() {
        return this.a * this.b;
    }

    public double division() {
        return this.a / this.b;
    }

    public String toString() {
        return "Voici les valeurs a = " + a + " et b = " + b + "\n" +
                "Voici leurs addition = " + sum() + "\n" +
                "Voici leurs multiplication = " + multiplicity() + "\n" +
                "Voici leurs division = " + division() + "\n";
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

    public static void main(String[] args) {
        Ex6 test1 = new Ex6(8 , 6);
        System.out.println(test1);
    }
}
