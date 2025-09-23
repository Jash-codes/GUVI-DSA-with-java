public class F1teamrecord { // CLASS NAME

    String driver_name; //ATTRIBUTES
    String team_name;
    int Championship_titles;
    

    public F1teamrecord(String driver_name, String team_name, int Championship_titles){ //CONSTRUCTOR

        this.driver_name = driver_name;
        this.team_name = team_name;
        this.Championship_titles = Championship_titles;

}

    public void displayinfo(){  //FUNCTION
        System.out.println("Name : " + driver_name);
        System.out.println("Team name : " + team_name);
        System.out.println("Championships : " + Championship_titles);
        System.out.println("------------------");

}

public static void main(String[] args) {
    //PASSING INPUTS IN MAIN METHOD

    F1teamrecord max = new F1teamrecord("Max verstappen","red bull racing", 4);
    F1teamrecord lewis = new F1teamrecord("lewis Hamilton", "Scuderia Ferrarri", 8);
    F1teamrecord carlos = new F1teamrecord("Carlos", "williams", 0);

    max.displayinfo();
    lewis.displayinfo();
    carlos.displayinfo();
}
}





