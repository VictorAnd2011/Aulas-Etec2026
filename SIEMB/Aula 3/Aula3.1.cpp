 #include <iostream>  
 #include <cstdlib> 
 
 using namespace std; 
 main() 
 { 
 int v,r;
 system("CLS");
    cout << "digite um valor qualquer:"; 
    cin >> v;
    
    r = v % 2;
    
    if(r==0)
 	{
 		cout << "O numero e par \n";
 	}
 	
 	else
 	{
 		cout << "O numero e impar \n";
 	}
 system("PAUSE");
}


