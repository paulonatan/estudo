class Programa{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.recebeAumento(50);
		f1.entrada = "01 de janeiro de 2016";
		f1.rg = 1234567;
		
		f1.mostra();
	//	System.out.println("Salario Atual: "+f1.salario);
	//	System.out.println("Ganho Anual: "+f1.calculaGanhoAnual());
	}
}
