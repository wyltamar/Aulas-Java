package capitulo5;

import javax.swing.JOptionPane;

public class Questao9 {

	public static void main(String[] args) {
		
		int contF = 0, contM = 0, contMediaMasc = 0, soma1 = 0,
				soma2 = 0, contMediaFem = 0, contFaixH = 0, menorIdade = 0 ;
		
		int fundamental = 0, medio = 0, superior = 0, pos = 0;
		double media1 = 0, media2 = 0, percHomFaix = 0;
		String resposta;
		Candidato candidato = new Candidato();
		
		do {
			
			candidato.setNome(JOptionPane.showInputDialog("Nome do candidato:"));
			candidato.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do candidato:")));
			candidato.setEscolaridade(JOptionPane.showInputDialog("Escolaridade do candidato:"));
			candidato.setSexo(JOptionPane.showInputDialog("Sexo:"));
			candidato.setExperiencia(JOptionPane.showInputDialog("Possui experiência:"));
			
			if(candidato.getSexo().equalsIgnoreCase("feminino")) {
				contF++;
				if(candidato.getExperiencia().equalsIgnoreCase("sim")) {
					contMediaFem++;
					soma2 += candidato.getIdade();
					media2 = soma2/contMediaFem;
					
					menorIdade = candidato.getIdade();
					if(menorIdade > candidato.getIdade()) {
						menorIdade = candidato.getIdade();
					}
				}
				
			}
			else if(candidato.getSexo().equalsIgnoreCase("masculino")) {
				contM++;
				if(candidato.getExperiencia().equalsIgnoreCase("sim")) {
					contMediaMasc++;
					soma1 += candidato.getIdade();
					media1 = soma1/contMediaMasc;	
				}
				
				if(candidato.getIdade() > 35 && candidato.getIdade() < 45) {
					contFaixH++;
					
					percHomFaix = (contFaixH * 100)/contM;
				}
			}
			
			if(candidato.getEscolaridade().equalsIgnoreCase("fundamental")) {
				fundamental++;
			}
			else if(candidato.getEscolaridade().equalsIgnoreCase("médio")) {
				medio++;
			}
			else if(candidato.getEscolaridade().equalsIgnoreCase("superior")) {
				superior++;
			}
			else if(candidato.getEscolaridade().equalsIgnoreCase("pos graduado")) {
				pos++;
			}
			
			resposta = JOptionPane.showInputDialog("Deseja cadastrar outro candidato? sim ou não");
			
		} while (resposta.equalsIgnoreCase("sim"));
		
		System.out.println("========================== RELATÓRIO ====================================");
		System.out.println();
		System.out.println("Sexo feminino, total = " +contF);
		System.out.println("Sexo masculino, total = " +contM);
		System.out.println("Média de idade dos homens com experiência é de:" +media1+ "anos");
		System.out.println("Média de idade das mulheres com experiência:"+media2+ "anos");
		System.out.println("O percentual dos homens com idade entre 35 e 45 anos são:" +percHomFaix+"%");
		System.out.println("A menor idade entre as mulheres com experiência é :"+menorIdade+ "anos");
		System.out.println("Escolaridade:");
		System.out.println("Candidatos com nível fundamental:" +fundamental);
		System.out.println("Candidatos com nível médio:" +medio);
		System.out.println("Candidatos com nível superior:" +superior);
		System.out.println("Candidatos com pós graduação:" +pos);
		
		System.out.println("==========================================================================");
	}

}
