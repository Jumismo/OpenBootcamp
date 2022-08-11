package sec9_ejer1;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.setEdad(18);
		c1.setNombre("José");
		c1.setTelefono(999999999);
		c1.setCredito(1000);
		System.out.println(c1.getNombre() + " - " + c1.getEdad() + " - " + c1.getTelefono() + " - " + c1.getCredito());
		
		Trabajador t1 = new Trabajador();
		
		t1.setEdad(23);
		t1.setNombre("Manuel");
		t1.setTelefono(999992999);
		t1.setSalario(2000);
		
		System.out.println(t1.getNombre() + " - " + t1.getEdad() + " - " + t1.getTelefono() + " - " + t1.getSalario());

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

class Cliente extends Persona {
	private int credito;

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}
}

class Trabajador extends Persona {
	private int salario;

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}