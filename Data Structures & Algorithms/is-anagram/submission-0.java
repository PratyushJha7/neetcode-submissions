class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=  t.length()){
            return false;
        }
        char[] sSort=s.toCharArray();//converts string to char
        char[] tSort=t.toCharArray();
        Arrays.sort(sSort);//sort array in ascending order
        Arrays.sort(tSort);

        return Arrays.equals(sSort,tSort);
    }
}
