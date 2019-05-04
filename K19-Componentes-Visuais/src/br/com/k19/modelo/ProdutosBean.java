package br.com.k19.modelo;

import br.com.k19.modelo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ProdutosBean{
	private List<Produto> produtos = new ArrayList<Produto>();

	public ProdutosBean(){
		this.produtos.add(new Produto("Camisa Branca",29.9));
		this.produtos.add(new Produto("Calça Jeans",69.9));
	}
	
	public List<Produto> getProdutos(){
		return this.produtos;
	}
	public void setProduto(List<Produto> produtos){
		this.produtos = produtos;
	}
}
