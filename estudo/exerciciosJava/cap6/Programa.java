class Programa{
	public static void main(String[] args){
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Hugo");
		f1.setSalario(100);
		f1.recebeAumento(50);
		f1.setEntrada("01 de janeiro de 2016");
		f1.setRg(1234567);
		
		f1.mostra();
	//	System.out.println("Salario Atual: "+f1.salario);
	//	System.out.println("Ganho Anual: "+f1.calculaGanhoAnual());
	}
}
