	#include <iostream> 
 	#include <cstdio>  	
	#include <cstdlib> 
 	using namespace std; 
 	main() 
 	{ 
 		int num,i,r;
 		i = 0;
 		system("CLS");
 		cout << "Digite um numero qualquer: ";
 		cin >> num;
 		
 		while(i<10)
 			{
 				i++;
 				
 				r = num*i;
 				
 				cout << r << "\n";
 			}
 	
 		cout << "Essa e a tabuada do " << num << "\n";
 		system("PAUSE");
 	
 	}
