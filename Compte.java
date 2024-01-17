//exercice 7-1
import java.util.Random;

public class Compte {
    private int numero;
    private char typeCompte;
    private double solde;
    private int codeSecret;

    // Constructeur par défaut
    public Compte() {
        this.numero = 99999;
        this.typeCompte = ' ';
        this.solde = 0;
        this.codeSecret = 0;
    }

    // Constructeur surchargé
    public Compte(int numero, char typeCompte, double solde) {
        this.numero = numero;
        this.typeCompte = (typeCompte == 'D' || typeCompte == 'E') ? typeCompte : ' ';
        this.solde = solde;
        this.codeSecret = genererCS();
    }

    // Méthode pour générer un code secret aléatoire
    private int genererCS() {
        Random rand = new Random();
        return rand.nextInt(9900) + 100; // Génère un nombre entre [100 ; 9999]
    }
    
    // Modificateur pour le numéro de compte
    public void setNumero(int numero) {
        this.numero = numero; // Le nouveau numéro
    } 

    // Modificateur pour le type de compte
    public void setTypeCompte(char typeCompte) {
        this.typeCompte = (typeCompte == 'D' || typeCompte == 'E') ? typeCompte : ' ';
    }

    // Accesseur pour le numéro de compte
    public int getNumero() {
        return numero;
    }

    // Accesseur pour le code secret
    public int getCodeSecret() {
        return codeSecret;
    }

    // Accesseur pour le type de compte
    public char getTypeCompte() {
        return typeCompte;
    }

    public static void main(String[] args) {
        Compte c0 = new Compte(); // Utilisation du constructeur par défaut
        System.out.println("Le numéro du compte est : " + c0.getNumero());

        // Utilisation du constructeur surchargé
        Compte c1 = new Compte(1243, 'D', 120.0);
        System.out.println("Le numéro du compte est : " + c1.getNumero() + ", le type de compte est : " + c1.getTypeCompte());
    }
}