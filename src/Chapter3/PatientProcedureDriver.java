package Chapter3;

public class PatientProcedureDriver {
    public static void main(String[] args) {
        patientProcedureDemo();
    }
    public static void patientProcedureDemo() {
        Patient patient0 = new Patient(
                "David",
                "S",
                "Pumpkins",
                "12345 Goober Ln",
                "New York",
                "NY",
                10001,
                "2121231234",
                "Sabrina Pumpkins 2123211234"
        );

        Procedure procedure0 = new Procedure(
                "Physical Exam",
                "09/14/19",
                "Dr. Irvine",
                250.00
        );
        Procedure procedure1 = new Procedure(
                "X-ray",
                "09/14/19",
                "Dr. Jamison",
                500.00
        );
        Procedure procedure2 = new Procedure(
                "Blood test",
                "09/14/19",
                "Dr. Smith",
                200.00
        );
        System.out.println("Patient #1 Information: ");
        System.out.println(patient0.toString()+"\n");
        System.out.println("Procedure #1 Information: ");
        System.out.println(procedure0.toString()+"\n");
        System.out.println("Procedure #2 Information: ");
        System.out.println(procedure1.toString()+"\n");
        System.out.println("Procedure #3 Information: ");
        System.out.println(procedure2.toString());
    }
}
