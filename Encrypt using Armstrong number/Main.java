#include <iostream>
#include <bits/stdc++.h>
using namespace std;


void checkArmstrong(int x){
	int count = floor(log10(x)+1);
	int sum = 0, temp = x;
	while(x){
		sum += pow(x%10, count);
		x /= 10;
	}
	sum == temp ? cout << "Kindly proceed with encrypting" : cout << "It is not an Armstrong number";
}

int main(void){

	int m; cin>>m;
	checkArmstrong(m);

	return 0;
}
