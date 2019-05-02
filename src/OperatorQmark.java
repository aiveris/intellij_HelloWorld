public class OperatorQmark {
    public static void main(String[] args) {
        int car1speed = 140;
        int car2speed = 150;
        String text=null;

        if (car1speed>car2speed){text="Congratulations CAR-1... you won!";}
        else if (car2speed>car1speed) {text = "Congratulations CAR-2... you won!";}
        System.out.println("Message: " + text);

        System.out.println("====1====");

        text = (car1speed>car2speed)? "Congratulations CAR-1... you won!" : "Congratulations CAR-2... you won!" ;
        System.out.println("Message: " + text);

        System.out.println("====2====");

        int a, b;
        a=5;
        b=10;

        int ans=(a>b)? a : b;
        char c = (a>b)? 'a' : 'b';
        String s = (a>b)? "a is greater" : "b is greater";
        System.out.println("Message: " +ans);
        System.out.println("Message: " +c);
        System.out.println("Message: " +s);

    }
}
