public class Codec {

    private HashMap<Integer, String> map = new HashMap();
    private int id = 1;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(id, longUrl);
        return "http://tinyurl.com/" + Integer.toString(id++);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.substring(shortUrl.indexOf(".com/")+5));
        return map.remove(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));