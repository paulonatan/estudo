class ProgramaP{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();		
		Data data = new Data();

		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		f1.dataDeEntrada = data;
		f1.rg = 1234567;

		f2.nome = "Danilo";
		f2.salario = 100;
		f2.recebeAumento(50);
		f2.entrada = "02 de janeiro de 2016";
		f2.rg = 7654321;
		
		f1.mostra();
		System.out.println("\n");
		f2.mostra();
		System.out.println("\n");

		if(f1 == f2){
			System.out.println("Iguais");
		}
		else{
			System.out.println("Diferentes");
			
		}
	}
}
