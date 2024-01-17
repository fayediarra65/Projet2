// EXERCICE 3
// Déclaration de la classe Personne
class Personne {
    String prenom;
    String nom;
    private int age;
    static int nbPersonnes = 0; 
// constructeur de la classe personne
    public Personne(String p, String n, int a){
    prenom = p;
    nom = n;
    age = a;
    nbPersonnes++;
    }

    // accesseur pour age qui est privé
    public int getAge(){
        return age;
    }
    // methode pour afficher des informations sur la personne
    public void affichePersonne1(){
    System.out.println(prenom+" "+nom+" a "+age+" ans");
    }
    
    //  Méthode pour ajouter un an à l'âge 
     public void ajoutAge() {
            age++;
    }
}
