class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int first=0;
        int second=1;
        int next=first+second;
        int i =3;
        while(i<=n){
            first =second;
            second =next;
            next=first+second;
            i++;
        }
        return next;

    }
}