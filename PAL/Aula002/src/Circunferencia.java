import javax.swing.JOptionPane;

public class Circunferencia {

	public static void main(String[] args) {
	double R,area,Rp;
		
	R = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio:"));
	Rp= Math.pow(R, 2);
	area = 3.14 * Rp;
	JOptionPane.showMessageDialog(null, " A área é de: " + area);
	}

}
