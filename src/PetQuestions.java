import java.util.Scanner;

public class PetQuestions {
    public static void main(String[] args){
        String name;
        String breed;
        int age;

        Scanner scan = new Scanner(System.in);

        System.out.print("Hello. What is your pet's name? :");
        name = scan.next();
        System.out.print("What kind of animal is "+ name+ " ? ");
        breed = scan.next();
        System.out.print("How old is "+name+" ? ");
        age = scan.nextInt();

        System.out.println(name+ " is a "+breed+" and it is "+age+" years old.");

    }
}
