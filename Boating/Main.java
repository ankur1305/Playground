#include <iostream>
using namespace std;

int main(){
	int n, a, c; cin >> n >> a >> c;
	if((a*75)+(c*30) > n) cout << "Boat will drow";
	else cout << "Boat is stable";
}