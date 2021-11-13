package dynamique;
import dynamique.VoitureFactory.ModeConstruction;
import voiture.Voiture;
import voiture.VoitureSport;


public class VoitureFactory {

    public enum ModeConstruction {
        INSTANTIATION,
        REFLEXION,
        META,
    }

    public static Voiture buildVoiture(ModeConstruction mode, boolean sport, int vitesse) {
        Object toCreate = null;
        switch (mode) {
            case INSTANTIATION: 
                if (sport) {
                    toCreate = new VoitureSport();
                } else {
                    toCreate = new Voiture(vitesse);
                }
            break;
        }
        return (Voiture) toCreate;
    }


}
