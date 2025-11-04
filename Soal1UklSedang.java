public class Soal1UklSedang {
    public static void main(String[] args) {
        System.out.println("masukkan bilanagan bulat positif");
        int n = 4;
        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
    }
}
