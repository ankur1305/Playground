#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
    int n, cm=0, cf=0; cin >> n;
    int *arr = (int *)malloc(n*sizeof(int));
    for(int i=0; i<n; i++){
        cin >> *(arr + i);
        if(*(arr + i)%2==0) cf++;
        else cm++;
    }
    cout << cm << "\n" << cf;

    return 0;
}