import java.util.Arrays;
import java.util.Scanner;

public class SystèmedeFacturationÉlectrique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer la Consommation : ");
        int consom = scanner.nextInt();
        float result = 0;
        if (consom > 300) {
            result = (100 * 0.8f)+(200 * 1.2f)+((consom-300) * 1.5f);
        } else if (consom > 100) {
            result = (100 * 0.8f)+((consom-100) * 1.2f);
        } else {
            result = consom * 0.8f;
        }
float tax = result*0.1f ;
        float totale = result + tax;
        System.out.println("Facture avant taxe : " + result + " MAD");
        System.out.println("Taxe (10%) : " + tax + " MAD");
        System.out.println("Facture totale : " + totale  + " MAD");


    }

    }