import javax.swing.JOptionPane;

public class Camisas {

	public static void main(String[] args) {
	double P,G,M,ValorP;
				
	P = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de camisetas pequenas:"));
	G = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de camisetas grandes:"));
	M = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de camisetas médias:"));
	ValorP = (P * 10) + (G * 15) + (M * 12);
	JOptionPane.showMessageDialog(null, "A soma total de todas as camisetas é de: " + ValorP);

	}

}
