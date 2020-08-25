#include<iostream>
using namespace std;

int main()
{
	int fdollar, fcent, ldollar, lcent; cin >> fdollar >> fcent >> ldollar >> lcent;
	double f = fdollar + fcent/100.0;
	double l = ldollar + lcent/100.0;
  	int k = l+f;
	cout << k << "\n" << (l+f-k)*100;
}