package capitulo3;

import javax.swing.JOptionPane;

public class VelocidadeMedia {

	public static void main(String[] args) {
		
		double velocidadeMedia;
		double variacaoEspaco;
		double intervaloTempo;
		double pontoChegada;
		double pontoPartida;
		double tempoFinal;
		double tempoInicial;
		
		String pontoDeChegada = JOptionPane.showInputDialog("Digite o ponto de chegada em KM");
		pontoChegada = Double.valueOf(pontoDeChegada);
		
		String pontoDePartida = JOptionPane.showInputDialog("Digite o ponto de partida em KM");
		pontoPartida = Double.valueOf(pontoDePartida); 
		
		
		variacaoEspaco = pontoChegada/pontoPartida;
		
		String tempoFinalPerc = JOptionPane.showInputDialog("Digite o tempo final");
		tempoFinal = Double.valueOf(pontoDeChegada);
		
		String tempoInicialPerc = JOptionPane.showInputDialog("Digite o tempo inicial");
		tempoInicial = Double.valueOf(pontoDePartida); 
		
		
		intervaloTempo = tempoFinal/tempoInicial;
		
		velocidadeMedia = variacaoEspaco/intervaloTempo;
		
		System.out.println("A velocidade média é = "+velocidadeMedia +" km por hora");

	}

}
