public class drivers {  //CLASS NAME

    String name;    //ATTRIBUTES
    String Teamname;
    int Championships;
    
    public drivers(){   //DEFAULT CONSTRUCTOR WITH SAME NAME AS CLASS
        name = "max";                          // ASSIGNING VALUES TO ATTRIBUTES IN THE PUBLIC CLASS
        Teamname = "redbull racing";
        Championships = 4;
    }

    public void records(){    //FUNCTION
        System.out.println("name : " + name);   
        System.out.println("teamname : " + Teamname);
        System.out.println("Championships : " + Championships);
    }

    public static void main(String[] args) {     // MAIN METHOD
       
        drivers drivername = new drivers();  // ASSIGNING OBJECT TO CLASS NAME

        drivername.records(); // CALLING OBJECT WITH FUNCTION
    }




}