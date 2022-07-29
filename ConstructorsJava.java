public class ConstructorsJava {
    String studentName;
    String subject;

    public ConstructorsJava(){
        System.out.println("Default Constructor called");
    }

    public ConstructorsJava(String sName, String subject){
        studentName = sName;
        this.subject = subject;
    }

    public ConstructorsJava(ConstructorsJava variable){
        studentName = variable.studentName;
        subject = variable.subject;
    }

    public static void main(String args[]) {
        ConstructorsJava Sheral = new ConstructorsJava();
        System.out.println("Sheral "+Sheral.studentName);
        System.out.println("Sheral "+Sheral.subject);
        // Sheral.studentName = "Sheral";
        // Sheral.subject = "Java";

        ConstructorsJava Anshu = new ConstructorsJava("Anshu", "Java");
        System.out.println("anshu "+Anshu.studentName);
        System.out.println("anshu "+Anshu.subject);

        ConstructorsJava Ajay = new ConstructorsJava(Anshu);
        System.out.println("Ajay "+Ajay.studentName);
        System.out.println("Ajay "+Ajay.subject);

        
    }
    
}
