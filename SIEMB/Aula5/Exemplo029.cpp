//    EXEMPLO 029 
 	//   Uso do comando while 
 	//    Jogo de advinhacao 
 	#include <iostream>  
	#include <cstdlib> 
 	using namespace std; 
main() 
 	{ 
 	int i,num; 
 	char resp=0; 
 
 	 	while(resp != 'n') 
 	 	{ 
 	 	 	system("CLS"); 
 	 	 	cout << "Voce tem 5 tentativas para acertar o numero \n\n"; 
 	 	 	i=0; 
 	 	 	while(i!=5) 
 	 	 	{ 
 	 	 	 	cout << "\ndigite sua "<< i+1 << "a tentativa: "; cin >> num; 
 	 	 	 	if(num == 3450) 
 	 	 	 	{ 
 	 	 	 	 	cout << "Parabens, voce acertou"; 
 	 	 	 	 	system("PAUSE");  	 	 	 	 	exit(0); 
 	 	 	 	} 
 	 	 	 	cout << "Voce ERROU!!\n"; 
 	 	 	 	i++; 
 	 	 	} 
 	 	 	cout << "Puxa que azar, errou as cinco vezes!!!\n" 
 	 	 	        << "Quer tentar novamente? (s/n)"; 
 	 	 	cin >> resp; 
 	 	} 
 	} 

