class Solution {
    public boolean isValid(String s) {
        Stack<Character> k=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
                k.push(s.charAt(i));
            }
            if(s.charAt(i)=='}'){
                if(!k.isEmpty()&&k.peek()=='{'){
                    k.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i)==')'){
                if(!k.isEmpty()&&k.peek()=='('){
                    k.pop();
                }else{
                    return false;
                }
            }else if(s.charAt(i)==']'){
                if(!k.isEmpty()&&k.peek()=='['){
                    k.pop();
                }else{
                    return false;
                }
            }

        }
        if(!k.isEmpty()){
          return false;
        }
        return true;
    }
}
