class Funcionario{
	String nome;
	double salario;
	String entrada;
	int rg;
	Data dataDeEntrada;

	void recebeAumento(double aumento){
		this.salario +=aumento;
	}

	double calculaGanhoAnual(){
		this.salario = this.salario*12;
		return salario;
	}
	void mostra(){
		System.out.println("Nome do Funcionario: "+this.nome);
		System.out.println("Salario: "+this.salario);
		System.out.println("Data de entrada: "+this.entrada);
		System.out.println("Registro Geral: "+this.rg);
		System.out.println("Ganho anual: "+this.calculaGanhoAnual());
		System.out.println("Dia "+this.dataDeEntrada.dia);
		System.out.println("Mes "+this.dataDeEntrada.mes);
		System.out.println("Ano "+this.dataDeEntrada.ano);
	}
}
