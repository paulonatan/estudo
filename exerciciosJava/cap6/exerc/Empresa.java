class Empresa{
	Funcionario[] empregados;
	String cnpj;
	
	void adiciona(Funcionario f){
		for(int i=0;i<empregados.length;i++){
			this.empregados[i]=f;
		}
	}
	void mostraEmpregado(Funcionario[] t){
		for(int i=0;i<this.empregados.length;i++){
			if(this.empregados == t){
	                        System.out.println("Funcionario na posição: "+t);
			}
                }
	}
}
