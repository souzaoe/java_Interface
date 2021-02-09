package aplicativo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidade.Aluguel;
import modelo.entidade.Veiculo;
import modelo.servicos.ServicoAluguel;
import modelo.servicos.TaxaImposto;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss"); 
		
		System.out.println("Entre a data de aluguel: ");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine(); 
		System.out.print("Saida (dd/MM/yyyy hh:ss): ");
		Date inicio = sdf.parse(sc.nextLine()); 
		System.out.print("Retorno (dd/MM/yyyy hh:ss): ");
		Date fim = sdf.parse(sc.nextLine()); 
		
		Aluguel al = new Aluguel(inicio, fim, new Veiculo(modelo)); 
		
		System.out.print("Informe o preco por hora: ");
		double precoPorHora = sc.nextDouble(); 
		System.out.println("Informe o preco por dia: ");
		double precoPorDia = sc.nextDouble(); 
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoPorDia, precoPorHora, new TaxaImposto()); 
		
		servicoAluguel.procesNota(al);
		
		System.out.println("Aluguel: ");
		System.out.println("Base de pagamento: " + String.format("%.2f", al.getNota().getBasePagamento()));
		System.out.println("Taxa: " + String.format("%.2f", al.getNota().getTaxa()));
		System.out.println("Total Pagamento: " + String.format("%.2f", al.getNota().getTotalPg()));

		sc.close(); 
		

	}

}
