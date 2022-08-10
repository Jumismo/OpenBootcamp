package sec3_ejer1;

public class Main {

	public static void main(String[] args) {
		System.out.println(sumar(2,4,6));
		
		Coche c = new Coche();
		
		c.setPuertas(1);
		
		System.out.println("El coche tiene " + c.puertas + " puertas");
		
		
	}
	
	public static int sumar(int a, int b, int c) {
		return a + b + c;
	}
}
