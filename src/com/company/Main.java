package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "deebd";
        System.out.println(makePalindrome(s));
    }
    public static String makePalindrome(String s) {
        String callback = "no way";
        if(evenNumOfChar(s)){
            if(isPalindrome(s)) {
                callback = "done";
                return callback;
            }
        }else{
            String rez =  remOneChar(s);
            return rez;
        }
        return callback;
    }

    public static boolean evenNumOfChar(String str){
        if((str.length()%2) == 0){
            return true;
        }

        return false;
    }

    public static boolean isPalindrome(String str){
        StringBuffer buffer = new StringBuffer(str);
        if(str.contentEquals(buffer.reverse())){
            return true;
        }
        return false;
    }

    public static String remOneChar(String str){
        StringBuffer s = new StringBuffer(str);
        StringBuffer s1 = new StringBuffer(str);
        for(int i = 0; i < (str.length())/2; ++i){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                if(del(str, i, i + 1)){
                    return s.delete(i, i + 1).toString();
                }else if( del(str,str.length() - i - 1,str.length() - i)){
                    String ca = s.delete(str.length() - i - 1, str.length() - i).toString();
                    return ca;
                }
            }
        }
        return "no way";
    }

    public static boolean del(String str, int start, int end){
        StringBuffer s = new StringBuffer(str);
        if(isPalindrome(s.delete(start, end).toString())) return true;
        return false;
    }

}