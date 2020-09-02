//Given a sentence that consists of some words separated by a single space, and a searchWord.
//You have to check if searchWord is a prefix of any word in sentence.
//Return the index of the word in sentence where searchWord is a prefix of this word (1-indexed).
//If searchWord is a prefix of more than one word, return the index of the first word (minimum index).
//If there is no such word return -1.
//A prefix of a string S is any leading contiguous substring of S.

import java.util.Arrays;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strArray = sentence.split(" ");
        for(int i = 0; i < strArray.length; i++){
            if(strArray[i].startsWith(searchWord)) {
                return Arrays.asList(strArray).indexOf(strArray[i]) + 1;
            }
        }
        return -1;
    }
}