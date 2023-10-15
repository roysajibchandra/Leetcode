class Solution {
    int mod = (int) 1e9 + 7;
    public int numWays(int steps, int arrLen) {
        return getNum(0, steps, Math.min(steps, arrLen), new Integer[steps + 1][steps + 1]);
    }

    public int getNum(int idx, int s, int len, Integer[][] cache){
        if(idx < 0 || idx == len){
            return 0;
        }
        if(idx == 0 && s == 0){
            return 1;
        }
        if(s == 0 || s - idx < 0){
            return 0;
        }
        if(cache[idx][s] != null){
            return cache[idx][s];
        }
        int res = getNum(idx, s - 1, len, cache);
        res += getNum(idx + 1, s - 1, len, cache);
        res %= mod;
        res += getNum(idx - 1, s - 1, len, cache);
        res %= mod;
        cache[idx][s] = res;
        return res;
    }
}
