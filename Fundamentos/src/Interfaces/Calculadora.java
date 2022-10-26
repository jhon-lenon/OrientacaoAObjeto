package Interfaces;
/**
* Interface de exemplo para exercicio da aula 4 de orientacao a objeto.
**/

public class Calculadora implements OperacoesMatematicas {
	
	@Override
	public void soma(double operando1, double operando2) {
		System.out.println("Soma :" + (operando1 + operando2));
	}
	
	@Override
	public void subitracao(double operando1, double operando2) {
		System.out.println("Soma :" + (operando1 - operando2));
	};
	
	@Override
	public void multiplicacao(double operando1, double operando2) {
		System.out.println("Soma :" + (operando1 * operando2));
	}
	
	@Override
	public void divisao(double operando1, double operando2) {
		System.out.println("Soma :" + (operando1 / operando2));
	}	


}
