#include <iostream>
using namespace std;

void bacteriaCount(int m, int n, int req){
	int pro = 1;
	for(int i=0; i<n; i++){
		pro *= m;
	}
	if(pro>=req) cout << "Doctor, you can proceed with your experiment.";
	else cout << "Sorry Doctor! You need more bacteria.";
}

int main(void){

	int m, n, req; cin>>m>>n>>req;
	bacteriaCount(m, n, req);

	return 0;
}
