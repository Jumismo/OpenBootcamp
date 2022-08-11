package sec8_ejer1;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		p1.setEdad(18);
		p1.setNombre("Pepe");
		p1.setTelefono(999999999);
		
		System.out.println("La persona " + p1.getNombre() + " tiene " + p1.getEdad() + " años y su número es " + p1.getTelefono());
	}

}


class Persona {
	private int edad;
	
	private String nombre;
	
	private int telefono;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}