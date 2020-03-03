import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		String valorUm = JOptionPane.showInputDialog("Insira um número:\n");
		String valorDois = JOptionPane.showInputDialog("Insira outro número:\n");
		int valorA = parseInt(valorUm);
		int valorB = parseInt(valorDois);
		double resultado = 0;
		
		resultado = somar(valorA, valorB);
		System.out.println("A somatória dos números é: " + resultado);
		
		resultado = subtrair(valorA, valorB);
		System.out.println("A subtracao dos números é: " + resultado);
		
		resultado = multiplicar(valorA, valorB);
		System.out.println("A somatória dos números é: " + resultado);
		
		resultado = dividir(valorA, valorB);
		System.out.println("A subtracao dos números é: " + resultado);
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
