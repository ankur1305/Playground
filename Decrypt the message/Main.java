#include<iostream>
using namespace std;

int main()
{
	int a, b; cin >> a >> b;
	int res = a+b;
	int sum = 0 ;
	for(int i=1; i<res; i++){
		if(res%i==0) sum += i;
	}
	sum==res ? cout << "They can read the message" : cout << "They can't read the message";
}