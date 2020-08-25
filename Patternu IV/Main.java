#include <iostream>
using namespace std;

int main(void){

	int n; cin >> n;
	for(int i=1; i<=n; i++){
		if(i%2 != 0){
			for(int j=1; j<=n-1; j++){
			cout << i;
			}
			cout << i+1 << "\n";
		} else {
			cout << i+1;
			for(int j=1; j<=n-1; j++){
				cout << i;
			}
			cout << "\n";
		}
	}

	return 0;
}
