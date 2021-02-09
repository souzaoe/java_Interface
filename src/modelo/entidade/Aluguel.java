package modelo.entidade;

import java.util.Date;

public class Aluguel {
	
	private Date inicio; 
	private Date fim; 
	
	private Veiculo veiculo; 
	private Nota nota; 
	
	public Aluguel() {		
	}

	public Aluguel(Date inicio, Date fim, Veiculo veiculo) {
		this.inicio = inicio;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}
	
}
