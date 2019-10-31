class Solution {
public:
    string decodeString(string s) {
         vector<int> nums;
    vector<string> subparts(1, "");
    int num = 0;
    for (int i=0;i<s.size();i++) {
        char c = s[i];
      if (isalpha(c)) {
        subparts.back() += c;
      } else if (isdigit(c)) {
        num = num * 10 + c - '0';
      } else if (c == '[') {
        nums.push_back(num);
        num = 0;
        subparts.push_back("");
      } else if (c == ']') {
        while (nums.back()-- > 0) subparts.end()[-2] += subparts.back();
        nums.pop_back();
        subparts.pop_back();
      }
    }
    return subparts.back();
    }
};