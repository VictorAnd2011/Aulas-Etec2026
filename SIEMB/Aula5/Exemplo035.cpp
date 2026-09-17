	//         EXEMPLO  035 
 	//         Imprime so os pares 
 
 	#include <iostream> 
 	#include <cstdio>  	
	#include <cstdlib> 
 	using namespace std; 
 	main() 
 	{ 
 	int num = 0; 
 	 	system("CLS");  
		while (num <= 20) 
 	 	{ 
 	 	 	num++; 
 	 	 	
 	 	 	if (num % 2 != 0)
			{
 	 	 		continue;	
 	 	 	}
 	 	 	cout << num << "\n"; 
 	 	} 
 	 	system("PAUSE"); 
 	} 

