public class MethodOverloading {
    public static String concatenate(String s1, String s2){
        return s1 + s2;
    }

    public static String concatenate(String s1, String s2, String separator){
        return s1 + separator + s2;
    }

    public static void main(String[] args){
        System.out.println("Concatenation without Separator: " + concatenate("JimmyTran","Company"));
        System.out.println("Concatenation without Separator: " + concatenate("JimmyTran","Company","--"));
    }
}
