package mx.com.cuh;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "";
		
		//Se instancia un objeto de la clase persona con nombre persona1 y sus atributos iniciales
		Persona persona1 = new Persona("Julio", (short)182, (short)23, (double)210);
		Persona comerciante = new Comerciante ("Luis Fernandez", (short)170, (short)20, (double)190);
		Persona constructor = new Constructor ("Luis Perez", (short)160, (short)29, (double) 200);
		Persona jardinero = new Jardinero ("Marco Perez", (short)184, (short)25, (double)250);
		Persona soldado = new Soldado("Soldado1", (short) 180, (short) 25, 2000.0);
		Persona panadero = new Panadero("Panadero1", (short) 170, (short) 30, 1500.0);

		
		//llamar el metodo checar para cada trabajador y registar entrada
		persona1.checar();
		comerciante.checar();
		constructor.checar();
		jardinero.checar();
		soldado.checar();
		panadero.checar();
		
		//Implementacion especifica del metodo trabajar de la clase Padre en las clases Hijas
		persona1.trabajar();
		comerciante.trabajar();
		constructor.trabajar();
		jardinero.trabajar();
		soldado.trabajar();
		panadero.trabajar();
		
		
		//Implementacion especifica del metodo alimentarse de la clase Padre en las clases Hijas
		persona1.alimentarse();
		comerciante.alimentarse();
		constructor.alimentarse();
		jardinero.alimentarse();
		soldado.alimentarse();
		soldado.alimentarse();
		
		
		//Implementacion especifica del metodo cobrar de la clase Padre en las clases Hijas
		persona1.cobrar();
		comerciante.cobrar();
		constructor.cobrar();
		jardinero.cobrar();
		soldado.cobrar();
		panadero.cobrar();
		
		
		//llamar el metodo checar para cada trabajador y registrar salida
		persona1.checar();
		comerciante.checar();
		constructor.checar();
		jardinero.checar();
		soldado.checar();
		panadero.checar();
		
		
	}

}
