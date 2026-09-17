import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		int id;
		double n1,n2,n3,ma,me;
		String A,b;
		
		id = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número de identificação do aluno?"));
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a nota do primeiro exercício?"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a nota do segundo exercício?"));
		n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a nota do terceiro exercício?"));
		
		me = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a média dos 3 trabalhos?"));
		
		ma = (n1 + n2*2 + n3*3 +me)/7;
		
		if(ma<4)
		{
			A = "E";
			b = "retido";
			JOptionPane.showMessageDialog(null, "o aluno de id: " + id + " foi " + b + " com conceito " +  A);
		}
		else 
		{
			if(ma<6)
			{
				A = "D";
				b = "retido";
				JOptionPane.showMessageDialog(null, "o aluno de id: " + id + " foi " + b + " com conceito " +  A);
			}
			else 
			{
				if(ma<7.5)
				{
					A = "C";
					b = "aprovado";
					JOptionPane.showMessageDialog(null, "o aluno de id: " + id + " foi " + b + " com conceito " +  A);
				}
				else
				{
					if(ma<9)
					{
						A = "B";
						b = "aprovado";
						JOptionPane.showMessageDialog(null, "o aluno de id: " + id + " foi " + b + " com conceito " +  A);
					}
					else 
					{
						if(ma>=9)
						{
							A = "A";
							b = "aprovado";
							JOptionPane.showMessageDialog(null, "o aluno de id: " + id + " foi " + b + " com conceito " +  A);
						}
					}
				}
			}
		}
		}
	}


