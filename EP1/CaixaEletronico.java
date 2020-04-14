/*********************************************************************/
/**   ACH2001 - Introdução à Programação                            **/
/**   EACH-USP - Primeiro Semestre de 2020                          **/
/**   104 - Norton Trevisan Roman                                   **/
/**                                                                 **/
/**   Primeiro Exercício-Programa                                   **/
/**                                                                 **/
/**   Jeniffer Florinda Martins               10377966              **/
/**                                                                 **/
/**   14 de abril de 2020                                           **/
/*********************************************************************/

/*
	Caixa eletrônico das Ilhas Weblands, com estoque ilimitado de cédulas
	de B$50,00, B$10,00, B$5,00 e B$1,00.
*/
public class CaixaEletronico {
	// Número de cédulas de B$50,00
	static int n50;
	
	// Número de cédulas de B$10,00
	static int n10;

	// Número de cédulas de B$5,00
	static int n5;
	
	// Número de cédulas de B$1,00
	static int n1;


	/*
		Determina a quantidade de cada nota necessária para totalizar
		um determinado valor de retirada, de modo a minimizar a quantidade
		de cédulas entregues.
		
		Abastece as variáveis globais n50,n10, n5 e n1 com seu respectivo
		número de cédulas.
		
		Parâmetro:
			valor - O valor a ser retirado
	*/
	static void fazRetirada(int valor) {
		if(valor > 0) {
		/*
		 *	Fazendo a conta da maior nota para a menor, 
		 *	apenas precisamos observar o resto da divisão 
		 *	da variável *valor* pelas notas maiores.
		 */
			n50 = (int) (valor / 50);
			n10 = (int) ((valor % 50) / 10);
			n5  = (int) (((valor % 50) % 10) / 5);
			n1  = (int) (((valor % 50) % 10) % 5);
		} 
		else n50 = n10 = n5 = n1 = -1;
	}
	
	/*
		Apenas para seus testes. ISSO SERÁ IGNORADO NA CORREÇÃO
	*/
	public static void main(String[] args) {
		// escreva seu código (para testes) aqui

		// Exemplo de teste:
		fazRetirada(10909);
		System.out.println("Notas de 50: "+n50);
		System.out.println("Notas de 10: "+n10);
		System.out.println("Notas de 5:  "+n5);
		System.out.println("Notas de 1:  "+n1);
	}
}
