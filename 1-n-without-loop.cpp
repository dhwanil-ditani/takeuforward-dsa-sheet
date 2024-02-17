#include <bits/stdc++.h>

using namespace std;

void appendAll(int x, vector<int>& result) {
  if (x == 1) {
    result.push_back(x);
    return;
  }
  appendAll(x-1, result);
  result.push_back(x);
}

vector<int> printNos(int x) {
  vector<int> result;
  appendAll(x, result);
  return result;
}

int main (int argc, char *argv[]) {
  int n;
  cin >> n;
  vector<int> result = printNos(n);
  for (int r : result) {
    cout << r << " ";
  }
  cout << endl;
  return 0;
}

