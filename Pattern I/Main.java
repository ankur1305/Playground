#include <iostream>
using namespace std;

int main(void){

	int n; cin >> n;
	for(int i=0; i<=3; i++){
		for(int j=0; j<=i; j++){
			cout << n+i;
		}
		cout << "\n";
	}
	for(int i=3; i>=0; i--){
		for(int j=i; j>=0; j--){
			cout << n+i;
		}
		cout << "\n";
	}
	return 0;
}
