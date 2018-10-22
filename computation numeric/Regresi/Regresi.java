/*
 * Created by pujianto131.
 */

import java.util.*;

public class Regresi{

    //declarations
    private static int[] X={10, 11, 12, 14, 16, 18, 19, 20};
    private static int[] Y={10000, 11000, 9900, 11000, 12000, 12500,
                            14000, 13900};
    private static int totX=0,totY=0, totX2=0, totXY=0, pembilang,
                        penyebut, rataX, rataY;
    private static int M, C, er, YMC, nilaiY;
    private static int batas=X.length, i=0, nilaiX;
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);

        //iterasi
        System.out.println("i \tX \tY");
        System.out.println("--------------------------------");
        while (i != batas) {
            totX = totX + X[i];
            totY = totY + Y[i];
            totXY = totXY + (X[i] * Y[i]);
            totX2 = totX2 + (X[i] * X[i]);
            System.out.println(i + "\t" + X[i] + "\t" + Y[i] );
                                // totX + "\t" + totXY + "\t" + totX2);
            i++;            
        }
        pembilang = batas*totXY - totX*totY;
        penyebut = batas*totX2 - totX*totX;
        M = pembilang/penyebut;
        rataX = totX/batas;
        rataY = totY/batas;
        C = rataY- M*rataX;

        //print out
        System.out.println("--------------------------------");
        System.out.println(" \ttotX \ttotXY \ttotX2");
        System.out.println("--------------------------------");
        System.out.println("Hasil:\t" + totX + "\t" + totXY + "\t" + totX2);
        System.out.println(
            "\npembilang\t:"+pembilang+
            "\npenyebut\t:"+penyebut+
            "\nM\t\t:"+M+
            "\nC\t\t:"+C+
            "\nrataX\t\t:"+rataX+
            "\nrataY\t\t:"+rataY);

        while (true) {
            System.out.print("input Nilai\t: ");
            nilaiX = key.nextInt();
            nilaiY = FungsiY(M, nilaiX, C);
            System.out.println("nilai Y\t: "+nilaiY);
        }        
    }

    //method for Fungsi Y
    public static int FungsiY(int M, int x, int C) {
        int hasil;
        hasil = M*x+C;
        return hasil;        
    }
}