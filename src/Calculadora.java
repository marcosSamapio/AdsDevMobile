import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		String valorUm = JOptionPane.showInputDialog("Insira um n�mero:\n");
		String valorDois = JOptionPane.showInputDialog("Insira outro n�mero:\n");
		int valorA = parseInt(valorUm);
		int valorB = parseInt(valorDois);
		double resultado = 0;
		
		resultado = somar(valorA, valorB);
		
		System.out.println("A somat�ria dos n�meros �: " + resultado);		
	}

	public static int somar(int valorA, int valorB) {
		return valorA + valorB;
	}
	
	public static int parseInt(String valor) {
		return Integer.parseInt(valor);
	}
}
