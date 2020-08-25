#include <iostream>

using namespace std;

void swapping(int *x, int *y){
    int temp;
    temp = *x;
    *x = *y;
    *y = temp;
}

int main()
{
    int a, b; cin >> a >> b;
    cout << "Before swapping a= " << a << " and b=" << b << endl;
    swapping(&a, &b);
    cout << "After swapping a= " << a << " and b=" << b;

    return 0;
}
