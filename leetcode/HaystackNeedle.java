class HaystackNeedle {
    public int strStr(String haystack, String needle) {
       // if given input string is null or empty return 0
       if(needle == "\\N" || needle.equals(""))
        return 0;
       if(haystack.contains(needle))
           return haystack.indexOf(needle);
       else return -1;
    }
    
    public static void main(String[] args) {
        String haystack = "helloioopiopiopiopioipo";
        String needle = "pi";
        System.out.println(new HaystackNeedle().strStr(haystack,needle));
    }
}
