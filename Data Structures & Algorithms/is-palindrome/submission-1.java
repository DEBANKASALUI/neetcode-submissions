class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       return IntStream.range(0,str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
    }
}
