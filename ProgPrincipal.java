//Exercice 3
// la classe progprincipal
public class ProgPrincipal {

    // Méthode pour célébrer l'anniversaire d'une personne
    public static void anniversaire(Personne p){
        p.ajoutAge() ;
    }
    
    // la methode principale
    public static void main(String[] args){
    Personne p1 = new Personne("Jean", "Durand", 25); // creation  d'une instance de personne

    // affichage des informations sur la personne 
    System.out.println(p1.prenom);
    System.out.println(p1.nom);
    System.out.println(p1.getAge());

    
    System.out.println("avant l'anniversaire :");
        p1.affichePersonne1();

        // Appel de la fonction anniversaire pour ajouter l'âge
        anniversaire(p1);

        System.out.println("Après l'anniversaire :");
        p1.affichePersonne1();
    
    }
    }