package questoes1a10;

import javax.swing.JOptionPane;

public class TestPesquisa {

	public static void main(String[] args) {
		
		int resp = 0, cont = 0, contFem = 0, contMasc = 0, contCabVL = 0;
		double pesoTotal = 0,idadeTotal = 0, alturaTotal = 0 ; 
		
			while(resp == 0){
				
				Pesquisa pesquisa = new Pesquisa();
				String sexo = JOptionPane.showInputDialog("Degite o sexo: (masculino ou feminino)");
				pesquisa.setSexo(sexo);
				
				String corOlho = JOptionPane.showInputDialog("Qual a cor dos olhos? (azuis,verdes ou castanhos)");
				pesquisa.setCorOlhos(corOlho);
				
				String corCabelo = JOptionPane.showInputDialog("Qual a cor dos cabelos? (louros,castanhos ou pretos)");
				pesquisa.setCorCabelo(corCabelo);
				
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa"));
				pesquisa.setIdade(idade);
				
				double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa"));
				pesquisa.setAltura(altura);
				
				int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da pessoa"));
				pesquisa.setPeso(peso);
				
				cont++;

				idadeTotal += pesquisa.getIdade();
				pesoTotal += pesquisa.getPeso();
				alturaTotal += pesquisa.getAltura();
				
				if(pesquisa.getSexo().equalsIgnoreCase("masculino")) {
					contMasc++;
				}
				else if(pesquisa.getSexo().equalsIgnoreCase("feminino")) {
					contFem++;
				}
				else{
					JOptionPane.showMessageDialog(null, "Digite um sexo válido: masculino ou feminino");
				}
				
				if(pesquisa.getCorOlhos().equalsIgnoreCase("verdes") && 
				   pesquisa.getCorCabelo().equalsIgnoreCase("louros")) {
					contCabVL++;
				}
				
				
				resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais pessoas:");
			}
		
			System.out.println("A média de idade dos participantes é igual a: "+idadeTotal/cont+ "anos");
			System.out.println("A média de peso é igual a: "+pesoTotal/cont+ "Kg");
			System.out.println("A média de altura é igual a: "+alturaTotal/cont);
			System.out.println("O percentual de mulheres é igual a: "+(contFem * 100)/cont+ " %");
			System.out.println("O percentual de homens é igual a: "+(contMasc * 100)/cont+ " %");
			System.out.println("O número de pessõas que possuem olhos verdes e cabelos louros =" +contCabVL);
	}

}
