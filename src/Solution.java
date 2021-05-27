class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String comm=" ";
        for(int i=0; i<strs[0].length(); i++){
            for(int j=1; j<strs.length; j++){
                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    break;
                }
                else{
                    comm+=strs[0].charAt(i);
                }
            }
        }
        return comm;
    }

    public static void main(String[] args) {
        String[] arr = {"Flower", "Flo"};
        System.out.println(longestCommonPrefix(arr));
    }
}