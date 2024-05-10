class ThroneInheritance {

private String king;
    private Map<String, List<String>> family;
    private Map<String, Boolean> deathStatus;

    public ThroneInheritance(String kingName) {
        king = kingName;
        family = new HashMap<>();
        deathStatus = new HashMap<>();
        deathStatus.put(kingName, false);
    }

    public void birth(String parentName, String childName) {
        List<String> children = family.getOrDefault(parentName, new ArrayList<>());
        children.add(childName);
        family.put(parentName, children);
        deathStatus.put(childName, false);
    }

    public void death(String name) {
        deathStatus.put(name, true);
    }

    public List<String> getInheritanceOrder() {
        List<String> inheritanceOrder = new ArrayList<>();
        dfs(king, inheritanceOrder);
        return inheritanceOrder;
    }

    private void dfs(String person, List<String> inheritanceOrder) {
        if (!deathStatus.get(person)) {
            inheritanceOrder.add(person);
        }
        List<String> children = family.getOrDefault(person, new ArrayList<>());
        for (String child : children) {
            dfs(child, inheritanceOrder);
        }
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */