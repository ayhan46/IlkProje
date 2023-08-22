public class FirstString {
    public static void main(String[] args) {

        String ilkMetin = "Test Otomasyonu";
        String ikinciMetin = "Yazilim Testi";
        System.out.println(ilkMetin);
        System.out.println(ikinciMetin);


        int metinUzunlugu = ilkMetin.length();
        System.out.println(metinUzunlugu);

        String kucukHarf = ilkMetin.toLowerCase();
        System.out.println(kucukHarf);

        String buyukHarf = ikinciMetin.toUpperCase();
        System.out.println(buyukHarf);

        System.out.println(kucukHarf + buyukHarf);
        System.out.println(kucukHarf + buyukHarf + metinUzunlugu);

        String yeniString = "En sevdigim \n\"film\" Avatar";
        System.out.println(yeniString);


    }
}