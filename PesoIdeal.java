package capitulo4;

import java.util.Date;

import javax.swing.JOptionPane;

public class PesoIdeal {
	public static void main(String[] args) {
		
		Date data = new Date();
		Date data2 = new Date();
		
		data2.setMonth(5);
		data2.setDate(22);
		data2.setYear(2000);
		/*
		String sexo = JOptionPane.showInputDialog("Informe se voc� � do sexo masculino ou feminino?");
		String estatura = JOptionPane.showInputDialog("Digite sua altura em metros");
		double  altura = Double.parseDouble(estatura);
		
		if(sexo.equalsIgnoreCase("masculino")) {
			
			double pesoIdeal = (72.7 * altura) - 58;
			JOptionPane.showMessageDialog(null, "Seu peso ideal � = "+pesoIdeal);
				
		}else if(sexo.equalsIgnoreCase("feminino")) {
			
			double pesoIdeal = (62.1 * altura) - 44.7;
			JOptionPane.showMessageDialog(null, "Seu peso ideal � = "+pesoIdeal);
			
		}else {
			JOptionPane.showMessageDialog(null, "G�nero inv�lido, por favor informe masculino ou feminino");
		}
		
		*/
		System.out.println("Data: "+data.toString());
		System.out.println("Data: "+data2.toString());
		
		int dias = data2.compareTo(data);
		System.out.println("diferen�a"+dias);
		
		
		long objeto1 = data.getTime();
		long objeto2 = data2.getTime();
		
		long result = objeto2 - objeto1;
		System.out.println("milesegundos diferen�a:"+result);
		
		
		System.out.println();
		
	}

}
