class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map=new HashMap<>();
       for(int i=0; i<strs.length; i++){
        int []arr=new int[26];
       for(int j=0; j<strs[i].length(); j++){
        arr[strs[i].charAt(j)-'a']++;
       }
       StringBuilder sb=new StringBuilder();
       for(int j=0; j<26; j++){
        while(arr[j]>0){
            sb.append((char)(j+'a'));
            arr[j]--;
        }
       }
       String s=new String(sb);
       if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
       }
       return new ArrayList<>(map.values());
    }
}