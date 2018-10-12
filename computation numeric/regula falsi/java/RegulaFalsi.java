import java.util.Scanner;
public class RegulaFalsi {
	public static double x1, x2, x3,Fx1,Fx2,Fx3,abs;
	public static int i=0;
	public static void main(String[] args) {
		
//		System.out.println(hasilFx(x1));

		Scanner key = new Scanner(System.in);
		System.out.print("x1\t: ");
		x1=key.nextDouble();
		System.out.print("x2\t: ");
		x2=key.nextDouble();
//		key.close();
		
		while (i != 10) {
			Fx1 = hasilFx(x1);
			Fx2 = hasilFx(x2);
			
			x3 = hasilX(x1, x2, Fx1, Fx2);
			Fx3 = hasilFx(x3);
			abs = 0-Fx3;
			
			if (Fx3 == 0.00) {
				mPrint();				
			}else {
				if(Math.pow(Fx1, 2) > Math.pow(Fx2, 2)) {
					x1 = x3;
				}
				else {
					x2 = x3;
				}
			}
			mPrint();
			i++;
		}
	}
	
	
	public static double hasilFx(double x) {
//		Fx= x3 + x2 – 3x – 3
		double hasil;
		hasil = Math.pow(x, 3) + Math.pow(x, 2)- 3*x -3;
		return hasil;

	}
	public static double hasilX(double x1, double x2, double Fx1, double Fx2) {

		double hasil;
		hasil = ((x1*Fx2) - (x2*Fx1)) / (Fx2-Fx1);
	
		return hasil;

	}
	public static void mPrint() {
		System.out.println("---------------------------");
		System.out.println("x3\t: "+x3);
		System.out.println("Fx1\t: "+Fx1);
		System.out.println("Fx2\t: "+Fx2);
		System.out.println("Fx3\t: "+Fx3);
		System.out.println("abs\t: "+abs);
		System.out.println("---------------------------");

	}
	

}
