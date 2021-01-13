public class Main {

    //Camel Casing

    public static void main(String[] args) {
//        int ogrenciSayim=9; // Tamsayılar int ile tanımlanır
//        String ifade="Öğrenci sayısı = "; // Metinsel ifadeler String olarak adlandırılır ve tanımlanır
//        System.out.println(ifade + ogrenciSayim);
//        ogrenciSayim++;
//        System.out.println(ifade + ogrenciSayim);

//        int sayi=12;
//        sayi=15;
//        sayi+=5;
//        sayi= Integer.MAX_VALUE;
//        sayi=Integer.MIN_VALUE;
//        System.out.println(sayi);

        byte b=125;
        int a=b;

//        a=12.4;
        double d=12.4;
        a= (int) d; // cast işlemi double -> int
        System.out.println(a);
        char harf='e';
        System.out.println(harf);
        a=harf;
        System.out.println(a);

        String cumle="Günaydın Erdinç Akdemir ";
        System.out.println(cumle);

        boolean dogruMu=true;
        dogruMu = !dogruMu;
        System.out.println(dogruMu);

        if(dogruMu==true){
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Hatalı bilgi");
        }



    }
}
