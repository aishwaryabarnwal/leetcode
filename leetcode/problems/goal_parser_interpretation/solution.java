class Solution {
    public String interpret(String command) {
        // String res = "";
        // for(int i=0;i<command.length();i++)
        // {
        //     if(command.charAt(i) == 'G')
        //         res += "G";
        //     else if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
        //     {
        //         res += "o";
        //         i++;
        //     }
        //     else
        //     {
        //         res += "al";
        //         i = i+3;
        //     }
        // }
        //return res;
        //return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
        StringBuilder S = new StringBuilder(command.length());
        //Note: using StringBuilder reduce time from 1ms to 0ms.
	for(int i = 0 ; i < command.length() ; i++){
		if(command.charAt(i)=='G') S.append('G');
		if(command.charAt(i)=='('){
			if(command.charAt(i+1)==')') {S.append('o'); i++;}
			else{S.append("al"); i = i + 3;}
		}
	}
	return S.toString();
    }
}