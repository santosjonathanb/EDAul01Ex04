package controller;

public class NegativosController {

	public NegativosController() {
		super();
	}
	public int negativos(int vetor[], int i, int x) {
		while(i>=0) {	//tenho posi��es de vetor para varrer? condi��o de parada
			if (vetor[i] < 0) {   // o valor � negativo?
				x++;
				i--;
			} else {
				i--;
				return negativos(vetor, i, x);//chamada da pr�xima fun��o
			}
		}
		return x;		
	} 		
}
