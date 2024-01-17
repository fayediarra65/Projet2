//exercice 7-2
import java.util.Arrays;

// la classe TabCompte
public class TabCompte {
    
    // la methode afficherTab pour afficher le tableau
    public void afficherTab (int[]montant)
    {
        for (int i = 0 ; i< montant.length ; i++)
        {
            System.out.println (montant[i]);
        }
    }

    // la methode princiapale
    public static void main (String [] args){
        int[] montant ={100,200,300,44,12};
       TabCompte t1 = new  TabCompte ();
        t1.afficherTab (montant);

        // Utilisation de la méthode sort pour trier le tableau
        Arrays.sort(montant);

        // affichage du tableau trier
        System.out.println ("le tableau trier est: "+Arrays.toString(montant));


    }
} 