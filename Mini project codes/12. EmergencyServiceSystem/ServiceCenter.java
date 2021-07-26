public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }


    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        // TODO: The tester report that the system will crash when waiting list is empty
        Patient patient = this.awl.popPatient();
        System.out.println("Assigned an ambulance for patient: " + patient.getName());
        return patient;
    }

    public Patient assignAmbulanceForPatient(int i) {
        // TODO: The tester report that the system will crash when waiting list is empty
        if(i == -1){
            Patient patient = this.awl.popPatient();
            try{
                System.out.println("Assigned an ambulance for patient: " + patient.getName());
                return patient;
            }
            catch(Exception e){
                System.out.println("Error! The waiting list is empty.");
            }
            return null;
            
        }
        else{
            Patient patient = this.awl.popPatient(i);
            try{
                System.out.println("Assigned an ambulance for patient: " + patient.getName());
                return patient;
            }
            catch(Exception e){
                System.out.println("Sorry there is no one with that id or the list is empty");
            }
            return null;
        }
        
    }

    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        this.awl.printList();
    }

    public int numberOfPatientAhead(int pID){

         return this.awl.waitNumber(pID);
    }
}
