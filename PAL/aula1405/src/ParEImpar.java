import javax.swing.JOptionPane;

public class ParEImpar {

	public static void main(String[] args) {
		double v,v1;
				
				v = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
				
				v1 = v % 2;
				
				
				if (v1!=0)
				{
					JOptionPane.showMessageDialog(null, "Impar");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Par");
				}
				
				
				
			}

			
		}