public class LoopsAlphabets {

    public static void main(String[] args){

        char c='a';//97

        while(c<='z'){System.out.print(c); c++;}

        System.out.println("\n---------------------");

        c='a';
        do{System.out.print(c); c++;}while(c<='z');

        System.out.println("\n---------------------");

        for(c='a'; c<='z'; c++){System.out.print(c);}



    }


}
