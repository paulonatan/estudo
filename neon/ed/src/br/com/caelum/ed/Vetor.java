package br.com.caelum.ed;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	private void garantaEspaco(){
		if(this.totalDeAlunos == this.alunos.length){
			Aluno[] novaArray = new Aluno[this.alunos.length*2];
			for(int i=0;i<this.alunos.length;i++){
				novaArray[i] = this.alunos[i];
			}
			this.alunos = novaArray;
		}
	}
	
	public void adiciona(Aluno aluno){
		this.garantaEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno){
		this.garantaEspaco();
		if(!this.posicaoValida(posicao)){ //se a posicao informada não existir, o programa retornara uma mensagem de erro.
			throw new IllegalArgumentException("Posicao invalida, tente novamente.");
		}
		for (int i = this.totalDeAlunos -1;i >= posicao;i-=1){
			this.alunos[i+1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	public Aluno pega(int posicao){ 
		if(!this.posicaoOcupada(posicao)){ //se a posicao informada não existir, o programa retornara uma mensagem de erro.
			throw new IllegalArgumentException("Posicao invalida, tente novamente.");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao){
		if(!this.posicaoOcupada(posicao)){ //se a posicao informada não existir, o programa retornara uma mensagem de erro.
			throw new IllegalArgumentException("Posicao invalida, tente novamente.");
		}
		for(int i=posicao; i< this.totalDeAlunos-1;i++){
			this.alunos[i] = this.alunos[i+1];
		}
		this.totalDeAlunos--;
	}
	public boolean posicaoValida(int posicao){
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}
	public boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.totalDeAlunos; //vai retornar a posicao do elemento dentro do vetor
	}
	public boolean contem(Aluno aluno){
		for(int i=0;i < this.totalDeAlunos;i++){ //percorre todo vetor
			if(aluno.equals(this.alunos[i])){ //se encontrar um valor que existe no vetor
				return true; //retorna verdade
			}
		}
		return false; //se não encontrar, retornar falso.
	}
	public int tamanho(){
		return this.totalDeAlunos;
	}
	public String toString(){ //metodo para exibr o valor de uma string
		if(this.totalDeAlunos == 0){ //se o total de alunos no vetor for igual a zero
			return "[]"; //será exibido os colchetes vazios.
		}
		StringBuilder builder = new StringBuilder(); //iniciando a implementação para o caso de não ser vazio o vetor
		builder.append("["); //primeiro colchete
		
		for (int i=0;i< this.totalDeAlunos -1;i++){ //total de alunos -1 para pegar o valor exato de elementos no vetor
			builder.append(this.alunos[i]); //cada valor que for encontrado
			builder.append(", "); //será separado por virgula e um espaço simples.
		}
		builder.append(this.alunos[this.totalDeAlunos -1]); //quando encontrar o ultimo valor do vetor
		builder.append("]"); //será inserido o colchete para fechar a exibição
		return builder.toString(); //e retornar aos que foram encontrados.
		//return Arrays.toString(alunos);
	}
}
