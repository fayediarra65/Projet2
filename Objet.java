// Exercice 4
// Déclaration de la classe Objet
public class Objet
{
     // Méthode m() de la classe Objet
    public void m (){
       m2(); // appel de la methode m2 depuis la methode m
    }

    // Méthode m2() de la classe Personne
     public void m2 (){
            System.out.println ("Bonjour");
    }
    
    //la methode principale
    public static void main (String args [])
    {
       Objet o1 = new Objet (); // 1.1 : Création d'une instance de la classe Personne
        o1.m ();// Appel de la méthode m() sur l'instance o1
       
        // 1.2 : Création d'une deuxieme instance de la classe Objet (o2)
        Objet o2 = new Objet();

        // appel de la méthode m() de l'instance o2
        o2.m();
    }
}