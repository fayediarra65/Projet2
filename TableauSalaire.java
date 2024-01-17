//exercice 5
//la classe TableauSalaire
public class TableauSalaire{

    // la methode somme salaire pour calculer la somme des salaires
    /**
     * @param tab
     * @return
     */
    public static double sommeSalaire (double [] tab){
        double somme = 0.0;
       for (int i = 0; i< tab.length ; i++)
       {
           somme = somme + tab [i];
       }
       return somme;
   }
   // la methode principale 
   /**
 * @param args
 */
public static void main (String [] args){

   // utilisation du tableau de salaires
   double[] salaires = { 500, 60000.0, 7500.0 };
        
   // Calcul de la somme des salaires à l'aide de la méthode sommeSalaire
   double somme = sommeSalaire(salaires);
   
   // Affichage du résultat
   System.out.println("Somme des salaires : " + somme);
}

}