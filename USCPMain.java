import java.util.Arrays;

public class USCPMain {
    public static void main(String[]args){
       Person1 person1 = new Person1();
       person1.setName("Asan");
       person1.setAge(25);
       Person1 person2 = new Person1();
       person2.setName("Uson");
       person2.setAge(25);
       Person1 person3 = new Person1();
       person3.setName("Aibek");
       person3.setAge(22);

       Person1 [] people = {person1,person2,person3};
        for (int i = 0; i < people.length; i++) {
            System.out.println("Name :"+people[i].getName()+", Age: "+people[i].getAge());
        }
        University university1 = new University();
        university1.setName("KSTU");
        university1.setAddress("Ch.Aitmatova 65");
        University university2 = new University();
        university2.setName("KNU");
        university2.setAddress("Chui 123");
        University university3 = new University();
        university3.setName("AUCA");
        university3.setAddress("A.Tokombaeva 7/6");

        University [] universities = {university1,university2,university3};
        for (int i = 0; i < universities.length; i++) {
            System.out.println("Name: "+universities[i].getName()+", Address: "+universities[i].getAddress());
        }

        School school1 = new School();
        school1.setName("Bilimkana");
        school1.setAddress("Manas 43");
        School school2 = new School();
        school2.setName("B.Nabiev");
        school2.setAddress("N.Ernazarov 42");
        School school3 = new School();
        school3.setName("№65 Yakir");
        school3.setAddress("Maldybaeva 23");

        School[]schools = {school1,school2,school3};
        for (int i = 0; i < schools.length; i++) {
            System.out.println("Name: "+schools[i].getName()+", Address: "+schools[i].getAddress());
        }

        Car car1 = new Car();
        car1.setName("Toyota Camry");
        car1.setColor("Black");
        Car car2 = new Car();
        car2.setName("BMW");
        car2.setColor("White");
        Car car3 = new Car();
        car3.setName("Mercedes Benz");
        car3.setColor("Grey");

        Car[]cars = {car1,car2,car3};
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Name: "+cars[i].getName()+", Color: "+cars[i].getColor());
        }
    }
}
