import java.util.Scanner;

class Arrays{
	public static void main (String[] args){
		int[] notas = new int[3];
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<notas.length;i++){
			System.out.print("Inserir nota "+(i+1)+": ");
			notas[i] = entrada.nextInt();
		}
		for(int i=0;i<notas.length;i++){
			System.out.printf("Nota do aluno %d -> Valor armazenado: %d\n", i+1,notas[i]);
		}
	}
}
