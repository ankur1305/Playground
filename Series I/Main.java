#include <iostream>
using namespace std;

int main(void){

	int n; cin>>n;
  float start=0.5;
	for(int i=1; i<=n; i++){
		cout << start << " ";
		start = start * 3;
	}

	return 0;
}
