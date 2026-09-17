import javax.swing.JOptionPane;

public class Moedas {

	public static void main(String[] args) {
	double q1,q5,q10,q25,q50,q100,t;
			
	q1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 1 centavo?"));
	q5 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 5 centavos?"));
	q10 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 10 centavos?"));
	q25 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 25 centavos?"));
	q50 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 50 centavos?"));
	q100 = Double.parseDouble(JOptionPane.showInputDialog("Qual a quantidade de moedas de 1 real?"));
    t = q1*0.01 + q5*0.05 + q10*0.1 + q25*0.25 + q50*0.5 + q100; 
    JOptionPane.showMessageDialog(null, "A soma total em reais é de: " + t);
	}

}