/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a111111
*   student (name): John Smitth
*
*
* Note: in order to finish your exam you are NOT required to make any changes in this class
*
*/

class BinarySearch extends Search{

    // Methods from Abstract class
    @Override
    public int search(int arr[], int query){
        int l=0;
        int r=arr.length;
        return this.binarySearch(arr, l, r - 1, query);
    }
    
    @Override
    public int search(String arr[], String query){
        int l=0;
        int r=arr.length;
        return this.binarySearch(arr, l, r - 1, query);
    }
    
    // Methods from this class
    private int binarySearch(int arr[], int l, int r, int x){
        
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
               return mid;

            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);

            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }


    private int binarySearch(String arr[], int l, int r, String x){
        
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            if (arr[mid].equals(x))
               return mid;
            if (arr[mid].compareTo(x) > 0)
               return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }
}