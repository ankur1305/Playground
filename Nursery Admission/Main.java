#include <iostream>
#include <string.h>

using namespace std;

int main()
{
    string s;
    getline(cin, s);
    cout << "The number of letters in the name is " << s.length();

    return 0;
}