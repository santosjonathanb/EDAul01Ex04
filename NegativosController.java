package controller;

public class NegativosController {

	public NegativosController() {
		super();
	}
	public int negativos(int vetor[], int i, int x) {
		while(i>=0) {	//tenho posições de vetor para varrer? condição de parada
			if (vetor[i] < 0) {   // o valor é negativo?
				x++;
				i--;
			} else {
				i--;
				return negativos(vetor, i, x);//chamada da próxima função
			}
		}
		return x;		
	} 		
}
