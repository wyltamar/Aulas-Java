package capitulo4;

public class VendaLanches {
	
	private double valorPedido;
	
	private Lanche lanche = new Lanche();
	
	private Bebida bebida = new Bebida();
	
	public VendaLanches() {
		
		
	}

	

	public double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public Lanche getLanche() {
		return lanche;
	}

	public void setLanche(Lanche lanche) {
		this.lanche = lanche;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bebida == null) ? 0 : bebida.hashCode());
		result = prime * result + ((lanche == null) ? 0 : lanche.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorPedido);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		VendaLanches other = (VendaLanches) obj;
		if (bebida == null) {
			if (other.bebida != null)
				return false;
		} else if (!bebida.equals(other.bebida))
			return false;
		if (lanche == null) {
			if (other.lanche != null)
				return false;
		} else if (!lanche.equals(other.lanche))
			return false;
		if (Double.doubleToLongBits(valorPedido) != Double.doubleToLongBits(other.valorPedido))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "VendaLanches [valorPedido=" + valorPedido + ", lanche=" + lanche + ", bebida=" + bebida + "]";
	}

	

	

}
