public class Main {

    public static void main(String[] args) {
        Couleur couleur_a_jouer = Couleur.Jaune;
        Grille grille = new Grille();
        boolean Joueur1 = true;
        int colonne_a_jouer = 0;
        boolean fin_de_partie = false;

        grille.afficher();

        while (!fin_de_partie) {
            if (Joueur1) {
                System.out.println("Joueur 1, quelle colonne voulez-vous jouer ?");
                colonne_a_jouer = Integer.parseInt(System.console().readLine()) - 1;
                if (colonne_a_jouer < 0 || colonne_a_jouer > 6) {
                    System.out.println("Vous devez entrer un nombre entre 1 et 7");
                    continue;
                }
                grille.AjouterPion(couleur_a_jouer, colonne_a_jouer);
                grille.afficher();
                couleur_a_jouer = Couleur.Rouge;
                Joueur1 = false;
                fin_de_partie = grille.patie_finie();
            } else {
                System.out.println("Joueur 2, quelle colonne voulez-vous jouer ?");
                colonne_a_jouer = Integer.parseInt(System.console().readLine()) - 1;
                if (colonne_a_jouer < 0 || colonne_a_jouer > 6) {
                    System.out.println("Vous devez entrer un nombre entre 1 et 7");
                    continue;
                }
                grille.AjouterPion(couleur_a_jouer, colonne_a_jouer);
                grille.afficher();
                couleur_a_jouer = Couleur.Jaune;
                Joueur1 = true;
                fin_de_partie = grille.patie_finie();
            }
        }

        System.out.println("Fin de partie");
    }
}