import javax.swing.JOptionPane;

public class ex2_SomaABC {

	public static void main(String[] args) {
		double[] a = new double[5];
		double[] b = new double[5];
		double[] c = new double[5];
		
		for(int i = 0;i<5;i++) {
			a[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + i + "° valor para A"));
			b[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + i + "° valor para B"));
		}
		
		for(int i = 0;i<5;i++) {
			c[i] = a[i] + b[i];
		}
		
		for(int i = 0;i<5;i++) {
			System.out.println(c[i]);
		}

		
	}

}
