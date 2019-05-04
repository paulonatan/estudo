package br.com.k19.modelo;

import br.com.k19.modelo.Curso;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class CursosBean {
	private List<Curso> cursos = new ArrayList<Curso>();
	private Curso curso = new Curso();
	private FacesMessage mensagem = new FacesMessage("Turma adicionada!");
	
	
	public void adicionaCurso(){
		this.cursos.add(this.curso);
		this.curso = new Curso();
	}
	
	public List<Curso> getCursos(){
		return this.cursos;
	}
	public void setCurso(List<Curso> cursos){
		this.cursos = cursos;
	}
	public Curso getCurso(){
		return this.curso;
	}
	public void setCurso(Curso curso){
		this.curso = curso;
	}
	public FacesMessage getMessage(){
		return this.mensagem;
	}
}
