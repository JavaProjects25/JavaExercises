import Classes.Doctor;
import Classes.Emergency;
import Classes.Nurse;
import Classes.Paramedic;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Initialize subjects/observers
        Emergency emergency = new Emergency();
        Doctor doctor = new Doctor(emergency);
        Nurse nurse = new Nurse(emergency);
        Paramedic paramedic = new Paramedic(emergency);

        //subscribing observers
        doctor.addObserver(nurse);
        doctor.addObserver(paramedic);
        nurse.addObserver(doctor);
        nurse.addObserver(paramedic);
        paramedic.addObserver(doctor);
        paramedic.addObserver(nurse);

        while(true) {

            System.out.println("Press Enter to perform CPR");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            emergency.performCPR();

        }
    }
}