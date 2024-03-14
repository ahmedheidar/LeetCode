class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap();
        
        for(String cpdomain: cpdomains){
            String[] parts = cpdomain.split(" ");
            int n = Integer.parseInt(parts[0]);
            String[] domains = parts[1].split("\\.");
            StringBuilder domain = new StringBuilder();

            for(int i=domains.length-1; i>-1; i--){
                if(i!=domains.length-1)
                    domain.insert(0, ".");
                domain.insert(0, domains[i]);
                map.put(domain.toString(), map.getOrDefault(domain.toString(), 0) + n);
            }
        }
        
        List<String> res = new ArrayList();
        for(String domain:map.keySet()){
            StringBuilder cpd = new StringBuilder(Integer.toString(map.get(domain))).append(" ").append(domain);
            res.add(cpd.toString());
        }
        
        return res;
    }
}