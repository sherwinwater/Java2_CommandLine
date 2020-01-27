package CommandLine;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("h");

        System.out.println("args[0] is " + args[0]);

        for (String i : args) {
            System.out.println(i);
        }

        for (int sub = 0; sub < args.length; ++sub) {
            System.out.println("args[" + sub + "] " + args[sub]);
        }
        
        double d = Integer.parseInt("12");
        System.out.println(d);
     
        String dog = "dog";
        System.out.println(dog.indexOf('z'));
    }

}
