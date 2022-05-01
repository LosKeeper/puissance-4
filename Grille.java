public class Grille {
    Pions[][] cases;

    // Constructeur
    Grille() {
        Pions[][] cases = new Pions[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                cases[i][j] = null;
            }
        }
    }

    public void AjouterPion(Couleur couleur, int colonne) {
        for (int i = 0; i < 7; i++) {
            if (cases[i][colonne] == null) {
                cases[i][colonne] = new Pions(couleur);
                break;
            }
        }
    }

    public void afficher() {
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                System.out.print("|");
                if (cases[i][j] != null) {
                    System.out.print(cases[i][j].print);
                } else {
                    System.out.print(" ");
                }
                System.out.print("|\n");
            }
        }
        for (int k = 0; k < 7; k++) {
            System.out.print(" - ");
        }
        System.out.println();
    }

}