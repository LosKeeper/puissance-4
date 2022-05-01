public class Grille {
    Pions[][] cases = new Pions[6][7];

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
            }
            System.out.print("|\n");
        }
        System.out.println();
    }

    public boolean patie_finie() {
        // Check for horizontal
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (cases[i][j] != null && cases[i][j + 1] != null && cases[i][j + 2] != null && cases[i][j + 3] != null
                        && cases[i][j].couleur == cases[i][j + 1].couleur
                        && cases[i][j].couleur == cases[i][j + 2].couleur
                        && cases[i][j].couleur == cases[i][j + 3].couleur) {
                    System.out.println("Joueur " + cases[i][j].couleur + " a gagné");
                    return true;
                }
            }
        }

        // Check for vertical
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (cases[i][j] != null && cases[i + 1][j] != null && cases[i + 2][j] != null && cases[i + 3][j] != null
                        && cases[i][j].couleur == cases[i + 1][j].couleur
                        && cases[i][j].couleur == cases[i + 2][j].couleur
                        && cases[i][j].couleur == cases[i + 3][j].couleur) {
                    System.out.println("Joueur " + cases[i][j].couleur + " a gagné");
                    return true;
                }
            }
        }

        // Check for diagonal
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (cases[i][j] != null && cases[i + 1][j + 1] != null && cases[i + 2][j + 2] != null
                        && cases[i + 3][j + 3] != null && cases[i][j].couleur == cases[i + 1][j + 1].couleur
                        && cases[i][j].couleur == cases[i + 2][j + 2].couleur
                        && cases[i][j].couleur == cases[i + 3][j + 3].couleur) {
                    System.out.println("Joueur " + cases[i][j].couleur + " a gagné");
                    return true;
                }
            }
        }

        return false;
    }

}