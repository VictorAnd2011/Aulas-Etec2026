import javax.swing.JOptionPane;

public class ex1_ler10notas {

	public static void main(String[] args) {
		double[] lista = new double[10];
		double digitado;
		
		for(int i = 0;i<=9;i++)
		{
			digitado = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + i + "° nota: "));
			
			lista[i] = digitado;
			
		}

		for (int i=0;i<=9;i++)
		{
			System.out.println("lista[" + i + "]=" + lista[i]);
		}
		
	}

}
