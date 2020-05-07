package capitulo5;

public class Questao2 {

	public static void main(String[] args) {

		long pedro = 150;
		long lucas = 110;
		int anos = 0;
		int anos2 = 0;
		long pedro2 = 150;
		long lucas2 = 110;
		
		while (pedro != lucas) {
			
			pedro += 2;
			lucas += 3;
			
			anos++;
			
		} 
		
		while (pedro2 >= lucas2) {
			
			pedro2 += 2;
			lucas2 += 3;
			
			anos2++;
			
		} 
		
		System.out.println("São necessários "+anos+ " anos para que Pedro e Lucas tenham o mesmo tamanho");
		System.out.println("Para que Lucas seja maior do que pedro são necessário que se passe " +anos2+ " anos");
	}

}
