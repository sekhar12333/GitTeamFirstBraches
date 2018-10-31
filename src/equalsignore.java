public class equalsignore {
    public static void main(String [] args){
        String name="dell";
        String name1="dell";
        String name2="DELL";

        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name2.equalsIgnoreCase(name1));

    }
}
