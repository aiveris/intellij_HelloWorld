public class Castz {
    // Double <<  Float << Long <<Int <<Short <<Byte

    public static void main(String[] args) {
       int x=10; int y=20; int z=x+y;
       System.out.println("Value of z: " + z);
       System.out.println("=====================");

       byte b1 = 1;
       byte b2 = 2; // try 127
       //byte b_ans = b1 + b2;//error
       byte b_ans = (byte)(b1 + b2);//... not recommended
       int b3 =  (int)(b1 + b2);
       System.out.println("with byte: " + b_ans);
       System.out.println("with int: " + b3);
       System.out.println("=====================");

       int i = 35;
       long l = i;//..........implicit
       float f = i;//.........implicit
       System.out.println("Long val of l: " + l);
       System.out.println("Float val of f: " + f);
       f = 35.35f;     //reassigning new value to f
       l = 35;         //reassigning new value to l
       //int aa = (int) f;//error
       //int bb = l;//error

      /* long l3 = 999888777666L;//... put l or L
       float f = 12345.5555f;//..... put f
       double d = 999888777666.5555;
       int i_long3 = (int)l3;//...........explicit
       int i_double = (int)d;//...........explicit
       int i_float = (int)f;//...........explicit
       System.out.println("from Long: " + i_long3);
       System.out.println("from Float: " + i_float);
       System.out.println("from Double: " + i_double);*/

       /*int x = 22; int y = 7;
       float abc=(float)x/y;
       int answer_i = x/y;
       float answer_f = x/y;
       double answer_d = x/y;
       System.out.println("Answer in int: " + answer_i);
       System.out.println("Answer in float: " + answer_f);
       System.out.println("Answer in double: " + answer_d);
       System.out.println(abc);*/

       /*float x = 22; float y = 7;
       float answer_float = x/y;
       int answer_int = (int)(x/y);
       System.out.println("Answer in float: " + answer_float);
       System.out.println("Answer in int: " + answer_int);*/
    }//psvm
}//Class
