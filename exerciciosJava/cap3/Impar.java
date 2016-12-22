class Impar{
	public static void main(String[] args){
		int x = 13;
		while(x%2==0 || x%2!=0){
			if(x%2==0){
				x=x/2;
			}
			else{
				x = 3*x+1;
			}
		}
		System.out.print(x);
	}
}

