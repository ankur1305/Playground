#include <iostream>

using namespace std;

int digitRoot(int n){
    int sum = 0;
    if(n <= 9) return n;
    while(n){
        sum = sum + n%10;
        n /= 10;
    }
    digitRoot(sum);
}

int main()
{
    int n; cin >> n;
    cout << digitRoot(n);
    return 0;
}