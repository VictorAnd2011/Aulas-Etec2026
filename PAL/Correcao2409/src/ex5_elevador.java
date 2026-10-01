import javax.swing.JOptionPane;

public class ex5_elevador {

	public static void main(String[] args) {
		String e;
		int a=0, b=0, c=0,i;
		
		for(i=1;i<=5;i++)
		{
			e = JOptionPane.showInputDialog(null, "Qual elevador você mais usa? (a, b ou c)");
			
			if(e.equals("a"))
			{
				a++;
			}
			else {
				if(e.equals("b"))
				{
					b++;
				}
				else {
					c++;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, a + " " + b + " " + c);
		

	}

}
