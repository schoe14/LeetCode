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