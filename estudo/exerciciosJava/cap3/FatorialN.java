class FatorialN{
	public static void main(String[] args){
		int x = 10;
		int q = 1;

		for(int i = 1;i<=x;i++){
			q=q*i;
			System.out.print("O resultado de "+i);
			System.out.println("! = "+q);
		}
		System.out.println("\n");
		System.out.println("Programa executado com sucesso.");
	}
}

