#include <iostream>

using namespace std;

int main()
{
    string s; getline(cin, s);
    for(auto i = s.rbegin(); i != s.rend(); i++){
        cout << *i;
    }

    return 0;
}
