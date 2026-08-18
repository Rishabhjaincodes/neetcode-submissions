class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> h=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String f=strs[i];
            int[] a=new int[26];
            for(char c : f.toCharArray()){
              a[c-'a']++;
            }
            String key=Arrays.toString(a);
            h.putIfAbsent(key,new ArrayList<>());
            h.get(key).add(f);

        }
        return new ArrayList<>(h.values());
    }
}
