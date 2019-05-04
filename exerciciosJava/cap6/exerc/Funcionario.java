class Funcionario{
	private	String nome;
	private	double salario;
	private	String entrada;
	private	int rg;
	Data dataDeEntrada;

	public Funcionario(){}
	public Funcionario(String nome){
		this.nome = nome;
	}

	void recebeAumento(double aumento){
		this.salario +=aumento;
	}
	double calculaGanhoAnual(){
		this.salario = this.salario*12;
		return salario;
	}
	void mostra(){
		System.out.println("Nome do Funcionario: "+getNome());
		System.out.println("Salario: "+getSalario());
		System.out.println("Data de entrada: "+getEntrada());
		System.out.println("Registro Geral: "+getRg());
		System.out.println("Ganho anual: "+this.calculaGanhoAnual());
	}
}
