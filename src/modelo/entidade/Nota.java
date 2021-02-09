package modelo.entidade;

public class Nota {
	
	private Double basePagamento; 
	private Double taxa; 
	
	public Nota() {		
	}

	public Nota(Double basePagamento, Double taxa) {
		this.basePagamento = basePagamento;
		this.taxa = taxa;
	}

	public Double getBasePagamento() {
		return basePagamento;
	}

	public void setBasePagamento(Double basePagamento) {
		this.basePagamento = basePagamento;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double getTotalPg() {
		return getBasePagamento() + getTaxa(); 
	}
	
	

}
