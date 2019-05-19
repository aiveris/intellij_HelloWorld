public class BubbleSortUDT {
    public static void main(String args[]) {

        // 1st. part - array of objects
        // Person mindaugas = new Person(10, "Mindaugas");
        // Person petras = new Person(12, "Petras");

        // Person[] people = new Person[2];
        // people[0] = mindaugas;
        // people[1] = petras;

        // people[0].name = "XXX"; // same as mindaugas.name = "XXX";

        // for(int i = 0; i < people.length; i++)
        //     System.out.print(people[i].name + " ");
        // System.out.println();

        // System.out.println(mindaugas.name);

        Person[] a = {  new Person("Jonas", "Jonaitis", 40),
                new Person("Tomas", "Tomaitis", 20),
                new Person("Maksas", "Maksaitis", 30) };

        System.out.print("Before sorting: ");
        for(int i = 0; i < a.length; i++)
            System.out.print(" {" + a[i].name + " " + a[i].age + "} " );
        System.out.println();

        bubbleSort(a);

        System.out.print("After sorting: ");
        for(int i = 0; i < a.length; i++)
            System.out.print(" {" + a[i].name + " " + a[i].age + "} " );
        System.out.println();
    }

    public static void bubbleSort(Person arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j].age > arr[j+1].age){
                    Person temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class Person {
    String name;
    String lastName;
    int age;

    Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}