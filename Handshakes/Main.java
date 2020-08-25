#include<iostream>
using namespace std;
long long int fact(int n){
  if(n==0) return 1;
  return n*fact(n-1);
}
int main()
{
  int n; cin >> n;
  long long int num = fact(n);
  long long int deno = fact(n-2)*2;
  cout << num/deno;
}