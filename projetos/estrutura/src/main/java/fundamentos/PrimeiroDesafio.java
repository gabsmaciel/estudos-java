package fundamentos;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        // (ºF - 32) * 5/9= ºC
        final double ajuste = 32;
        final double fator = 5/9.0;
        double fahrenheit = 86;
        double celsius = (fahrenheit - ajuste) * fator;
        System.out.println("O resultado é = " + celsius + "ºC.");
    }
}
