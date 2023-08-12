package view;

import javax.swing.JOptionPane;
import controller.NegativosController;

public class Principal {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Deseja um vetor de quantas posições?"));
		int i = tamanho-1;
		int x = 0;
		int vetor[] = new int[tamanho];
		
		for (int n = 0; n<tamanho; n++){
			vetor[n] = Integer.parseInt(JOptionPane.showInputDialog("Insira qualquer valor inteiro para a posição "+ i + " do vetor:"));
		}
		
		NegativosController nc = new NegativosController();
		int res = nc.negativos(vetor, i, x);
		System.out.println("No vetor existem "+ res + " números negativos.");
	}
}
