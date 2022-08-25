package br.com.fiap.cursoads.fintech;

public class Testes {
	
	public static void main(String[] args) {
		
		// Teste da classe "Usuário"
		
		System.out.println("*****************************************************");
		
		System.out.println("TESTANDO A CLASSE 'Usuario':");
		
		Usuario user = new Usuario("Hiram","Abiff","Masculino","23/08/1973","hiram@fiap.com.br","minhasenha123");
		
		user.getDadosUsuario();
		
		System.out.println("*****************************************************");
		
		
		// Teste da classe "ContaCorrente"
		
		System.out.println("TESTANDO A CLASSE 'ContaCorrente':");
		
		ContaCorrente cc = new ContaCorrente();
		
		CategoriaGasto alimentacao = new CategoriaGasto ();
		
		cc.incluirRecebimento(1000, "salario");
		
		boolean retornoGasto = cc.incluirGasto(100, alimentacao);
		
		if (retornoGasto) {
			System.out.println("Saque processado com sucesso");
		} else {
			System.out.println("saque não efetuado. Saldo insuficiente");
		}
		
		System.out.println("Saldo final da conta corrente: " + cc.getSaldo());	
		
		System.out.println("*****************************************************");
		
		
		// Teste da classe "ContaInvestimento"
		
		System.out.println("TESTANDO A CLASSE 'ContaInvestimento':");
		
		ContaInvestimento ci = new ContaInvestimento();
		
		ci.aplicar(1000);		
		ci.resgatar(10);		
		ci.setPrazo(12);	// prazo em meses	
		ci.setTaxaDeJuros(0.5);	// taxa de juros ao mês	
		ci.calcularRendimento();
		
		System.out.println("Saldo atual: " + ci.getSaldo());
		System.out.println("Saldo projetado no vencimento: " + ci.getRendimento());
		
		System.out.println("*****************************************************");
		
		
			
	}
	
}
