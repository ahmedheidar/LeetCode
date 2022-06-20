class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                     List<List<String>> groups = new ArrayList<>();
        HashMap<String,List<String>> strings = new HashMap<>();
        for (String s:strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String wordSorted = String.valueOf(c);
            if(strings.containsKey(wordSorted)){
                strings.get(wordSorted).add(s);
            }else{
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                strings.put(wordSorted,newGroup);
            }
        }
        for (String key:strings.keySet()) {
            groups.add(strings.get(key));
        }
        return groups;

    }
}