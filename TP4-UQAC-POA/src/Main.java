import java.util.ArrayList;
import java.util.List;

import dynamique.VoitureFactory;
import voiture.Voiture;

public class Main {
    public static void main(String[] args) {

        List<Voiture> mesVoitures = new ArrayList<Voiture>();
        ajoutVoituresInstanciation(mesVoitures);

        try {
            int x = 0;
            while (x++ < 20) {
                System.out.println("\n " + x);

                for (Voiture v : mesVoitures) {
                    v.deplacement();
                    System.out.println(v);
                    //surveillerVoiture(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ajoutVoituresInstanciation(List<Voiture> mesVoitures) {
        mesVoitures.add(VoitureFactory.buildVoiture(VoitureFactory.ModeConstruction.INSTANTIATION, true, 0));
        mesVoitures.add(VoitureFactory.buildVoiture(VoitureFactory.ModeConstruction.INSTANTIATION, false, 50));
        mesVoitures.add(VoitureFactory.buildVoiture(VoitureFactory.ModeConstruction.INSTANTIATION, false, 10));
    }

 

}