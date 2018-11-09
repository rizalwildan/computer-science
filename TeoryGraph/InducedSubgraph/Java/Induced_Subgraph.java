import java.util.Scanner;

public class Induced_Subgraph {
    public static void main(String[] args) {
        int index = 0;
        char huruf[] = {'A','B','C','D'};
        char input;
        Scanner key = new Scanner(System.in);

        int h[][] = new int [huruf.length][huruf.length];

        System.out.println("Masukkan Nilai Graph H");

        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < huruf.length; j++) {
                System.out.print("Nilai Data " + huruf[i] + " " + huruf[j] + " : ");
                h[i][j] = key.nextInt();
            }
        }

        System.out.println("\nGraph H");
        cetakArray(h, huruf);

        System.out.print("Masukkan Vertex yang akan dihilangkan : ");
        input = key.next().charAt(0);

        for (int i = 0; i < huruf.length; i++) {
            if (huruf[i] == input) {
                index = i;
            }
        }

        int g[][] = h;
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (i == index) {
                    g[index][j] = 0;
                }
                if (j == index) {
                    g[i][index] = 0;
                }
            }
        }

        System.out.println("\nGraph H");
        cetakArray(h, huruf);

        System.out.println("\nGraph G");
        cetakArray(g, huruf);

    }

    public static void cetakArray (int h[][], char huruf[]) {
        System.out.println("---------------------------");
        for (int i = 0; i < huruf.length; i++) {
            System.out.print("\t" + huruf[i]);
        }
        System.out.print("\n");
        for (int i = 0; i < huruf.length; i++) {
            System.out.print(huruf[i] + "\t");
            for (int j = 0; j < huruf.length; j++) {
                System.out.print(h[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}