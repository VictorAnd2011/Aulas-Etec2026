import javax.swing.JOptionPane;
public class for6_valoresLidos {

	public static void main(String[] args) {
		int i,v;
		
		for(i=1;i<=10;i++)
		{
			v = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o " + i + "° valor"));
			JOptionPane.showMessageDialog(null, v);
		}

	}

}
