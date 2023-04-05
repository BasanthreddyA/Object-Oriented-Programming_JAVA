public class Fan {
    //State
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte Speed;//speed 0 to 5


    //creation
    public  Fan(String make,double radius,String color){
        this.make=make;
        this.radius=radius;
        this.color=color;
    }


    public void switchOn(){
        this.isOn=true;
        setSpeed((byte)5);
    }

    public  void switchoff(){
        this.isOn=false;
        setSpeed((byte)0);
    }

    public void setSpeed(byte sp){
        this.Speed = sp;
    }



    public String toString(){
        return String.format("make - %s, radius - %f ,color - %s, isOn- %b,speed - %d",make,radius,color,isOn,Speed);
    }



}
