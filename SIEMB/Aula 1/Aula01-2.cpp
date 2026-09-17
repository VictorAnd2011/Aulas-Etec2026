// EXEMPLO 010
// Uso dos operadores * e /
#include <iostream>
#include <cstdlib>
using namespace std;
main()
{
float idade, dias, horas, minutos;
system("CLS");
cout << "Digite sua idade:";
cin >> idade;
dias = idade * 365;
horas = dias * 24;
minutos = horas * 60;
cout << "\nSua idade em dias e "<< dias
 << "\n em horas e "<< horas
 << "\n em minutos e " << minutos
 << "\n\n Em Venus voce teria " << idade/0.8 << " anos venusianos";
system("PAUSE");
}
