package br.com.caelum.ed;

public class Vetor {
	//private Aluno[] alunos = new Aluno[100];
	private int totalDeObjetos = 0;

	private Object[] objetos = new Object[100];
	public void adiciona(Object objeto){
        this.garantaEspaco();
        this.objetos[this.totalDeObjetos]=objeto;
        this.totalDeObjetos++;
}
	
	private void garantaEspaco(){
		if(this.totalDeObjetos == this.objetos.length){
			Object[] novaArray = new Object[this.objetos.length*2];
			for(int i=0;i<this.objetos.length;i++){
				novaArray[i] = this.objetos[i];
			}
			this.objetos = novaArray;
		}
	}
	
	public void adiciona(Aluno aluno){
		this.garantaEspaco();
		this.objetos[this.totalDeObjetos] = aluno;
		this.totalDeObjetos++;
	}
	
	public void adiciona(int posicao, Aluno aluno){
		this.garantaEspaco();
		if(!this.posicaoValida(posicao)){ //se a posicao informada não existir, o programa retornara uma mensagem de erro.
			throw new IllegalArgumentException("Posicao invalida, tente novamente.");
		}
		for (int i = this.totalDeObjetos -1;i >= posicao;i-=1){
			this.objetos[i+1] = this.objetos[i];
		}
		this.objetos[posicao] = aluno;
		this.totalDeObjetos++;
	}
	public Object pega(int posicao){ 
		if(!this.posicaoOcupada(posicao)){ //se a posicao informada não existir, o programa retornara uma mensagem de erro.
			throw new IllegalArgumentException("Posicao invalida, tente novamente.");
		}
		return this.objetos[posicao];
	}
	
	public void remove(int posicao){
		if(!this.posicaoOcupada(posicao)){ //se a posicao informada não existir, o programa retornara uma mensagem de erro.
			throw new IllegalArgumentException("Posicao invalida, tente novamente.");
		}
		for(int i=posicao; i< this.totalDeObjetos-1;i++){
			this.objetos[i] = this.objetos[i+1];
		}
		this.totalDeObjetos--;
	}
	public boolean posicaoValida(int posicao){
		return posicao >= 0 && posicao <= this.totalDeObjetos;
	}
	public boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.totalDeObjetos; //vai retornar a posicao do elemento dentro do vetor
	}
	public boolean contem(Aluno aluno){
		for(int i=0;i < this.totalDeObjetos;i++){ //percorre todo vetor
			if(aluno.equals(this.objetos[i])){ //se encontrar um valor que existe no vetor
				return true; //retorna verdade
			}
		}
		return false; //se não encontrar, retornar falso.
	}
	public int tamanho(){
		return this.totalDeObjetos;
	}
	public String toString(){ //metodo para exibr o valor de uma string
		if(this.totalDeObjetos == 0){ //se o total de objetos no vetor for igual a zero
			return "[]"; //será exibido os colchetes vazios.
		}
		StringBuilder builder = new StringBuilder(); //iniciando a implementação para o caso de não ser vazio o vetor
		builder.append("["); //primeiro colchete
		
		for (int i=0;i< this.totalDeObjetos -1;i++){ //total de objetos -1 para pegar o valor exato de elementos no vetor
			builder.append(this.objetos[i]); //cada valor que for encontrado
			builder.append(", "); //será separado por virgula e um espaço simples.
		}
		builder.append(this.objetos[this.totalDeObjetos -1]); //quando encontrar o ultimo valor do vetor
		builder.append("]"); //será inserido o colchete para fechar a exibição
		return builder.toString(); //e retornar aos que foram encontrados.
		//return Arrays.toString(objetos);
	}
}
