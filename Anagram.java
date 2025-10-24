import java.util.Arrays;

public class Anagram {
    static boolean anagram(char str1[],char str2[]){
        int n1=str1.length;
        int n2=str2.length;
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(n1!=n2){
            return false;
        }
        else{
            for(int i=0;i<n1;i++){
                if(str1[i]!=str2[i]){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String args[]){
        char str1[]={'l','i','s','t','e','n'};
        char str2[]={'s','i','l','e','n','t'};

        if(anagram(str1,str2)){
            System.out.println("The given two tsrings are anagrams");
        }
        else{
            System.out.println("The given two strings are not anagrams");
        }

    }
}
