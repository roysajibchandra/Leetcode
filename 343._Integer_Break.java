class Solution {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        
        int ans = 1;
        while (n > 4) {
            ans *= 3;
            n -= 3;
        }
        
        return ans * n;
        // int sum = 0;
        // int product = 1;

        // for(int i=1; i<=9; i++){
        //     if(n-i==0 && n!=i){
        //         sum += i;
        //         product *= i;
        //     }


        // }

        // return product;

        // // if(sum>=product){
        // //     return sum;
        // // }
        // // else{
        // //     return product;
        // // }
    }
}
