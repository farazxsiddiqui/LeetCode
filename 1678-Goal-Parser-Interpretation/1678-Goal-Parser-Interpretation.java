class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<command.length()-1;i++)
        {
            if(command.charAt(i)=='G')
            {
                sb.append('G');
            }
            else if(command.charAt(i)=='('&&command.charAt(i+1)==')')
            {
                sb.append('o');
                i=i+1;
            }
            else if(command.charAt(i)=='('&&command.charAt(i+1)=='a')
            {
                sb.append("al");
                i=i+3;
            }   
        }
        if(command.charAt(command.length()-1)=='G')
            {
               sb.append('G'); 
            }
        return sb.toString();
    }
}
