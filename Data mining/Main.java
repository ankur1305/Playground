#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int sumOfDigits(vector<int> vi){
	int sum=0;
	for(auto x : vi){
		sum += x;
	}
	return sum;
}

int main(void){

	int n; cin >> n;
	vector<int> ev, ov;
	while(n){
		int rem = n % 10;
		if((rem)%2 != 0) ov.push_back(rem);
		else ev.push_back(rem);
		n /= 10;
	}
	if(sumOfDigits(ev) != sumOfDigits(ov)) cout << "No";
	else cout << "Yes";

	return 0;
}
