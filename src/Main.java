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
*/

public class Main {

    public static void main(String[] args) {
        //1. Sukurti 10 + ir - skaičių masyvą.
        double[] skaiciuMasyvas = {-1, -2, -3, -4, -5, 6, 7, 8, 9, 10};
        System.out.println("Masyvas: ");
        spausdintiMasyvoElementus(skaiciuMasyvas);
        //2. Sukurti funkciją, skaičiuojančią lyginių masyvo elementų vidurkį (sumai ir kiekiui atskiros funkcijos (!)). pagal lygini skaiciu.
        System.out.printf("%n" + "Lyginiu masyvo elementu vidurkis: " + skaiciuotiLyginiuMasyvoNariuVidurki(skaiciuMasyvas) + "%n");
        //4. Sukurti funkciją, spausdinančią masyvą prieš pakeitimus ir po jų.
        spausdintiMasyvaPriesIrPo(skaiciuMasyvas);
    }

    public static int rastiMaxSkaiciausIndeksaMasyve(double[] x) {
        int i, max = -999999999;
        int indeksas = 0;
        for (i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = (int) x[i];
                indeksas = i;
            }
        }
        return indeksas;
    }

    public static int rastiMinSkaiciausIndeksaMasyve(double[] x) {
        int i, min = 999999999;
        int indeksas = 0;
        for (i = 0; i < x.length; i++) {
            if (x[i] < min) {
                min = (int) x[i];
                indeksas = i;
            }
        }
        return indeksas;
    }

    public static double[] sukeistiMasyvoElementusVietomis(double[] x, int indeksas1, int indeksas2) {
        double indekso1Reiksme = x[indeksas1];
        double indekso2Reiksme = x[indeksas2];
        x[indeksas1] = indekso2Reiksme;
        x[indeksas2] = indekso1Reiksme;
        return x;
    }

    public static void spausdintiMasyvoElementus(double[] x) {
        for (int i = 0; i < x.length; i++) {
            if (i == 0) {
                System.out.print("[" + x[i] + ", ");
            } else if (i == x.length - 1) {
                System.out.print(x[i] + "]");
            } else {
                System.out.print(x[i] + ", ");
            }
        }
    }

    public static void spausdintiMasyvaPriesIrPo(double[] x) {
        //masyvas pries pasikeitimus
        System.out.println("Masyvas pries nariu sukeitima vietomis: ");
        spausdintiMasyvoElementus(x);
        //masyvas po didziausios ir maziausios reiksmes sukeitimo vietomis
        System.out.printf("%n" + "Masyvas po didziausios ir maziausios masyvo reiksmiu sukeitimo vietomis: " + "%n");
        spausdintiMasyvoElementus(sukeistiMasyvoElementusVietomis(x, rastiMaxSkaiciausIndeksaMasyve(x), rastiMinSkaiciausIndeksaMasyve(x)));
    }

    public static double skaiciuotiLyginiuMasyvoNariuSuma(double[] x) {
        int i;
        double sum = 0;
        for (i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                sum += x[i];
            }
        }
        return sum;
    }

    public static int skaiciuotiLyginiuMasyvoNariuKieki(double[] x) {
        int i;
        int kiekis = 0;
        for (i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                kiekis++;
            }
        }
        return kiekis;
    }

    public static double skaiciuotiLyginiuMasyvoNariuVidurki(double[] x) {
        double vidurkis = skaiciuotiLyginiuMasyvoNariuSuma(x) / skaiciuotiLyginiuMasyvoNariuKieki(x);
        return vidurkis;
    }
}

