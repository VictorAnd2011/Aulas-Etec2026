// EXEMPLO 009
// Uso de cin com múltiplas entradas
#include <iostream>
#include <cstdlib>
using namespace std;
main()
{
int idmae,idpai;
system("CLS");
cout << "Digite a idade de seu pai e de sua mãe:";
cin >> idpai >> idmae;
cout << "\nSeu pai e sua mãe tem juntos " << idpai+idmae << " anos";
}
