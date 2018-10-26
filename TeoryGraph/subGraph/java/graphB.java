/**
 * nama 	: Muhammad Eko Pujianto
 * npm		: 06.2017.1.06756
 * matkul	: Teori Graph
 * create at 21:44 26, october 2018
 * coding on visual studio code v 1.28.2
 */
import java.util.Scanner;
import java.util.*;
public class graphB {
	public static void main(String[] args) {		 
		Scanner key= new Scanner(System.in);
		char[] abj1 = {'a','b','c','d','e'};
		int[][] matrixA = {
			{0,0,0,1,1},
			{0,0,1,1,0}, 
			{0,1,0,1,1}, 
			{1,1,1,0,1},
			{1,0,1,1,0}
		};		
		//output Abj1
		System.out.print("\n\n graph G\n");
		for(int i=0; i<abj1.length; i++) {
			if(i<1){
				System.out.print("_  "+ abj1[i]);
			}
			else{
				System.out.print("  "+ abj1[i]);
			}	
		}
		System.out.println("");
		//output matrixA
		for(int i=0; i<matrixA.length; i++) {
			for(int j=0; j<matrixA.length; j++) {
				if(j<1){
					System.out.print(abj1[i]+"| "+ matrixA[i][j]);
				}
				else{
					System.out.print("  "+matrixA[i][j]);
				}
			}
			System.out.println("");
		}
		
		//deklarasi sub Graph H
		int index2, ind=matrixA.length;
		boolean subGraph = true;
		System.out.print("input jml Node : ");
		index2 = key.nextInt();
		int[][] matrixB = new int[ind][ind];
		int[] baru = new int[index2];
		char[] abj2 = new char[index2];

		//input vertex graph G
		for (int i = 0; i < index2; i++) {
			System.out.print("input abjad [a-z]: ");
			abj2[i]=key.next().charAt(0);
		}
		System.out.println("");

		//pengambilan index antar vertex graph G dengan graph H
		int index = -1, bantu = -1;
		for (int i = 0; i <index2; i++) {
			for (int j = 0; j <matrixA.length; j++) {
				if(abj2[i] == abj1[j]){
					index +=1;
					baru[index]=j;
				}
			}
			bantu++;
			if(index != bantu){
				subGraph = false;
			}
		}

		//execute if subGraph = true, input graph H.
		if(subGraph == true){
			for (int i = 0; i <index2; i++) {
				for(int j=0; j<index2; j++){
					System.out.print(
						"["+abj2[i]+"],["+abj2[j]+"] :"
					);
					matrixB[ baru[i] ][ baru[j] ] = key.nextInt();
				}	
			}

			System.out.print("\n\n graph H\n");
			for (int i = 0; i <abj2.length; i++) {
				if(i<1){
					System.out.print("_  "+ abj2[i]);
				}
				else{
					System.out.print("  "+ abj2[i]);
				}
			}
			System.out.print("\n");

			// output graph H
			for (int i = 0; i <index2; i++) {
				for(int j=0; j<index2; j++){
					if(j<1){
						System.out.print(abj2[i]+"| "+ matrixB[ baru[i] ][ baru[j] ]);
					}
					else{
						System.out.print("  "+matrixB[ baru[i] ][ baru[j] ]);
					}
				}
				System.out.println("");
			}

			//pemeriksaan edge graph G dengan Graph H
			for (int i = 0; i <index2; i++) {
				for (int j = 0; j <index2; j++) {
					if ( matrixA[ baru[i] ][ baru[j] ] != matrixB[ baru[i] ][ baru[j] ] ) {
						subGraph= false;
					}
					
				}
			}
		}
		if (subGraph == true) {
			System.out.println("graph H adalah subGraph dari graph G");
		}else{
			System.out.println("BUKAN subGraph dari graph G");
		}	
	}
}
