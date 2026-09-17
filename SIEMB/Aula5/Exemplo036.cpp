//         EXEMPLO 036 
 	//         Exemplo de break e continue 
 
 	#include <iostream> 
 	#include <cstdio>  	
	#include <cstdlib> 
 	using namespace std; 
 	main() 
 	{ 
 	int numero;  	 	system("CLS"); 
 	 	while(cout << " Digite um numero par: ") 
 	 	{ 
 	 	 	cin >> numero; 
 	 	 	if ((numero % 2) == 1) 
 	 	 	{ 
 	 	 	 	cout << "Eu disse um numero par"; 
 	 	 	 	continue; 
 	 	 	} 
 	 	 	break; 
 	 	} 
 	 	cout << "Obrigado. Eu precisava disso!\n";  	 	system("PAUSE"); 
 	} 

