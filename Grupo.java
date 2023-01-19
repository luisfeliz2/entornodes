package poo;

import java.util.Arrays;

public class Grupo {
	private String nombre;
	private Alumno2[] grupo;
	
	public Grupo(String nombre, int taman) {
		this.nombre=nombre;
		this.grupo= new Alumno2[taman];
		
	}

	public boolean addAlumno(Alumno2 a1) {
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i]==null) {
				grupo[i]=a1;
				return true;
						
				
			}
			
		}
		return false;
		
	}
	public String toString() {
		return nombre+":"+Arrays.toString(grupo);
	}
	
	public boolean hayRrepe() {
		for (int i = 0; i < grupo.length; i++) {
			if (grupo [i]==null) continue;
			
			
			for (int j = i+1; j < grupo.length; j++) {
				if (grupo[j]==null) continue;
				if (grupo[j].equals(grupo[i])) return true;
				
			}
			
		}
		return false;
	}
}
