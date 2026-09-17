import javax.swing.JOptionPane;

public class Cavalos {

	public static void main(String[] args) {
	double C,NF;
		
	C = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de cavalos:"));
    NF = C * 4;
    JOptionPane.showMessageDialog(null, "São necessarias " + NF + " ferraduras");

	}

}
