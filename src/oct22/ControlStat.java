package oct22;

public class ControlStat {
    public static void main(String[] args) {
        System.out.println("Control Statement");
        evenorodd(55);
    }

    public static void evenorodd (int x){
        if(x%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
