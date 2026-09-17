import javax.swing.JOptionPane;
public class Hotel {

	public static void main(String[] args) {
		int d,t,v;
		
		String nome = JOptionPane.showInputDialog(null, "Qual o nome do hóspede?");
		
		d = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a quantidade de diárias?"));
		
		if(d<15)
		{
			t = 20;
			v = (d * 300) + t;
			JOptionPane.showMessageDialog(null, "O valor total a pagar do hóspede " + nome + " é de: " + v);
		}
		else {
			if(d==15)
			{
				t = 14;
				v = (d * 300) + t;
				JOptionPane.showMessageDialog(null, "O valor total a pagar do hóspede " + nome + " é de: " + v);
			}
			else {
				t = 12;
				v = (d * 300) + t;
				JOptionPane.showMessageDialog(null, "O valor total a pagar do hóspede " + nome + " é de: " + v);
			}
		}

	}

}
