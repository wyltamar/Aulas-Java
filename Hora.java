package capitulo4;

public class Hora {
	
	private  double hora;
	private  double minuto;
	private  double segundo;
	
	public Hora() {
		
	}
	
	public void setHora(double hora) {
		this.hora = hora;
	}
	
	public double getHora() {
		return this.hora;
	}
	
	public void setMinuto(double minuto) {
		this.minuto = minuto;
	}
	
	public double getMinuto() {
		return this.minuto;
	}
	
	public void setSegundo(double segundo) {
		this.segundo = segundo;
	}
	
	public  double getSegundo() {
		return this.segundo;
	}
	
	@Override
	public String toString() {
		return ""+hora+ ":" +minuto+ ":"+segundo;
	}

}
