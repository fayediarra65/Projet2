//exercice 8
import java.util.Scanner;

public class ConversionChaine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // la saisie de l'utilisateur
        System.out.println("Saisissez un entier : ");
        String input = sc.nextLine();

        // Vérifions  si la chaîne de caractères est un entier
        if (estEntier(input)) {
            // si l'entrée utilisateur est une chaîne de chiffres (un entier), convertis la chaîne en un entier
            int n = Integer.parseInt(input);

            // Afficher le résultat
            System.out.println("n = " + n);

        } else {
            // Si ce n'est pas une chaine en  entier, afficher un message d'erreur
            System.out.println("votre chaîne n'est pas à un entier.");
        }

        
    }

    // Méthode pour vérifier si une chaîne de caractères correspond à un entier
    private static boolean estEntier(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Vérifier si chaque caractère de la chaîne est un chiffre
            if (!Character.isDigit(s.charAt(i))) {
                return false; // Si un caractère n'est pas un chiffre, la chaîne n'est pas un entier
            }
        }
        return true; // Si tous les caractères sont des chiffres, la chaîne est un entier
    }
}