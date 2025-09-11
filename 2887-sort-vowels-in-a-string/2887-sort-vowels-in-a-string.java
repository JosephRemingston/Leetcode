import java.util.*;
class Solution {
    public String sortVowels(String s) {
        List<Character> vowelsArray = new ArrayList<>();
        StringBuilder string = new StringBuilder("");
        for(int i = 0 ; i < s.length() ; i++){
            if(isVowel(s.charAt(i))){
                vowelsArray.add(s.charAt(i));
            }
        }
        Collections.sort(vowelsArray);
        int x = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(isVowel(s.charAt(i))){
                string.append(vowelsArray.get(x));
                x++;
            }
            if(!isVowel(s.charAt(i))){
                string.append(s.charAt(i));
            }
        }
        return string.toString();
    
    }
    boolean isVowel(Character c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        else{
            return false;
        }
    }
}