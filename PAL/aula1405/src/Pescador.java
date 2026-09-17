import javax.swing.JOptionPane;

public class Pescador {

	public static void main(String[] args) {
		double p,e,m;
				
				p = Double.parseDouble(JOptionPane.showInputDialog("Digite a massa de peixes:"));
				
				
				
				if (p>50)
				{
					e = p-50;
					m = e*4;
				}
				else
				{
					e = 0;
					m = 0;
				}
				
				JOptionPane.showMessageDialog(null, "O excesso é de: " + e + " e a multa é de: " + m);
				
			}

			
		}