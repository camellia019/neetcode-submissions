class Solution {
    public boolean isPalindrome(String s) {
        String lowerStr = s.toLowerCase();
        String str = lowerStr.replaceAll(" ", "");
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
        int length = newStr.length();

        for (int i = 0; i < length; i++){
            if (newStr.charAt(i)!= newStr.charAt(length-i-1)){
                return false;
            }
        }

        return true;
    }
}

//EXAMPLE 1:
//Was it a car or a cat I saw? - ORIGINAL
//was it a car or a cat i saw - to lower all and ignore non-alphanumeric
//wasitacaroracatisaw - remove spaces?
//wasitacaroracatisaw - check if its palindrome two pointer from start and end (IT IS!)

//EXAMPLE 2:
//tab a cat - ORIGINAL
//tab a cat - to lower all and ignore non-alpha
//tabacat - remove spaces
//tacabat - check if its palindrome or not (IT IS NOT!)