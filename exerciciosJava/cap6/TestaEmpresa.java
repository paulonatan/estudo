class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome ("Hugo");
                f1.setSalario (100);
                f1.recebeAumento(50);
                f1.setEntrada("01 de janeiro de 2016");
                f1.setRg(1234567);
		
//                empresa.adiciona(f1);
		
		f2.setNome ("Pablo");
                f2.setSalario (200);
                f2.recebeAumento(150);
                f2.setEntrada("02 de janeiro de 2016");
                f2.setRg(7654321);
		
//                empresa.adiciona(f2);
//		empresa.mostraEmpregado();
	}
}
