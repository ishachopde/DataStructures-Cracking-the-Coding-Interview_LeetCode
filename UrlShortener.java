public class Codec {
    String alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Map<String, String> map = new HashMap();
    Random r = new Random(); // to generate a random psudorandom number. Its a class
    String outputurl = getUrl();
    
    public String getUrl(){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<6;i++){
            sb.append(alphabet.charAt(r.nextInt(62))); // generates any random number using nextInt and the charAt at that number index is appended in the sb;
        }
        return sb.toString(); // returns the value of the String object
    }
    
    public String encode(String longUrl){
        while(map.containsKey(outputurl)){
            outputurl = getUrl();
        }
        
        map.put(outputurl, longUrl);
        return "http://tinghjyurl.com" + outputurl;
    }
    
    public  String decode(String shortUrl){
        return map.get(shortUrl.replace("http://tinghjyurl.com", "")); 
    } 
}
