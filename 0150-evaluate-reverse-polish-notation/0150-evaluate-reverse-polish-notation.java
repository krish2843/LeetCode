class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st= new Stack<>();
        for(int i =0;i<tokens.length;i++){
           String token=tokens[i];
              if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                int A=st.pop();
                int B = st.pop();
                int result=0;
                switch(token){
                    case ("+"):
                            result = B+A;
                            break;
                    case("-"):
                           result =B-A;
                           break;
                    case("*"):
                            result = B*A;
                            break;
                    case("/"):
                            result =B/A;
                            break;
                }
                st.push(result);
              }
                else{
                 st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}