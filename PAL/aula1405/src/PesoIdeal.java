import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		String s;
		double h,p;
				
				h = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros:"));
				s = JOptionPane.showInputDialog("Qual o seu sexo? (Digite M para masculino e F para feminino)");
				
				String F;
				
				if (s.equals("F"))
				{
					p = (62.1*h)-44.7;
				}
				else
				{
					p = (72.7*h)-58;
				}
				
				JOptionPane.showMessageDialog(null, "o seu peso ideal é:" + p);
				
			}
	

			
		}

