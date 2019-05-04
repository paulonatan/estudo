import java.util.Scanner;
class Fact{
	public static void main(String[] args){
		Scanner l = new Scanner(System.in); //inicia o scanner como entrada do sistema
		System.out.print("Insira o valor para calcular o fatorial: "); //pede ao usuario o valor a ser calculado
		int x = l.nextInt(); //atribui o valor digitado anteriormente a variavel x
		int q = 1; //variavel para iniciar o for

		for(int i=1;i<=x;i++){ // para i entre 1 e o valor de x, incremente o i ate x
			q=q*i; //q vai receber ele vezes i
		}
		System.out.print("O resultado de "+x); //resultado do fatorial
		System.out.println("! = "+q);
	}
}
