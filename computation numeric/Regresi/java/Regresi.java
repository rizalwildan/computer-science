/*
 * Created by pujianto131
 */

import java.util.*;

public class Regresi{
    //declarations
    private static int[] X={10, 11, 12, 14, 16, 18, 19, 20};
    private static int[] Y={
                            10000, 11000, 9900, 
                            11000, 12000, 12500,
                            14000, 13900
                        };
    private static float totX=0,
                        totY=0, 
                        totX2=0, 
                        totXY=0, 
                        pembilang,
                        penyebut, 
                        rataX,rataY,M, C,
                        nilaiY,
                        batas=X.length, 
                        nilaiX;
    private static float abs;   

    //main
    public static void main(String[] args) {
        //iterasi
        int i=0;
        System.out.println("\n\ni \tX \tY");
        System.out.println("--------------------------------");
        while (i != batas) {
            totX = totX + X[i];
            totY = totY + Y[i];
            totXY = totXY + (X[i] * Y[i]);
            totX2 = totX2 + (X[i] * X[i]);
            System.out.println(i + "\t" + X[i] + "\t" + Y[i] );
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
            Scanner key= new Scanner(System.in);
        
            boolean matrix = false;
            int k=0;

            System.out.println("--------------------------------");
            System.out.print("input Nilai\t: ");
            nilaiX = key.nextInt();
            nilaiY = FungsiY(M, nilaiX, C);
            
            for(int j=0; j<batas;j++) {
                if(nilaiX == X[j]){
                    matrix = true;
                    k=j;
                }
            }
            if(matrix == false){
                System.out.println("nilai Y\t: "+nilaiY);
                System.out.println("absolut invalid");            
            }else{
                System.out.println("nilai Y asli \t: "+Y[k]);
                System.out.println("nilai Y new\t: "+nilaiY);
                abs = Y[k]-nilaiY;
                System.out.println("absolut\t\t: "+abs);               
            }
        }        
    }

    //method for Fungsi Y
    public static float FungsiY(Float M, Float x, Float C) {
        float hasil;
        hasil = M*x+C;
        return hasil;        
    }
}