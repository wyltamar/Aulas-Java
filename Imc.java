package capitulo3;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
	
		double imc;
		double altura;
		double peso;
		
		String peso1 = JOptionPane.showInputDialog("Digite seu peso");
		peso = Double.valueOf(peso1);
		
		String altura1 = JOptionPane.showInputDialog("Digite sua altura");
		altura = Double.valueOf(altura1);
		
		imc = peso/(altura*altura);
		
		if(imc <= 18.5) {
			JOptionPane.showMessageDialog(null, "Voc� est� abaixo do peso ideal!");
		}else if(imc > 18.5 && imc <= 24.9) {
			JOptionPane.showMessageDialog(null, "Voc� est� saud�vel!");
		}else if(imc > 24.9 && imc <= 29.9) {
			JOptionPane.showMessageDialog(null, "Voc� est� com peso em ecesso!");
		}else if(imc > 29.9 && imc <= 34.9) {
			JOptionPane.showMessageDialog(null, "Voc� est� com obesidade grau 1!");
		}else if(imc > 34.9 && imc <= 39.9) {
			JOptionPane.showMessageDialog(null, "Voc� est� com obesidade grau 2!");
		}else {
			JOptionPane.showMessageDialog(null, "Voc� est� com obesidade grau 3!");
		}
	}

}
