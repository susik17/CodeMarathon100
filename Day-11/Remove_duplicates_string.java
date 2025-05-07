class Solution {
    String removeDups(String s) {
        if(s.length()==0){return s;}
        HashSet <Character> h_set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(h_set.add(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}