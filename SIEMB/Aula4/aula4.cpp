
#include <iostream> 
#include <iomanip> 
#include <cstdlib> 
using namespace std; 
main() 
{ 
float nota1,nota2,media,presenca; 
system("CLS"); 
cout << "Digite a 1a nota: "; cin >> nota1; 
cout << "Digite a 2a nota: "; cin >> nota2; 
cout << "Digite a % da presenca: "; cin >> presenca; 
media = (nota1+nota2)/2 ;
if(media>=6 && presenca >= 75 || media>=5 && presenca>=85)
	cout << "Aluno APROVADO"; 
else 
	cout<< "Aluno REPROVADO"; 
system("PAUSE"); 
}
