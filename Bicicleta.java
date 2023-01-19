package poo;

public class Bicicleta {

	protected int velocidadActual;
	protected int platoActual ;
	protected int piñonActual;
	
	public void acelerar() {
		velocidadActual*=2;
		
	}
	
	public void frenar() {
		velocidadActual/=2;
	}
	
	public void cambiarPiñon(int piñon) {
		piñonActual=piñon;
	}
	public void cambiarPlato(int plato) {
		platoActual=plato;
	}
	
	
	public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		super();
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	
	
	public String toString() {
		return "Bicicleta [velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", piñonActual="
				+ piñonActual + "]";
	}
	

	

	

}
