package by.training.simplestapp.main;

public class Main06 {

	public static void main(String[] args) {
		double a=7;
		double b=3;
		double c=8;
		double h=Math.cos((Math.pow(a, 2)+Math.pow(c, 2)-Math.pow(b, 2))/(2*a*c));
		System.out.println(Math.toDegrees(h));
		double k=Math.cos((Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/(2*a*b));
		System.out.println(Math.toDegrees(k));
		double m=Math.cos((Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c));
		System.out.println(Math.toDegrees(m));
		
		

	}

}
