#include <iostream>

using namespace std;

int main()
{
    int n, m, sum=0; cin >> n >> m;
    int arr[n];
    for(int i=0; i<n; i++){
        cin >> arr[i];
        sum += arr[i];
    }

    if(sum <= m) cout << "YES";
    else cout << "NO";
    
    return 0;
}