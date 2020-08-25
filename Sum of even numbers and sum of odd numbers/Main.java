#include <iostream>

using namespace std;

int main()
{
    int n, osum=0, esum=0; cin >> n;
    int arr[n];
    for(int i=0; i<n; i++){
        cin >> arr[i];
        if(arr[i]%2==0) esum += arr[i];
        else osum += arr[i];
    }
    cout << "The sum of the even numbers in the array is " << esum << endl;
    cout << "The sum of the odd numbers in the array is " << osum << endl;
    
    return 0;
}
