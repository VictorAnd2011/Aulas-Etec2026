	#include <iostream> 
 	#include <cstdio>  	
	#include <cstdlib> 
 	using namespace std; 
 	main() 
 	{ 
 	int num = 0; 
 	 	system("CLS");  
 	 	cout << "estes sao todos os numeros impares ate 50: \n" ;
		while (num < 50) 
 	 	{ 
 	 	 	num++; 
 	 	 	
 	 	 	if (num % 2 == 0)
			{
 	 	 		continue;	
 	 	 	}
 	 	 	cout << num << "\n"; 
 	 	} 
 	 	system("PAUSE"); 
 	} 

