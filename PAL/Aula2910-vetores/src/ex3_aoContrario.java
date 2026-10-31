import javax.swing.JOptionPane;

public class ex3_aoContrario {

	public static void main(String[] args) {
		double[] x = new double[10];
		double[] y = new double[10];
		
		for(int i = 0;i<10;i++)
		{
			x[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "° número"));
		}
		
		for(int i = 0;i<10;i++)
		{
			y[9-i] = x[i];	
		}
		
		for(int i = 0;i<10;i++)
		{
			System.out.println("x[" + i + "] = " + x[i] + " y[" + i + "] = " + y[i]);
		}

	}

}
