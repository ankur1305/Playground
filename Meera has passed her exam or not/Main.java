#include <iostream>

using namespace std;

int main()
{
    int n; cin >> n;
    int a[n];
    for(int i=0; i<n; i++){
        cin >> a[i];
    }
    int req, flag=0; cin >> req; 
    for(int i=0; i<n; i++){
        if(a[i] == req){
            flag = 1;
            break;
        }
    }
    if(flag==0) cout << "She failed";
    else cout << "She passed her exam";

    return 0;
}
