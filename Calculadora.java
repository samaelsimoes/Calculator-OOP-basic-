package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		while( true ) {
			String msg 		  = " ";
			double dResultado = 0;
			
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao 	= EntradaSaida.infop();
			
			switch( acao ) {
				case 1:
					dResultado = numero1 + numero2;
					msg 	   = "A soma �:";
				break;
				case 2:
					dResultado = numero1 - numero2;
					msg 	   = "A subtra��o �:";
				break;
				case 3:
					dResultado = numero1 * numero2;
					msg 	   = "A multiplica��o �:";
				break;
				case 4:
					if( numero2 != 0 ) {
						dResultado = numero1 / numero2;
						msg		   = "A divis�o �:";
					} else {
						dResultado = 9999999999.99999999;
						msg 	   = "Erro de divis�o por zero";
					}
				break;
				case 5:
					System.exit(0);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Op��o Inexistente", "Erro",
					JOptionPane.OK_CANCEL_OPTION);
					break;
			}
			EntradaSaida.mostraResultado(msg + dResultado);
		}
	}
}
