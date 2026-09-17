import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
	double v1,v2,media;
	
	v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
    v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
    media = (v1 + v2)/2;
    JOptionPane.showMessageDialog(null, "A média é de: " + media);

	}

}
