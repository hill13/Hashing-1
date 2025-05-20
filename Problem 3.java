//We solved this by first checking if the number of words in the string matches the length of the pattern.
//Then, we used a HashMap to map each pattern character to a unique word and a HashSet to ensure no two characters map to the same word, enforcing a one-to-one relationship
// If any inconsistency is found during iteration, we return false; otherwise, true.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();


        for ( int i = 0 ; i< pattern.length(); i++){
            char c1 = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(c1)){
                if(!map.get(c1).equals(word)){
                    return false;
                }
            }
            else{
                if(set.contains(word)){
                    return false;
                }
                map.put(c1, word);
                set.add(word);
            }
        }
        return true;
        
    }
}