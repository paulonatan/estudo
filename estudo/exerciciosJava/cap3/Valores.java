public class Valores {
	public static void main(String args[]){
		int x = 13; // CONSIDERANDO QUE O VALOR DE X SEJA 13
		int y = 0;
		while( x !=1 ){
			if( x % 2 == 0){
			   y = x/2;
		     }else{
		    	 y = 3*x+1;
		     }
			System.out.println(y);
			x = y;
		}
	}
}
