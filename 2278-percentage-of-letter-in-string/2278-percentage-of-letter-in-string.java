class Solution {
    public int percentageLetter(String s, char letter) {
        int total = 0;
        HashMap<Character, Integer> map = new HashMap();
        
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            total++;
        }
        int n = map.getOrDefault(letter, 0);
        double percentage = (double) n / total * 100;

        return (int) Math.floor(percentage);
    }
}