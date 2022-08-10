package sec4_ejer1;

public class Main {

	public static void main(String[] args) {
		positivoNegativo(-3);
		positivoNegativo(4);
		positivoNegativo(0);
		
		printWhile(0);
		printWhile(4);
		
		
		doWhile();

		forCount();
		
		switchEstacion("Verano".toUpperCase());
		switchEstacion("Oto�o".toUpperCase());
		switchEstacion("Invierno".toUpperCase());
		switchEstacion("Primavera".toUpperCase());
		switchEstacion("Azul".toUpperCase());
	}
	
	public static void positivoNegativo(int numeroIf) {
		if(numeroIf > 0) {
			System.out.println("N�mero positivo");
		}else if(numeroIf < 0) {
			System.out.println("N�mero negativo");
		}else {
			System.out.println("El n�mero es 0");
		}
	}
	
	public static void printWhile(int numeroWhile) {		
		while(numeroWhile < 3) {
			numeroWhile++;
			System.out.println(numeroWhile);
		}
	}
	
	public static void doWhile() {
		int numeroWhile = 2;
		do {
			numeroWhile++;
			System.out.println(numeroWhile);
		}while(numeroWhile < 3);
	}
	
	public static void forCount() {
		for(int numeroFor = 0; numeroFor < 3; numeroFor++) {
			System.out.println(numeroFor);
		}
	}
	
	public static void switchEstacion(String estacion) {
		switch (estacion) {
		case "OTO�O": {
			System.out.println("Estamos en Oto�o");
			break;
		}
		case "INVIERNO": {
			System.out.println("Estamos en invierno");
			break;
		}
		case "PRIMAVERA": {
			System.out.println("Estamos en primavera");
			break;
		}
		case "VERANO": {
			System.out.println("Estamos en verano");
			break;
		}
		default:
			System.out.println("No es una estaci�n v�lida");
			break;
		}
		
	}

}
