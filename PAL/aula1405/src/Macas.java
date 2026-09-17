import javax.swing.JOptionPane;

public class Macas {

	public static void main(String[] args) {
		double m,p;
				
				m = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de maçãs compradas:"));
				
				if (m>=12)
				{
					p = m*2.6;
				}
				else
				{
					p = m*3.3;
				}
				
				JOptionPane.showMessageDialog(null, "O valor a ser pago é de: " + p);

			}

			
		}

