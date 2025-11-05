public class Complex {
    private int a;
    private int b;

    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public Complex add(Complex c1){
        return new Complex(a + c1.getA(),b + c1.getB());
    }

    public Complex multiply(Complex c1){
        return new Complex(a * c1.getA() - b * c1.getB(), a * c1.getB() + b * c1.getA());
    }

    public String toString(){
        return a + " + " + b + "i";
    }

    public static void main(String[] args){
        Complex c1 = new Complex(1,2);
        Complex c2 = new Complex(2,3);
        System.out.println(c1.multiply(c2));

    }
}
