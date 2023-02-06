package poo;

import java.util.Scanner;

public class Alumno2 {
	private static Scanner leer =new Scanner (System.in);
	private String nombre;
	private String apellido;
	private int edad;
	private int NIA;
	private Genero genero;
	
	public Alumno2(String nombre, String apellido, int edad, int nIA, Genero genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		NIA = nIA;
		this.genero = genero;
	}
	

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNIA() {
		return NIA;
	}

	public void setNIA(int nIA) {
		NIA = nIA;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + NIA;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno2 other = (Alumno2) obj;
		if (NIA != other.NIA)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Alumno2 [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", NIA=" + NIA + ", genero="
				+ genero + "]";
	}
	
	
	public boolean mayorQue(Alumno2 alun) {
		
		if(this.edad > alun.edad) {
			return true;
			
		}
		
		
		return false;
		
	}
	
	public static Alumno2 de() {
		
		 String nombre;
		 String apellido;
		 int edad;
		 int NIA;
		 Genero genero;
		 System.out.println("nombre");
		 nombre=leer.nextLine();
		 System.out.println("dame el NIA o 0 para cancelar");
		 NIA = leer.nextInt();
		 leer.nextLine();
		 if(NIA==0) {
			 return null;
		 
		 }
		 
		 
		 System.out.println("Apellido");
		 apellido = leer.nextLine();
		 System.out.println("Dime tu edad");
		 
		 
		 edad=leer.nextInt();
		 leer.nextLine();
		 System.out.println("dime tu genero");
		 String letra = leer.nextLine().toUpperCase().charAt(0)+" ";
		 genero=Genero.valueOf(letra);
		 
		 return new Alumno2(nombre,apellido,edad,NIA,genero);
		 
		 
	}
	
	
	

}
