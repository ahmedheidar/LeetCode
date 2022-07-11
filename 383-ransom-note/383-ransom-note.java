class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
                char[] letters = ransomNote.toCharArray();
        for (char letter:letters) {
            if(magazine.contains(String.valueOf(letter))){
                magazine = magazine.replaceFirst(String.valueOf(letter), String.valueOf(0));
            }else return false;
        }
        return true;


    }
}