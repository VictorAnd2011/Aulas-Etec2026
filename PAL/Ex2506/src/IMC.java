import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		double imc,p,h,a;
		
		p = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o seu peso em kg?"));
		h = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a sua altura em metros?"));
		
		a = Math.pow(h,2);
		
		imc = p / a;
		
		if(imc<20)
		{
			JOptionPane.showMessageDialog(null, "Abaixo do peso, e seu imc é de: " + imc);
		}
		else {
			if(imc >= 20 && imc < 25)
			{
				JOptionPane.showMessageDialog(null, "Peso normal, e seu imc é de: " + imc);
			}
			else {
				if(imc >=25 && imc < 30)
				{
					JOptionPane.showMessageDialog(null, "Sobre peso, e seu imc é de: " + imc);
				}
				else {
					if(imc >= 30 && imc <40)
					{
						JOptionPane.showMessageDialog(null, "Obeso, e seu imc é de: " + imc);
					}
					else {
						if(imc > 40)
						{
							JOptionPane.showMessageDialog(null, "Obeso MÓRBIDO, e seu imc é de: " + imc);
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
			
	}
		
		
}


