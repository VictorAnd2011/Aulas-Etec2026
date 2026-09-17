import javax.swing.JOptionPane;

public class Medidas {

	public static void main(String[] args) {
	double P,PG,J,M;
		
	P = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida em Pés:"));
	PG = P * 12;
	J = P / 3;
	M = J / 1760; 
	JOptionPane.showMessageDialog(null, "O resultado é: " + PG + " Polegadas, " + J + " Jardas e " + M + " Milhas");

	}

}
