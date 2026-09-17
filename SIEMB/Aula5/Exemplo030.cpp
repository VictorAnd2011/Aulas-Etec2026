	//		  EXEMPLO 030 
 	//        Uso do comando do while 
 	//        Um contador simples 
 
 	#include <iostream>
	#include <cstdlib> 
 	using namespace std; 
 	main() 
 	{ 
 	int i=0,num; 
 	 	system("CLS"); 
 	 	cout << ********************************************\n" "
		  << *****         Contador simples         *****\n" "
		  << ********************************************\n" 
 	 	cout << "\n\n\n\n"; 
 	 	cout << "Contando:  "; 
 	 	do 
 	 	        { 
 	 	 	 	cout << i << ""; 
 	 	 	 	_sleep(200);  	 	 	 	i=i+1; 
 	 	        }  	 	while(i<50); 
 	 	system("PAUSE"); 
 	} 

