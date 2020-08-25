#include <iostream>
using namespace std;

int main(void){
	int n; cin >> n;
	int count=0;
	while(n>1){
		if(n%2==0){
			cout << n << endl;
			n /= 2;
		} 
		else{
			cout << n << endl;
			n = 3*n + 1;
		}
		count++;
	}
	cout << "1" << "\n" << count ;
	return 0;
}
