import java.util.Scanner;

class ArraysJ{
	public static void main (String[] args){
		int[] notas = new int[3]; // inicia um vetor de inteiros
		String[] alun = new String[3]; // inicia um vetor de string

		Scanner entrada = new Scanner(System.in); //inicia o scanner pra capturar os dados do usuario
		Scanner enter = new Scanner(System.in);// idem a linha anterior
		
		for(int i=0;i<notas.length;i++){ //rotina para capturar os valores que o usuario informar
			System.out.print("Inserir nota "+(i+1)+": ");
			notas[i] = entrada.nextInt(); // armazena, no vetor, o valor que o usuario informou
		}
		for(int i=0;i<alun.length;i++){ //idem a rotina anterior
			System.out.print("Inserir Nome do Aluno "+(i+1)+": ");
			alun[i] = enter.nextLine();
		}
/*		for(int i=0;i<notas.length;i++){
			System.out.printf("Nota %d: %d\n", i+1,notas[i]);	
		}
		for(int j=0;j<alun.length;j++){
			System.out.printf("Aluno %d: %s\n", j+1,alun[j]);	
		}*/
		
		for (int i=0;i<alun.length;i++){ //rotina para exibir o aluno e a nota correspondente
			for(int j=0;j<notas.length;j++){ // as rotinas percorrem ambos os vetores
				if(i==j){ // se os indices forem iguais
				System.out.printf("Aluno %s com a nota: %d\n",alun[i],notas[j]); //exibir o nome e a nota do aluno
				} // esta rotina foi necessaria para evitar que o programa exibisse dados repetidos.
			}
		}	
	}
}

