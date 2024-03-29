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
        boolean cap = false;
        int i = 0;
        
        // remove spaces at the start of the string
        while(string.charAt(i) == 32){
            i++;
        }

        for(; i<string.length(); i++){
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
        int[] res = new int[count(string, chr)];
        int res_index = 0, search_index = 0;
        while (string.indexOf(chr, search_index) != -1) {
            res[res_index++] = string.indexOf(chr, search_index);
            search_index = string.indexOf(chr, search_index) + 1;
        }
        return res;
    }


    /*** help function ***/
     /**
      * 
      * @param c - a character
      * @return if c is upper cased - lower cased c, otherwise returns c
      */
    public static char toLowerCase(char c){
        if(c > 'Z'){
            // c is not UpperCased
            return c;
        }
        return (char)((int)c + 32);
    } 

    /**
     * 
     * @param c - a character
     * @return if c is lower cased - upper cased c, otherwise returns c
     */
    public static char toUpperCase(char c){
        if(c < 'a'){
            // c is not LowerCased
            return c;
        }
        return (char)((int)c - 32);
    }

    /***
     * 
     * @param s a string
     * @param c a character
     * @return number of occurrences oc c in s
     */
    public static int count(String s, char c){
        int count = 0;
        int search_index = 0;
        while(s.indexOf(c, search_index) != -1){
            count++;
            search_index = s.indexOf(c, search_index) + 1;
        }
        return count;
    }
}
