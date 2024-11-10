public class Classroom {
    public static void main(String[] args) {

        Wilder wilder1 = new Wilder("Alex", true);
        Wilder wilder2 = new Wilder("Marie", false);
        Wilder wilder3 = new Wilder("Paul", false);
        Wilder wilder4 = new Wilder("Caroline", true);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
        System.out.println(wilder4.whoAmI());

    }
}
