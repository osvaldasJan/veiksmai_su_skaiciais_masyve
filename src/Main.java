/*
3 laboratorinis darbas.
Masyvai. Veiksmai su skaičiais masyve

GYNIMAS - ANTRADIENĮ
Reikalavimai:
1. Sukurti 10 + ir - skaičių masyvą.
2. Sukurti funkciją, skaičiuojančią lyginių masyvo elementų vidurkį (sumai ir kiekiui atskiros funkcijos (!)). pagal lygini skaiciu.
3. Sukeisti dydžiausias ir mažiausias reikšmes masyve vietomis (atskiros funkcijos min ir max skaičių radimui).
4. Sukurti funkciją, spausdinančią masyvą prieš pakeitimus ir po jų.
5. STRUKTŪROGRAMA (!)
*/


public class Main {

    public static void main(String[] args) {

        double[] teigiamuSkaiciuMasyvas = {-1,-2,-3,-4,-5,6,7,8,9,10};

        spausdintiMasyvaPriesIrPo(teigiamuSkaiciuMasyvas);

        spausdintiMasyva(teigiamuSkaiciuMasyvas);
        System.out.println(lyginiuMasyvoNariuSuma(teigiamuSkaiciuMasyvas));
    }
    public static double masyvoNariuSuma(double[] x) {
        int i;
        double sum = 0;
        for (i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
    public static double masyvoNariuVidurkis(double[] x){
        return masyvoNariuSuma(x)/x.length;
    }
    public static double lyginiaiSkaiciaiMasyve(double[] x){
        for(int i=0;i<x.length;i=i+2){
        }
        return masyvoNariuSuma(x)/x.length;
    }
    public static double max(double[] x){
        int i, max = -999999999;
        for(i = 0; i < x.length; i++){
            if ( x[i] > max) {
                max = (int)x[i];
            }
        }
        return max;
    }
    public static int maxSkaiciausIndeksas(double[] x){
        int i, max = -999999999;
        int indeksas = 0;
        for(i = 0; i < x.length; i++){
            if ( x[i] > max) {
                max = (int)x[i];
                indeksas = i;
            }
        }
        return indeksas;
    }
    public static double min(double[] x){
        int i, min = 999999999;
        for(i = 0; i < x.length; i++){
            if ( x[i] < min) {
                min = (int)x[i];
            }
        }
        return min;
    }
    public static int minSkaiciausIndeksas(double[] x){
        int i, min = 999999999;
        int indeksas = 0;
        for(i = 0; i < x.length; i++) {
            if ( x[i] < min) {
                min = (int)x[i];
                indeksas = i;
            }
        }
        return indeksas;
    }

    public static double[] sukeistiMasyvoElementusVietomis (double[] x, int indeksas1, int indeksas2 ){
        double[] y = new double[10];
        final int xa = 10;
        for (int i = 0; i < x.length; i++) {
            if (i==indeksas1) {
                y[i]=x[indeksas2];
            } else if (i==indeksas2) {
                y[i]=x[indeksas1];
            } else {
                y[i]=x[i];
            }
        }
        return y;
    }

    public static void spausdintiMasyva(double[] x) {
        System.out.println("");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
        }
    }
    public static void spausdintiMasyvaPriesIrPo (double[] x) {
        //masyvas pries pasikeitimus
        System.out.println("Masyvas pries pasikeitimus: ");
        spausdintiMasyva(x);
        //masyvas po didziausios ir maziausios reiksmes sukeitimo vietomis
        System.out.printf("%n"+"Masyvas po didziausios ir maziausios masyvo reiksmiu sukeitimo vietomis: ");
        spausdintiMasyva(sukeistiMasyvoElementusVietomis(x, maxSkaiciausIndeksas (x), minSkaiciausIndeksas(x) ));
    }
    public static double lyginiuMasyvoNariuSuma(double[] x) {
        int i;
        double sum = 0;
        for (i = 0; i < x.length; i++) {
            if (mod(x[i]/2==
            sum += x[i];
        }
        return sum;
    }
}
