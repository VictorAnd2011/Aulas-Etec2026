import javax.swing.JOptionPane;

public class Frango {

	public static void main(String[] args) {
	double QF,total_gasto;
			
	QF = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de frangos:"));
    total_gasto = QF * 11;
    JOptionPane.showMessageDialog(null, "O gasto total é de: " + total_gasto);

	}

}
