import java.util.ArrayList;
import java.util.List;

public class Main {

    enum Tevekenysegek {
        ENEK, LABDAZAS, RAJZ, TANC
    }

    public static void main(String[] args) {
        List<Gyerek> gyerekek = new ArrayList<>();
        List<Tevekenysegek> tevekenysegek = new ArrayList<>();
        List<Gyerek> siroGyerekek = new ArrayList<>();

        Gyerek Ede = new Eleven("Ede", 1);
        Gyerek Kati = new Kényelmes("Kati", 4);
        Gyerek Zsuzsa = new Zenekedvelő("Zsuzsa", 2);
        Gyerek Emese = new Eleven("Emese", 2);
        Gyerek Emil = new Eleven("Emil", 3);
        Gyerek Karcsi = new Kényelmes("Karcsi", 1);
        Gyerek Zoli = new Zenekedvelő("Zoli", 3);
        gyerekek.add(Ede);
        gyerekek.add(Kati);
        gyerekek.add(Zsuzsa);
        gyerekek.add(Emese);
        gyerekek.add(Emil);
        gyerekek.add(Karcsi);
        gyerekek.add(Zoli);

        tevekenysegek.add(Tevekenysegek.ENEK);
        tevekenysegek.add(Tevekenysegek.LABDAZAS);
        tevekenysegek.add(Tevekenysegek.TANC);
        tevekenysegek.add(Tevekenysegek.RAJZ);
        tevekenysegek.add(Tevekenysegek.ENEK);
        tevekenysegek.add(Tevekenysegek.RAJZ);

        for (Tevekenysegek tevekenyseg : tevekenysegek) {
            for (Gyerek gyerek : gyerekek) {
                gyerek.applyTevekenyseg(tevekenyseg);
                System.out.println(gyerek.toString());
                if (gyerek.isNyafog()) {
                    siroGyerekek.add(gyerek);
                }
                if (siroGyerekek.size() >= 3) {
                    break;
                }
            }
            if (siroGyerekek.size() >= 3) {
                System.out.println("Elszabadult a pokol!");
                System.out.println(siroGyerekek.toString());
                break;
            }
        }

    }
}
