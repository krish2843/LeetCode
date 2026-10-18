class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int [] odd = new int[nums.length/2];
        int [] even = new int [(nums.length+1)/2];
        int a=0;
        for(int i =1 ;i<nums.length;i+=2){
        
            odd[a]=nums[i];
            a++;
        }Arrays.sort(odd);
        int b =0;
        for(int i =0;i<nums.length;i+=2 ){
            
            even[b]=nums[i];
            b++;
        }
        Arrays.sort(even);
        int h = odd.length-1;
        int g= 0;
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even[g];
                g++;
            }else{
                nums[i]=odd[h];
                h--;
            }
        }
        return nums;
    }
}