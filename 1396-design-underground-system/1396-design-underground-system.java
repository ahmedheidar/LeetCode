class UndergroundSystem {

    private HashMap<Integer, String> checkIns;
    private HashMap<String, List<Integer>> map;
    public UndergroundSystem() {
        this.checkIns = new HashMap();
        this.map = new HashMap();
    }
    
    public void checkIn(int id, String stationName, int t) {
        this.checkIns.put(id, stationName+";"+String.valueOf(t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        String start = this.checkIns.remove(id);
        String startStation = start.split(";")[0];
        int startTime = Integer.parseInt(start.split(";")[1]);
        List<Integer> values = this.map.getOrDefault(startStation+";"+stationName, new ArrayList());
        int time = t - startTime;
        values.add(time);
        this.map.put(startStation+";"+stationName, values);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        List<Integer> numbers = this.map.get(startStation+";"+endStation);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.size();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */