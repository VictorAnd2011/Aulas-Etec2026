import javax.swing.JOptionPane;

public class ex4_JuncaoDeVetores {

	public static void main(String[] args) {
		double[] A = new double[13];
		double[] B = new double[15];
		double[] C = new double[28];
		
		for(int i = 0;i<13;i++)
		{
			A[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "° elemento para A:"));
		}
		for(int i = 0;i<15;i++)
		{
			B[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "° elemento para B"));
		}
		
		for(int i = 0;i<13;i++)
		{
			C[i] = A[i];
		}
		
		for(int i = 13;i<28;i++)
		{
			C[i] = B[i-13];
		}
		
		for(int i =0;i<28;i++)
		{
			System.out.println(C[i]);
		}
	}

}
