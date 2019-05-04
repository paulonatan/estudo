class Array{
	public static void main (String[] args){
		int[] idades = new int[10];
		for(int i=0;i< idades.length;i++){
			idades[i] = i*10;
		}
//		for(int i=0;i < idades.length;i++){
		for(int x : idades){
			System.out.println(x);
		}
	}
}
