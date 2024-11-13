public class Strings {
    public static void main(String[] args){
        String name= "Sachin jangir";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(0,6));
        System.out.println(name.replace('i','u'));
        System.out.println(name.toLowerCase());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));

    }
}
