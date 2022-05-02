public class Pions {
    Couleur couleur;
    String print;

    public Pions(Couleur couleur) {
        this.couleur = couleur;
        if (couleur == Couleur.Jaune) {
            // Print X in yellow
            this.print = "\033[1;33mX\033[0m";
        } else {
            // Print X in red
            this.print = "\033[1;31mX\033[0m";
        }
    }

}