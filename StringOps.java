public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String tester = "    Intro to coMPUter sCIEncE";
        System.out.println(camelCase(tester));
    }

    public static String capVowelsLowRest (String string) {
        String res = "";
        for(int i =0; i< string.length(); i++){
            char curr = string.charAt(i);
            if(curr == 32){
                res += curr;
                continue;
            }
            if("aeiouAEIOU".indexOf(curr) != -1){
                res += toUpperCase(curr);
            }
            else {
                res += toLowerCase(curr);
            }
        }
        return res;
    }

    public static String camelCase (String string) {
        String res = "";
        boolean cap = true;
        for(int i=0; i<string.length(); i++){
            char curr = string.charAt(i);   
            if(curr == 32){
                // remove spaces
                cap = true;
                continue;
            }
            if(cap){
                curr = toUpperCase(curr);
                cap = false;
            } else {
                curr = toLowerCase(curr);
            }
            res += curr;
        }
        return res;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }

    /*** help function ***/

    public static char toLowerCase(char c){
        if(c > 'Z'){
            // c is not UpperCased
            return c;
        }
        return (char)((int)c + 32);
    }
    

    public static char toUpperCase(char c){
        if(c < 'a'){
            // c is not LowerCased
            return c;
        }
        return (char)((int)c - 32);
    }
}
