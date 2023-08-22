public class WhileDo {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop u ile " + i);
        }

        System.out.println("------------------");

        int j = 6;


        System.out.println("-------------------");

        do {
            System.out.println("Do while loop ile sayimiz " + j);
            j++;
        } while (j <= 5);
    }
}
