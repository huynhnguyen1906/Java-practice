package lab02;

public class Ex3 {
    public static void main(String[] args) {
        // enter used electricity
        System.out.println("enter used electricity:");
        int usedElectricity = Integer.parseInt(System.console().readLine());
        // calculate electricity bill
        if (usedElectricity <= 100) {
            System.out.println("electricity bill: " + usedElectricity * 1000);
        } else {
            System.out.println("electricity bill: " + usedElectricity * 1500);
        }
    }
}
