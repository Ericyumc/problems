//345. Reverse Vowels of a String

class Solution {
    public String reverseVowels(String s) {
        if(s == ""){
            return "";
        }
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U'); //'charater' "String"!!!!
        //set is too troublesome, but quicker
        
        // String set = "aeiouAEIOU"; ///for string, if we use string.contains("CharSequence" == "String"), inside should be a CharSequence, not char, so we need contains(char+"") to make it charsequence
        char[] chars = s.toCharArray(); ///change String to CharArray first, so we can do exchange operation later
        // add vowels into set
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(set.contains(chars[l]) && set.contains(chars[r])){
                Character temp = chars[l];
                chars[l] = chars[r];   
                //s.charAt(l) = s.charAt(r);   // the s.charAt() return a value is not a variable, so we can not use this way
                chars[r] = temp;
                l++;
                r--;
            } else if(set.contains(chars[l])){
                r--;
            } else if(set.contains(chars[r])){
                l++;
            } else {
                l++;
                r--;
            }
        }
        return new String(chars);
    }
}