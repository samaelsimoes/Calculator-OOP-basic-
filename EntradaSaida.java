package calculadora;

import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int infonum1() {
		int num1 = Integer.parseInt( JOptionPane.showInputDialog("Informe o primeiro n�mero") );
		return num1;
	}

	public static int infonum2() {
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero") );
		return num2;
	}

	public static int infop() {
		int op = Integer.parseInt( JOptionPane.showInputDialog( "Escolha um c�lculo b�sico: \n "
																+ "1 - Soma \n"
																+ "2 - Subtra��o \n"
																+ "3 - Multiplica��o \n"
																+ "4 - Divis�o \n"
																+ "5 - Sair do programa \n"
															   ) );
		return op;
	}

	public static void mostraResultado(String retorno) {
		JOptionPane.showMessageDialog( null, retorno, "Resultado", JOptionPane.OK_CANCEL_OPTION );
	}
}
