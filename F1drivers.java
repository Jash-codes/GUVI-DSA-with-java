public class F1drivers {

    String driver_name;
    String team_name;
    int Championship_titles;

    public void displayinfo() {
        System.out.println("Name : " + driver_name);
        System.out.println("Team name : " + team_name);
        System.out.println("Championships : " + Championship_titles);
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        // Creating objects using default constructor and manually assigning values
        F1drivers max = new F1drivers();
        max.driver_name = "Max Verstappen";
        max.team_name = "Red Bull Racing";
        max.Championship_titles = 4;

        F1drivers lewis = new F1drivers();
        lewis.driver_name = "Lewis Hamilton";
        lewis.team_name = "Scuderia Ferrari";
        lewis.Championship_titles = 8;

        max.displayinfo();
        lewis.displayinfo();
    }
}
