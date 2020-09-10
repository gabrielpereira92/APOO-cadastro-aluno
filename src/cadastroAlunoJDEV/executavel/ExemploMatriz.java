package cadastroAlunoJDEV.executavel;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		
		int notas[][] = new int [2][3];
		
		notas[0][0] = 67;
		notas[0][1] = 45;
		notas[0][2] = 56;

		notas[1][0] = 89;
		notas[1][1] = 78;
		notas[1][2] = 95;
		
		for (int poslinha = 0; poslinha < notas.length; poslinha++) {
			System.out.println("Linha: "+poslinha);
			
			for(int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna++ ) {
				System.out.println("Matriz: "+notas[poslinha][poscoluna] );
			}
		}
		
	}

}
