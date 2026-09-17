//        EXEMPLO 023 
 // 
 #include <iostream> 
 #include <iomanip > 
 #include <cstdlib> 
 
 using namespace std; 
 main() 
 { 
 char op; 
 float op1,op2; 
  system("CLS"); 
  cout << "Digite o tipo de operacao desejada:\n"; 
  cout << "(*) (/)\n"; 
  cout << "Operacao:"; 
  cin >> op; 
  if(op=='*') 
           { 
    cout << "digite os dois valores a serem multiplicados:"; 
    cin >> op1 >> op2; 
    cout << "\nO resultado e" << setprecision(5) << op1*op2; 
           } 
 
   else 
   { 
    cout << "digite os dois valores a serem divididos:"; 
    cin >> op1 >> op2; 
    cout<< "\nO resultado e: "<< setprecision(5) << op1/op2 << "\n"; 
   } 
  system("PAUSE"); 
 }
