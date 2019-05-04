class Funcionario{
	private	String nome;
	private	double salario;
	private	String entrada;
	private	int rg;
	Data dataDeEntrada;

	public String getNome(){
		return this.nome;
	}
	public double getSalario(){
		return this.salario;
	}
	public String getEntrada(){
		return this.entrada;
	}
	public int getRg(){
		return this.rg;
	}
	public Data getData(){
		return this.dataDeEntrada;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setEntrada(String entrada){
		this.entrada = entrada;
	}
	public void setRg(int rg){
		this.rg = rg;
	}
	public void setData(Data dataDeEntrada){
		this.dataDeEntrada = dataDeEntrada;
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
		//System.out.println("Data de Entrada: "+getData());
		//System.out.println("Dia "+this.dataDeEntrada.dia);
		//System.out.println("Mes "+this.dataDeEntrada.mes);
		//System.out.println("Ano "+this.dataDeEntrada.ano);
	}
}
