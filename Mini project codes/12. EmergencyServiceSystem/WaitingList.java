public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        //TODO: Implement this method
        try{
            if(this.head == null){
            
                return null;
            }
            else{
                Node temp = this.head;
                this.head = head.getNext();
                numNodes--;
                return temp.getPatient(); 
            }   
        }catch(Exception e){
            System.out.println("Error! The waiting list is empty.");
        }
        return null;
    }//popPatient

    public Patient popPatient(int i) {
        //TODO: Implement this method
       
        try{
            if(this.head == null){
            
                return null;
            }
            else{

                Node temp = this.head;
                if(temp.getPatient().getId() == i){
                    this.head = head.getNext();
                    numNodes--;
                    return temp.getPatient(); 
                }else{
                    Node temp2 = this.head;
                    while(temp.getNext()!= null){
                        temp = temp2.getNext();
                        if(temp.getPatient().getId() == i){
                            Node returnNode = temp;
                            temp2.setNext(temp.getNext());
                            numNodes--;
                            return returnNode.getPatient();
                        }
                        temp2 = temp2.getNext();
                    }//while
                }//else
            }//try   
        }catch(Exception e){
            System.out.println("Error! There is no one in the list with that id");
        }
        return null;
    }//popPatient

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
        //TODO: Implement this method
        
        Node temp = new Node(patient);
        temp.setNext(this.head);
 
        // update top pointer
        this.head = temp;
        numNodes++;
        //sortList();
        
    }

    public void sortList()
    {
  
        // Node current will point to head
        Node current = this.head; 
        Node index = this.head;
  
        Node temp;
  
        if (this.numNodes <1) {
            return;
        }
        else {
            




            while (current != null) {
                // Node index will point to node next to
                // current
                index = current.getNext();
  
                while (index != null) {
                    
                    // If current node's data is greater
                    // than index's node data, swap the data
                    // between them

                    if (current.getPatient().getTriageLevel() > index.getPatient().getTriageLevel()) {
                        System.out.println(current.getPatient().getTriageLevel());
                        System.out.println(index.getPatient().getTriageLevel());
                        System.out.println("Inside if loop compare value");
                        temp = current;
                        current.setNext(index);
                        index.setNext(temp);
                    }
  
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }
    }



    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        //TODO: Implement this method
        // check for stack underflow
        if (this.head == null) {
            System.out.println(" Error! The waiting list is empty.");
        }
        else {
            Node temp1 = this.head;
            System.out.println("    ID   Name  Triage Level");
            while (temp1 != null) {
 
                // print node data
                
                System.out.format("%5d%8s%5d%n",temp1.getPatient().getId(),temp1.getPatient().getName(),temp1.getPatient().getTriageLevel());
 
                // assign temp link to temp
                temp1 = temp1.getNext();
            }
        }
    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int waitNumber(int i){
        int waitNumber = 0;
        Node temp = this.head;
        for(int j = 0; j<= this.numNodes; j++){
            if(temp.getPatient().getId() == i){
                waitNumber = j;
                return waitNumber;
            }else{
                temp = temp.getNext();
            }

        }
        return waitNumber;
    }
}
