#include<iostream>
using namespace std;

int s(int n){
  int sum=0;
  while(n){
    sum += n%10;
    n /= 10;
  }
  return sum;
}
int main()
{
  int n; cin>>n;
  if(n%s(n)==0) cout << "Harshad Number";
  else cout << "Not Harshad Number";
}