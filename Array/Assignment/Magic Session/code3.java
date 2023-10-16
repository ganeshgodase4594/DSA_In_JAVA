
/*

Problem 3:
Given a string s and an array of string words, determine whether s is a prefix string of words.
A string s is a prefix string of words if s can be made by concatenating the first k strings in words
for some positive k no larger than words.length.
Return true if s is a prefix string of words, or false otherwise.
Example 1:
Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.
Example 2:
Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr.

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 20
1 <= s.length <= 1000
words[i] and s consist of only lowercase English letters.

 */

 class solution{

    static boolean conacat(String word[],String s){

        String str="";

        for(int i=0;i<word.length;i++){

            str=str+word[i];

            if(s.equals(str)){

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        String arr[]={"i","love","leetcode","apple"};

        String s="iloveleetcode";

        boolean result=conacat(arr, s);

        System.out.println(result);
    }
 }