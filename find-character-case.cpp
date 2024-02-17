#include <bits/stdc++.h>

using namespace std;

int main() {
    char ch;
    cin >> ch;

    bool alpha = isalpha(ch);
    bool upper = isupper(ch);

    if (alpha && upper) {
        cout << 1 << endl;
    } else if (alpha && !upper) {
        cout << 0 << endl;
    } else {
        cout << -1 << endl;
    }
}