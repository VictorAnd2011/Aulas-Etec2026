
import javax.swing.JOptionPane;

public class Sucessor_Antecessor {

	public static void main(String[] args) {
		int suc, ant, x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
		suc = x + 1;
		ant = x - 1;
		JOptionPane.showMessageDialog(null, "O Sucessor é "+ suc + " e o Antecessor é "+ ant);

	}

}
