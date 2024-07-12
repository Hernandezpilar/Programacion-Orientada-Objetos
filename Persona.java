package mx.com.cuh;

public class Persona {
	
	private short altura = 0;
	private String nombre = "";
	private short edad = 0;
	
	
	//se define constructor Persona con sus atributos principales al momento de instanciar
	 public Persona(String nombre, short altura, short edad) {
		 this.nombre = nombre;
		 this.edad = edad;
		 this.altura = altura;
	 }
	
	
	 
	public short getAltura() {
		return altura;
	}
	public void setAltura(short altura) {
		this.altura = altura;
	}
	public String getNombre() {
		nombre = "Sr." + nombre;
		return nombre;
	}
	public void mostrarNombre() {
		System.out.println(this.nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public short getEdad() {
		return edad;
	}
	public void setEdad(short edad) {
		this.edad = edad;
	}
	
	
}
