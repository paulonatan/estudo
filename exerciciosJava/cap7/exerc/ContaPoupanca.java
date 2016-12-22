public class ContaPoupanca extends Conta{
	private int numero;
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa * 3;
	}
	
}
