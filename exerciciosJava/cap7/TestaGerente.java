class TestaGerente{
	public static void main (String[] args){
		Gerente gerente = new Gerente();
		
		gerente.setNome("Joaquin Passarin");
		gerente.setSenha(21331);
		
		System.out.println("Gerente: "+gerente.getNome());
		gerente.setSalario(5000.0);
		System.out.println("Bonificacao Recebida: "+gerente.getBonificacao());
	}
}
