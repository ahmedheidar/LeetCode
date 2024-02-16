class Solution {
    public String sortVowels(String s){
        List<Character> sortedVowels = new ArrayList<>();
        Set<Integer> idx = new HashSet<>();
        StringBuilder t = new StringBuilder(s);
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (int i=0; i<s.length();i++) {
            if(vowels.contains(s.charAt(i))){
                System.out.println(s.charAt(i)+" "+i);
                sortedVowels.add(s.charAt(i));
                idx.add(i);
            }
        }
        Collections.sort(sortedVowels);
        int j = 0;
        for (int i=0; i<s.length();i++) {
            if(vowels.contains(s.charAt(i))){
                t.setCharAt(i,sortedVowels.get(j++));
            }
        }
        return t.toString();
    }

}