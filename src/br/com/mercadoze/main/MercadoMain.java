package br.com.mercadoze.main;

import br.com.mercadoze.iu.Dialogo;

public class MercadoMain {

	public static void main(String[] args) {
		
		
		String menu = "Digite as opções: \n\n" +
				  "0 - Sair\n" +
				  "1 - Cadastros\n" +
				  "2 - Pedidos\n";
		
		boolean sair = false;
		while(!sair){
			String opcao = Dialogo.pegaValor(menu);
			switch(opcao){
				case "0":
					sair = true;
					break;
				case "1":
					(new CadastroMain()).menu();
					break;
				case "2":
					(new PedidoMain()).menu();
					break;
				default:
					Dialogo.exibeMensagem("Opção Inválida");
					break;
			}
			
		}
		
		System.exit(0);

	}

}
