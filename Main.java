public class Main {

    public static void main(String[] args) {
        Couleur couleur_a_jouer=Couleur.Jaune;
        Grille grille=new Grille();
        boolean Joueur1=true;
        int colonne_a_jouer=0;
        boolean fin_de_partie=false;

        grille.afficher();

        while(!fin_de_partie){
            if(Joueur1){
                System.out.println("Joueur 1, quelle colonne voulez-vous jouer ?");
                colonne_a_jouer = Integer.parseInt(System.console().readLine());
                grille.AjouterPion(couleur_a_jouer, colonne_a_jouer);
                grille.afficher();
                Joueur1=false;
            }
            else{
                System.out.println("Joueur 2, quelle colonne voulez-vous jouer ?");
                colonne_a_jouer = Integer.parseInt(System.console().readLine());
                grille.AjouterPion(couleur_a_jouer, colonne_a_jouer);
                grille.afficher();
                Joueur1=true;
            }
        }

        System.out.println("Fin de partie");
    }
}