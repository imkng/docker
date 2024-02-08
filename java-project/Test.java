import java.util.Properties;

class Test{

    public static void systemProperty(){
        System.out.println("priniting system property using java program");
        Properties prop = System.getProperties();
        System.out.println(prop);
    }
    public static void main(String[] args) {
        System.out.println("Java program started!!");
        systemProperty();
    }
}