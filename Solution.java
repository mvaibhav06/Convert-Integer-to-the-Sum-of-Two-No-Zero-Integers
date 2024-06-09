class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] out = new int[2];
        for(int i=1; i<n; i++){
            String si = i+"";
            if(si.contains("0")){
                continue;
            }
            int a = n-i;
            String sa = ""+a;
            if(!sa.contains("0")){
                out[0] = i;
                out[1] = a;
                return out;
            }
        }
        return out;
    }
}
