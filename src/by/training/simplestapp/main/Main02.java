package by.training.simplestapp.main;

public class Main02 {
	public static void main (String[] args) {
		double a=5;
		double b=14;
		double c=4;
		double d=Math.pow(b, 2)-4*a*c;
		if (d<0) {
			System.out.println("корней нет");
			return;
		}
		if (d==0) {
			System.out.println("x="+(-b+Math.sqrt(d)/(2*a)));
			return;
		}
		if (d>0) {
			System.out.println("x="+(-b+Math.sqrt(d)/(2*a)));
			System.out.println("x="+(-b-Math.sqrt(d)/(2*a)));
		}
	}

}
