public class Node {
    protected Node next;
    protected Patient patient;

    public Node(Patient patient) {
        this.patient = patient;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void printNode() {
        //TODO: Implement this method
        System.out.println("ID     Name     Triage Level");
        //% value is used to format the data in good patern
        System.out.format("%5d%8s%3d%n",patient.getId(),patient.getName(),patient.getTriageLevel());
 
    }
}
