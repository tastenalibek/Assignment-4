public class DeveloperRunner {
    public static void main(String[] args) {

        Developer developer = new Developer();


        developer.setActivity(new Working());
        developer.executeActivity();
        developer.setActivity(new Training());
        developer.executeActivity();
        developer.setActivity(new Eating());
        developer.executeActivity();
        developer.setActivity(new Reading());
        developer.executeActivity();




    }
}
