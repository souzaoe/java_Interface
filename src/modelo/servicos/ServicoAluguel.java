package modelo.servicos;

import modelo.entidade.Aluguel;
import modelo.entidade.Nota;

public class ServicoAluguel {
	
	private Double precoPorDia; 
	private Double precoPorHora; 
	
	private TaxaImposto taxImposto;

	public ServicoAluguel(Double precoPorDia, Double precoPorHora, TaxaImposto taxImposto) {
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.taxImposto = taxImposto;
	} 
	
	public void procesNota(Aluguel aluguel) {
		long t1 = aluguel.getInicio().getTime();
		long t2 = aluguel.getFim().getTime(); 
		double hours = (double)(t2 - t1) / 1000 / 60 / 60; 
		
		double basePg; 
		if (hours <= 12.0) {
			basePg = Math.ceil(hours) * precoPorHora; 			
		}
		else {
			basePg = Math.ceil(hours / 24) * precoPorDia; 
		}
		
		double taxa = taxImposto.taxa(basePg);
		
		aluguel.setNota(new Nota(basePg, taxa));
	}
}
