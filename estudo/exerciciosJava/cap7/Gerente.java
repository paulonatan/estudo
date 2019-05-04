class Gerente extends Funcionario {
	protected int senha;
	protected int numeroDeFuncionariosGerenciados;

	public boolean autentica(){
		if(this.senha == senha){
			System.out.println("Acesso Permitido!");
			return true;
		}
		else{
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	public void setSenha(int senha){
		this.senha = senha;
	}
	public double getBonificacao(){
		return super.getBonificacao() + 1000;
	}
}
