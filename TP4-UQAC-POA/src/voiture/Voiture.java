package voiture;

public class Voiture {
    private int vitesse;
    private int position;
    private int id;
    private static int _id = 0;

    public Voiture(int vitesse) {
        this.vitesse = vitesse;
        this.position = 0;
        this.id = _id++;
    }

    public void deplacement() {
        this.position += this.vitesse;
    }

    public String toString() {
        return "voiture: [id " + this.id + "] [vitesse " + this.vitesse + "] [position " + this.position + "]";
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getPosition() { return position; }

    public int getId() { return id; }
}
