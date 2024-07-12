package mx.com.cuh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "";
		
		//Se instancia un objeto de la clase persona con nombre personal y sus atributos iniciales
		Persona persona1 = new Persona("Julio", (short)182, (short) 23);
		
		nombre = persona1.getNombre();
		
		persona1.setNombre("Carlos");
		
		persona1.mostrarNombre();
		
		System.out.println(nombre);
		

	}

}
