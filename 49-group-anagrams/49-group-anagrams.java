class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        for (String s1:strs) {
            boolean foundGroup=false;
            for (List<String> group:groups) {
                String s2 = group.get(0);
                if(validAnagram(s1,s2)){
                    group.add(s1);
                    foundGroup=true;
                    break;
                }
            }
            if(!foundGroup){
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s1);
                groups.add(newGroup);
            }
        }
        return groups;

    }
    
    public static boolean validAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr = new int[26];
        for (int i=0; i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for (int i=0; i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                return false;
            }
        }
        return true;

    }
}