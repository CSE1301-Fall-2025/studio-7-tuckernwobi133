public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int n , int d){
        numerator = n;
        denominator = d;
    }

    public Fraction reciprocal(){ 
        return new Fraction(denominator,numerator);
    }

    public Fraction addFractions(Fraction f1){
        return new Fraction((numerator*f1.getDenominator()) + (f1.getNumerator()*denominator), denominator*f1.getDenominator());
    }

    public Fraction multiplyFractions(Fraction f1){
        return new Fraction(numerator*f1.getNumerator(), denominator*f1.getDenominator());
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }


    public String toString(){
        return numerator + "/" + denominator;
    } 

    public static void main (String[] args){
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(1,5);
        System.out.println(f1.reciprocal());
    }
}
