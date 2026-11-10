
public class calculadora {

	public class Calculadora {
		static int sumar(int a, int b) {
		return a + b;
		}
		static int restar(int a, int b) {
		return a - b;
		}
		static int multi(int a, int b) {	
		return a * b;
		}
		public static void main(String[] args) {
		System.out.println("Calculadora");
		System.out.println("2+3=" + sumar(2, 3));
		System.out.println("5-1=" + restar(5, 1));
		System.out.println("3*9=" + multi(3, 7));
		}
		}
}
