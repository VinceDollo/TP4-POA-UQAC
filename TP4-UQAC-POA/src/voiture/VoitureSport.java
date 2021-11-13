package voiture;

public class VoitureSport extends Voiture {

    public VoitureSport() {
        super(200);
    }

    @Override
    public String toString() {
        return "voitureSport: [id " + super.getId()+ "] [vitesse " + super.getVitesse() + "] [position " + super.getPosition() + "]";
    }
}
