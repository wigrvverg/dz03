package by.training.simplestapp.main;

public class Main05 {

	public static void main(String[] args) {
		double a = 1;
		double b = Math.toDegrees(a);
		System.out.println("радины в градусы " + b);
		double c = b * 60;
		System.out.println("градусы в минуты " + c);
		double r = c * 60;
		System.out.println("минуты в секунды " + r);

	}

}
