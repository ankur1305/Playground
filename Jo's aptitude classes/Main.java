#include <iostream>
#include <algorithm>
using namespace std;

void checkAnswer(int x, int y, int z, int ans){
	__gcd(__gcd(x, y), z) == ans ? cout << "Answer is correct." : cout << "Answer is wrong.";
}

int main(void){

	int a, b, c, ans; cin >> a >> b >> c >> ans;
	checkAnswer(a, b, c, ans);

	return 0;
}
