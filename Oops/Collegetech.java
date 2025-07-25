class Participant{
    private int participantId;
    private String name ;
    private double baseRegistrationFee;
    private int numberOfEvents;
    private double eventChargePerEvent;

    //setters
    public void setparticipantId(int p)
    {
        participantId=p;
    }
     public void setName(String n)
    {
       name=n;
    }
     public void  setBaseRegistrationFee(double b)
    {
        baseRegistrationFee=b;
    }
     public void  setNumberOfEvents(int no)
    {
       numberOfEvents=no;
    }
     public void setEventChargePerEvent (int e)
    {
       eventChargePerEvent=e;
    }

    //getters
    public int getparticipantId()
    {
        return participantId;
    }
     public String getName()
    {
        return name;
    }
     public double getBaseRegistrationFee()
    {
        return  baseRegistrationFee;
    }
     public int getNumberOfEvents()
    {
        return numberOfEvents ;
    }
    public double getEventChargePerEvent()
    {
        return eventChargePerEvent ;
    }

    double calculateTotalFee()
    {
        double totalfee=baseRegistrationFee + (numberOfEvents * eventChargePerEvent);
        return totalfee;
    }
    void displaydetails()
    {
        System.out.println("Participant Record");
        System.out.println("ID:"+ getparticipantId());
        System.out.println("Name:"+getName());
        System.out.println("Base Registration Fee:"+getBaseRegistrationFee());
        System.out.println("Event Charges:" +getNumberOfEvents()+ " events @" +getEventChargePerEvent()+"/event");
        System.out.println("Total Fee:"+calculateTotalFee());
    }
}
public class Collegetech {
    public static void main(String[] args)
    {
       Participant ob=new Participant();
       ob.setparticipantId(530);
       ob.setName("charanya");
       ob.setBaseRegistrationFee(200);
       ob.setNumberOfEvents(3);
       ob.setEventChargePerEvent(100);
       ob.calculateTotalFee();
       ob.displaydetails();
    }
}
