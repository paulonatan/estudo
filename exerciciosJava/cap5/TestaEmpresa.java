class TestaEmpresa{
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.nome = "Hugo";
                f1.salario = 100;
                f1.recebeAumento(50);
                f1.entrada = "01 de janeiro de 2016";
                f1.rg = 1234567;
		
                empresa.adiciona(f1);
		
		f2.nome = "Danilo";
                f2.salario = 100;
                f2.recebeAumento(50);
                f2.entrada = "02 de janeiro de 2016";
                f2.rg = 7654321;
		
                empresa.adiciona(f2);
		empresa.mostraEmpregado();
	}
}
