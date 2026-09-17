// EXEMPLO 011
// Uso do operador %
#include <iostream >
#include <cstdlib>
using namespace std;
main()
{
int amigos, laranjas, cadaum, restam;
system("CLS");
cout << "Digite o numero de laranjas que estao dentro da cesta:";
cin >> laranjas;
cout << "\nDigite o numero de amigos comiloes que voce tem:";
cin >> amigos;
restam = laranjas%amigos;
cadaum = (laranjas - restam)/amigos;
cout << "\nCada amigo seu recebera"<< cadaum << " laranjas"
 << "\ne sobrara(m)" << restam << "laranja(s) no cesto";
system("PAUSE");
}
