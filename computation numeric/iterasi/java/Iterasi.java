package main;

public class Iterasi {

	public static void main(String[] args) {
		double x=0;
		int i=0;
		while (i !=10) {
			double tmp = hasilFX(x);
			System.out.println("x"+i+": "+x+"\tFx\t: "+tmp);
			x= tmp;
			
			i++;
		}	
	}
	public static double hasilFX(double x) {
		double fx = (Math.exp(-x));
		return fx;
		
	}
}
