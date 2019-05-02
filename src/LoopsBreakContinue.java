public class LoopsBreakContinue {

    public static void main(String[] args){

        for(int i=0;i<=10;i++){if(i==6){break;}System.out.println("i: "+i);}

        System.out.println("==================");

        for(int a=0;a<=10;a++){if(a%5==0){continue;}System.out.println("a: "+a);}

        System.out.println("==================");

        for(int t=0;t<=10;t++){if(t%3!=0){continue;}System.out.println("t: "+t);}

        //while (true){System.out.println("ssss");}


    }
}
