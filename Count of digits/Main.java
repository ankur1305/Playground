#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
  int n; cin >> n;
  if(n==0) cout << "1";
  else cout << floor(log10(n)+1);
}