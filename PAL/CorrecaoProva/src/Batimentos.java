import javax.swing.JOptionPane;

public class Batimentos {

	public static void main(String[] args) {
	double A,B;
			
	A = Double.parseDouble(JOptionPane.showInputDialog("Quantos anos a pessoa viveu?:"));
	B = A*60*60*24*365.25;
    JOptionPane.showMessageDialog(null, "O total de batimentos foi de: " + B);
	}

}