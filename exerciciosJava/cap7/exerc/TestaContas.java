public class TestaContas{
	public static void main(String[] args){
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		c.atualiza(0.1);
		cc.atualiza(0.1);
		cp.atualiza(0.1);
		
		System.out.println("Valor na Conta1: "+c.getSaldo());
		System.out.println("Valor na Conta Corrente: "+cc.getSaldo());
		System.out.println("Valor na Conta Poupanca: "+cp.getSaldo());
		
	}
}
