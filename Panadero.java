package mx.com.cuh;

public class Panadero extends Persona{

	public Panadero(String nombre, short altura, short edad, double sueldo) {
		super(nombre, altura, edad, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	
	boolean trabajando = false;
	
	public String trabajar() {
		trabajando = !trabajando;
		String trabajo = "Panadero";
		return trabajo;
	}
	
	@Override
	public void cobrar() {
		System.out.println("Cobrar sueldo de panadero");
	}
	
	@Override
	public void alimentarse() {
		System.out.println("Hora de comer para panadero");
	}
	
			
	@Override
	public void checar() {
		if (!trabajando)
			System.out.println("Ingreso registrado");
		else
			System.out.println("Salida registrada");
	}

}
