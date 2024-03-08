class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>((a,b)->
            Double.compare(a.distance, b.distance)
        );
        for(int[] point: points){
            Point p = new Point(point[0], point[1]);
            pq.add(p);
        }
        
        int[][] res = new int[k][2];
        int i = 0;
        while(k>0){
            Point p = pq.poll();
            res[i][0] = p.x;
            res[i][1] = p.y;
            k--;
            i++;
        }
        return res;
    }
}

class Point{
    int x;
    int y;
    double distance;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
        distance = Math.sqrt(x*x+y*y);
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}