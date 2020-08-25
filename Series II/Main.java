#include <iostream>
using namespace std;

int main(void){

	int n, start=11; cin>>n;
	for(int i=1; i<=n; i++){
		cout << start*start << " ";
		start += 4;
	}

	return 0;
}
