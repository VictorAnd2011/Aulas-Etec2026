package aula1009;

public class while1_idadePedroJair {

	public static void main(String[] args) {
		int ano = 0;
		double P = 1.2, J = 1.3;
		
		while(P<=J)
		{
			P = P + 0.03;
			J = J + 0.02;
			ano++;
		}
		
		System.out.print(ano);;
		
		
	}

}
