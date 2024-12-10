import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        System.out.println("Voici la phrase en miniscule: " + sentence);
        sentence = sentence.toUpperCase();
        System.out.println("Voici la phrase en Majusucule: " + sentence);


    }
}
