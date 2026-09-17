#include <iostream>
#include <cstdio>
#include <cstdlib>
using namespace std;

main()
{
	int num;
	system("CLS");
	
	for(num = 0;num < 50; num++)
	{
		if(num % 2 == 0)
		{
			continue;
		}
		else
		{
			cout << num << "\n"	;
		}
	}
	
	system("PAUSE");
	
}

