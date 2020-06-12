class RandomizedSet {
public:
    bool insert(int val) {
        auto it = data.find(val);
        if (it == data.end())
        {
            data.emplace_hint(it, val);
            return true;
        }
        return false;
    }

    bool remove(int val) {
        auto it = data.find(val);
        if (it != data.end())
        {
            data.erase(it);
            return true;
        }
        return false;
    }
    
    int getRandom() {
        int shift = rand() % data.size();
        auto res = data.begin();
        advance(res, shift);
        return *res;
    }
private:
    unordered_set<int> data;
};
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet* obj = new RandomizedSet();
 * bool param_1 = obj->insert(val);
 * bool param_2 = obj->remove(val);
 * int param_3 = obj->getRandom();
 */