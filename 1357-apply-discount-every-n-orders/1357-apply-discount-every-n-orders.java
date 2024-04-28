class Cashier {
    private int[] prices;
    private int[] products;
    private int discount;
    private int n;
    private int c;
    private Map<Integer, Integer> map;
    
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        this.discount = discount;
        this.products = products;
        this.prices = prices;
        map = new HashMap<Integer, Integer>();
        c = 0;
        
        for(int i=0; i<prices.length; i++){
            map.put(products[i], prices[i]);
        }
    }
    
    public double getBill(int[] product, int[] amount) {
        c++;
        int subTotal = 0;
        double total = 0.0;
        for(int i=0; i<amount.length; i++){
            subTotal += amount[i]*map.get(product[i]);
        }
        
        if(c%n==0){
            total = subTotal * ((100 - (double)discount) / 100);
        }else{
            total = (double) subTotal;
        }
        
        return total;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */