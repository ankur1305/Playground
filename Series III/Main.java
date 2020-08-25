#include <iostream>
using namespace std;

int main(void){

	int n, start=6; cin>>n;
	for(int i=1; i<=n; i++){
		cout << start << " ";
		start += 5*i;
	}

	return 0;
}
