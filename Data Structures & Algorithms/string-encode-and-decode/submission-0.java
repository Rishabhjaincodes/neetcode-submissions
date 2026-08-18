class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb=new StringBuilder();
       for(String f: strs){
         sb.append(f.length());
         sb.append('#');
         sb.append(f);
       }
       String s=sb.toString();
       return s;
    }


       public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find #
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Get length
            int n = Integer.parseInt(str.substring(i, j));

            // Start of actual string
            int start = j + 1;

            // Extract string
            String s = str.substring(start, start + n);

            res.add(s);

            // Move to next encoded string
            i = start + n;
        }

        return res;
    }
}
