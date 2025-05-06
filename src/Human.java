public class Human {

   String name;
   int age;


    public Human(){
    this.name = "SUN";
    this.age = 12;
        System.out.println("From Here");
    }
    public Human(String name){
        this.name = name;
        this.age = 13;
    }

    public Human(int age){
        this.name = "S"; 
        this.age = age;
    }


    public static void main(String[] args) {


        Human obj1 = new Human("SUNNY");
                Human obj2 = new Human(12);
        System.out.printf(obj1.name + " " + obj1.age);
        System.out.println(obj2.name + " "+obj2.age);

    }


}
