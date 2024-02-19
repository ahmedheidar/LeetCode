class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j = ruleKey.equals("type")? 0 : ruleKey.equals("color")? 1 : 2;
        int c = 0;
                                    System.out.println(j);

        for(List<String> list: items){
                        System.out.println(list.get(j));
            if(list.get(j).equals(ruleValue))
                c++;
        }
        
        return c;
    }
}