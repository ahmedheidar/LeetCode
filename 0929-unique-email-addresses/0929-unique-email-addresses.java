class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        
        for(String email: emails){
            String[] parts = email.split("@");
            String localName = parts[0];
            String name = localName.split("\\+")[0];
            String newEmail = name.replace(String.valueOf("."), "") + "@" + parts[1];
            set.add(newEmail);
        }
        // System.out.print(set.toString());
        return set.size();
    }
}