//This approach groups anagrams by sorting each string to create a common key for all its anagram variations. 
// It uses a HashMap where the sorted string is the key and the list of anagrams is the value
// For each string, it adds it to the appropriate group in the map, and all grouped lists are collected in the final result.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s :strs){
            char[] strArr = s.toCharArray();
            Arrays.sort(strArr);
            String sortString = new String(strArr);

            if(map.containsKey(sortString)){
                map.get(sortString).add(s);

            }
            else{
                List<String> subResult = new ArrayList<>();
                subResult.add(s);

                map.put(sortString, subResult);

                result.add(subResult);

            }
        }
        return result;
    }
}