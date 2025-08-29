public class Reversestring {
    public static void main(String args[]){
        String s="hello";
        String rev="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Original string is "+s);
        System.out.println("Reversed string is "+rev);
    }
    
}
