/*
3 laboratorinis darbas.
Masyvai. Veiksmai su skaičiais masyve

GYNIMAS - ANTRADIENĮ
Reikalavimai:
1. Sukurti 10 + ir - skaičių masyvą.
2. Sukurti funkciją, skaičiuojančią lyginių masyvo elementų vidurkį (sumai ir kiekiui atskiros funkcijos (!)). pagal lygini skaiciu.
3. Sukeisti didžiausias ir mažiausias reikšmes masyve vietomis (atskiros funkcijos min ir max skaičių radimui).
4. Sukurti funkciją, spausdinančią masyvą prieš pakeitimus ir po jų.
5. STRUKTŪROGRAMA (!)

gynimas
surasti maziausia lygini skaiciu
*/

public class Main {

    public static void main(String[] args) {
        //1. Sukurti 10 + ir - skaičių masyvą.
        double[] skaiciuMasyvas = {-1, -2, -333, -4, -5, 666, 7, 8, 9, 10};
        System.out.println("Masyvas: ");
        spausdintiMasyvoElementus(skaiciuMasyvas);

        //2. Sukurti funkciją, skaičiuojančią lyginių masyvo elementų vidurkį (sumai ir kiekiui atskiros funkcijos (!)). pagal lygini skaiciu.
        skaiciuotiLyginiuMasyvoNariuVidurki(skaiciuMasyvas);

        //4. Sukurti funkciją, spausdinančią masyvą prieš pakeitimus ir po jų.
        spausdintiMasyvaPriesIrPo(skaiciuMasyvas);
        //Gynimas
        System.out.printf("%n"+"Maziausias lyginis skaicius masyve: "+rastiMaziausiaLyginiSkaiciusMasyve(skaiciuMasyvas));
    }

    public static int rastiMaxSkaiciausIndeksaMasyve(double[] skaiciuMasyvas) {
        int i, max = -999999999;
        int indeksas = 0;
        for (i = 0; i < skaiciuMasyvas.length; i++) {
            if (skaiciuMasyvas[i] > max) {
                max = (int) skaiciuMasyvas[i];
                indeksas = i;
            }
        }
        return indeksas;
    }

    public static int rastiMinSkaiciausIndeksaMasyve(double[] skaiciuMasyvas) {
        int i, min = 999999999;
        int indeksas = 0;
        for (i = 0; i < skaiciuMasyvas.length; i++) {
            if (skaiciuMasyvas[i] < min) {
                min = (int) skaiciuMasyvas[i];
                indeksas = i;
            }
        }
        return indeksas;
    }

    public static double[] sukeistiMasyvoElementusVietomis(double[] skaiciuMasyvas, int indeksas1, int indeksas2) {
        double indekso1Reiksme = skaiciuMasyvas[indeksas1];
        double indekso2Reiksme = skaiciuMasyvas[indeksas2];
        skaiciuMasyvas[indeksas1] = indekso2Reiksme;
        skaiciuMasyvas[indeksas2] = indekso1Reiksme;
        return skaiciuMasyvas;
    }

    public static void spausdintiMasyvoElementus(double[] skaiciuMasyvas) {
        for (int i = 0; i < skaiciuMasyvas.length; i++) {
            if (i == 0) {
                System.out.print("[" + skaiciuMasyvas[i] + ", ");
            } else if (i == skaiciuMasyvas.length - 1) {
                System.out.print(skaiciuMasyvas[i] + "]");
            } else {
                System.out.print(skaiciuMasyvas[i] + ", ");
            }
        }
    }

    public static void spausdintiMasyvaPriesIrPo(double[] skaiciuMasyvas) {
        //masyvas pries pasikeitimus
        System.out.println("Masyvas pries nariu sukeitima vietomis: ");
        spausdintiMasyvoElementus(skaiciuMasyvas);
        //masyvas po didziausios ir maziausios reiksmes sukeitimo vietomis
        System.out.printf("%n" + "Masyvas po didziausios ir maziausios masyvo reiksmiu sukeitimo vietomis: " + "%n");
        spausdintiMasyvoElementus(sukeistiMasyvoElementusVietomis(skaiciuMasyvas, rastiMaxSkaiciausIndeksaMasyve(skaiciuMasyvas), rastiMinSkaiciausIndeksaMasyve(skaiciuMasyvas)));
    }

    public static double skaiciuotiLyginiuMasyvoNariuSuma(double[] skaiciuMasyvas) {
        int i;
        double sum = 0;
        for (i = 0; i < skaiciuMasyvas.length; i++) {
            if (skaiciuMasyvas[i] % 2 == 0) {
                sum += skaiciuMasyvas[i];
            }
        }
        return sum;
    }

    public static int skaiciuotiLyginiuMasyvoNariuKieki(double[] skaiciuMasyvas) {
        int i;
        int kiekis = 0;
        for (i = 0; i < skaiciuMasyvas.length; i++) {
            if (skaiciuMasyvas[i] % 2 == 0) {
                kiekis++;
            }
        }
        return kiekis;
    }

    public static void skaiciuotiLyginiuMasyvoNariuVidurki(double[] skaiciuMasyvas) {
        double vidurkis = 0;
        if (skaiciuotiLyginiuMasyvoNariuKieki(skaiciuMasyvas) != 0) {
            vidurkis = skaiciuotiLyginiuMasyvoNariuSuma(skaiciuMasyvas) / skaiciuotiLyginiuMasyvoNariuKieki(skaiciuMasyvas);
            System.out.printf("%n" + "Lyginiu masyvo elementu vidurkis: " + vidurkis + "%n");
        } else
            System.out.printf("%n" + "Lyginiu masyvo elementu vidurkis: " + "dalyba iš nulio negalima" + "%n");
    }

    public static double rastiMaziausiaLyginiSkaiciusMasyve(double[] skaiciuMasyvas) {
        double min = 999999999;
        for (int i=0;i<skaiciuMasyvas.length;i++){
            if (skaiciuMasyvas[i] % 2 == 0){
                if (skaiciuMasyvas[i] < min){
                    min = skaiciuMasyvas[i];
                }
            }
        }
        return min;
    }
}

