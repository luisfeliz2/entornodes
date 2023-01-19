package poo;

public class BicicletaMontanya extends Bicicleta{

	private int suspension;



	public BicicletaMontanya(int velocidadActual, int platoActual, int piñonActual,int suspensions) {
		super(velocidadActual, platoActual, piñonActual);
		this.suspension=suspensions;
	}





	
	

	public void cambiarSuspension (int suspension) {
		this.suspension=suspension;
	}
	
	public String toString() {
		return super.toString()+"Suspension:"+suspension;
	}
	

	

}
