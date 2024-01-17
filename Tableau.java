// Exercice2
public class Tableau {
   
     // 1. Créer un tableau de taille n avec des valeurs de 1 à n
     public static int[] creerTableau(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = i + 1;
        }
        return tab;
    }

     // 2. Calculer la somme des valeurs d'un tableau
    public static int somme(int [] tab){
         int somme = 0;
        for (int i = 0; i< tab.length ; i++)
        {
            somme = somme + tab [i];
        }
        return somme;
    }

    // 3. Incrémenter chaque élément du tableau
     public static void incremente (int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            tab[i]++;
        }
    }
   
    public static void main(String[] args) {
            // 1. Test de la méthode creerTableau
            int n = 5; // Taille du tableau
            int[] tab = Tableau.creerTableau(n);
    
            // Affichage du tableau créé
            System.out.print("Tableau créé : ");
            for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[i] + " ");
            }
            System.out.println();
    
            // 2. Test de la méthode somme
            int somme = Tableau.somme(tab);
            System.out.println("Somme des éléments du tableau : " + somme);
    
            // 3. Test de la méthode incremente
            Tableau.incremente(tab);
    
            // Affichage du tableau après incrémentation
            System.out.print("Tableau après incrémentation : ");
            for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[i] + " ");
            }
            System.out.println();
        }
    }
    
    
    
    
    
    
    
    

