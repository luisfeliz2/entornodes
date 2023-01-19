package poo;

public class PruebaAlumno {

	public static void main(String[] args) {
		Alumno2 a1 = new Alumno2("luis", "feliz", 19, 3214, Genero.M);
		Alumno2 a2 = new Alumno2("fsd", "afsd", 454, 3214, Genero.M);
		Alumno2 a3= Alumno2.de();
		System.out.println(a1);
		System.out.println(a1.equals(a2));
		System.out.println(a1.mayorQue(a2));
		Grupo daw= new Grupo("dawa",33);
		daw.addAlumno(a1);
		daw.addAlumno(a3);
		daw.addAlumno(a2);
		System.out.println(daw);
	}

}
