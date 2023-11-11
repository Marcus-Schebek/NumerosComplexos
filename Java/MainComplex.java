import java.util.Scanner;
import java.util.Locale;

public class MainComplex {
    public static void main (String args []){
        Locale locale = new Locale("pt", "BR");
        Scanner scanner = new Scanner(System.in).useLocale(locale);

        System.out.println("Digite o primeiro número complexo (parte real e parte imaginária separadas por espaço):");
        float real1 = scanner.nextFloat();
        float imaginary1 = scanner.nextFloat();
        NumComplex num1 = new NumComplex(real1, imaginary1);

        System.out.println("Digite o segundo número complexo (parte real e parte imaginária separadas por espaço):");
        float real2 = scanner.nextFloat();
        float imaginary2 = scanner.nextFloat();
        NumComplex num2 = new NumComplex(real2, imaginary2);

        NumComplex sum = num1.add(num2);
        NumComplex difference = num1.subtract(num2);
        NumComplex product = num1.multiply(num2);
        NumComplex division = num1.division(num2);


        System.out.println("Resultado da Soma: ");
        sum.printNumComplex();

        System.out.println("Resultado da Subtração: ");
        difference.printNumComplex();

        System.out.println("Resultado da Multiplicação: ");
        product.printNumComplex();


        System.out.println("Resultado da divisão: ");
        division.printNumComplex();

        scanner.close();

        
    }
}
