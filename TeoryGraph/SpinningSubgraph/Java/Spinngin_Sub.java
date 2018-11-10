import java.util.Scanner;

public class Spinngin_Sub {
    
    public static void main(String[] args) {
        int g[][] = {{0,1,1,0}, {0,0,0,1}, {0,0,1,0}, {0,1,1,0}};
        char huruf[] = {'A','B','C','D'};
        Scanner key = new Scanner(System.in);
        boolean cek;

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

        System.out.println("\nGraph G");
        cetakArray(g, huruf);

        cek = true;
        for (int i = 0; i < huruf.length; i++) {
            for (int j = 0; j < huruf.length; j++) {
                if (h[i][j] == 1 && h[i][j] != g[i][j]) {
                    cek = false;
                }
            }
        }

        if (cek == true) {
            System.out.println("Graph G Merupakan Subgraph Graph H");
        }
        else {
            System.out.println("Graph G bukan merupakan Subgraph Graph H");
        }
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