import javax.swing.JOptionPane;

public class Detran {

	public static void main(String[] args) {
		double a,v,t;
				
				a = Double.parseDouble(JOptionPane.showInputDialog("Que ano foi fábricado o carro?"));
				v = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do carro?"));
				
				
				
				if (a<1990)
				{
					t = v*0.015;
				}
				else
				{
					t = v*0.01;
				}
				
				JOptionPane.showMessageDialog(null, "a taxa é de: " + t);
				
			}

			
		}

