public class FanRunner {
    public static void main(String[] args) {
        Fan fan=new Fan("Manufacture 1",0.983,"Green");
        fan.switchOn();
        fan.setSpeed((byte)5);
        System.out.println(fan);
        fan.switchoff();
        System.out.println(fan);

    }
}
