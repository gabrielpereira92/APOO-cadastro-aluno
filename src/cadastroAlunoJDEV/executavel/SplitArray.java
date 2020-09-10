package cadastroAlunoJDEV.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
	//M�todo Split serve para converter um texto em um Array de String, onde quebrar� o texto por algum ponto padr�o exemplo: . , /	
		String texto = "Gabriel, Universidade Infantil, 89, 78, 67, 99 ";
		String[] arrayTexto = texto.split(",");
		
		System.out.println(arrayTexto[0]);
		System.out.println(arrayTexto[1]);
		System.out.println(arrayTexto[2]);
		System.out.println(arrayTexto[3]);
		System.out.println(arrayTexto[4]);
		System.out.println(arrayTexto[5]);
		System.out.println("======================");

		//Convers�o de um Array para uma lista
		List<String> lista = Arrays.asList(arrayTexto);
		
		for (String valorString : lista) {
			System.out.println(valorString);
			
		}
		
		//Convers�o de Lista para Array.
		System.out.println("======================");
		String[] conversaoArray = lista.toArray(new String[6]);
		
		for(int pos= 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}

}
