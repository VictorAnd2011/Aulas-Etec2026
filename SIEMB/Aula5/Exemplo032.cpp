//         EXEMPLO 032 
 	//         LOOP for 
 	#include <iostream>  	
	#include <cstdlib> 
 	using namespace std;  	main() 
 	{ 
 	int ascii; 
 	 	system("CLS"); 
 	 	for (ascii = 32; ascii < 256; ascii++) 
 	 	{ 
 	 	 	cout << "\t" << (char)ascii; 
 	 	 	_sleep(100); 
 	 	 	if(ascii%9 == 0) cout << "\n"; 
 	 	} 
 	 	system("PAUSE"); 
 	} 

