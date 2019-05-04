public class AtualizadorDeContas extends Conta {
	protected double saldoTotal = 0;
	protected double selic;

	public AtualizadorDeContas(double selic){
		this.selic = selic;
	}
	public void atualiza(double taxa){
		this.saldoTotal += this.saldoTotal*selic;
	}
	public void roda(Conta c){
		System.out.println("Saldo Anterior: "+c.getSaldo());
		c.atualiza(selic);
		System.out.println("Saldo Final: "+c.getSaldo());
	}
	public double getSaldo(Conta c){
		return this.saldoTotal;
	}
}
