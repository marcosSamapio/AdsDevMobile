import javax.swing.JOptionPane;

public class Calculadora {
	private static double resultado = 0;
	
	public static void main(String[] args) {
		String valorUm = JOptionPane.showInputDialog("Insira um n�mero:\n");
		String valorDois = JOptionPane.showInputDialog("Insira outro n�mero:\n");
		int valorA = parseInt(valorUm);
		int valorB = parseInt(valorDois);
		
		resultado = somar(valorA, valorB);
		System.out.println("A somat�ria dos n�meros �: " + resultado);
		
		resultado = subtrair(valorA, valorB);
		System.out.println("A subtracao dos n�meros �: " + resultado);
		
		resultado = multiplicar(valorA, valorB);
		System.out.println("A somat�ria dos n�meros �: " + resultado);
		
		resultado = dividir(valorA, valorB);
		System.out.println("A subtracao dos n�meros �: " + resultado);
	}

	public static int somar(int valorA, int valorB) {
		return valorA + valorB;
	}
	
	public static int subtrair(int valorA, int valorB) {
		if (valorA >= valorB) {
			return valorA - valorB;
		} else {
			return valorB - valorA;
		}
	}
	
	public static int multiplicar(int valorA, int valorB) {
		return valorA * valorB;
	}
	
	public static int dividir(int valorA, int valorB) {
		return valorA / valorB;
	}
	
	public static int parseInt(String valor) {
		return Integer.parseInt(valor);
	}
}
