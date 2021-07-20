/*
*   Foundations of Computer Science
*   2018, Semester 01
*   Practical-Exam-04
*
*   student (id): a111111
*   student (name): John Smitth
*
*/
public class Test{
	public static void main(String [] args){
		Insertion sorting = new Insertion();
		Search searching = new BinarySearch();
		int unsorted [] = new int []{3,1,5,2,4};
        String [] uname = new String [] {"dex", "chenko","adam", "budy", "titus", "cerry"};
        String [] name = new String [] {"adam",  "budy", "cerry", "dex", "chenko", "titus"};
		int unsorted2 [] = new int []{3,1,5,2,4};
		//int [] sortedInd = sorting.sortIntByIndex(unsorted);
		int [] sortedInd = sorting.sortInt(unsorted);
		sorting.printArray(uname, "unames: ");
		String[] sortedNames = sorting.sortString(uname);
		sorting.printArray(uname, "unames: ");
		/*for(int i=0; i < sortedInd.length; i++){
			System.out.println(sortedInd[i]);
		}*/
		String space = " ";
		System.out.println("search(id): " + name[searching.search(name, "titus")]);
		System.out.println("search(id): " + sortedNames[searching.search(sortedNames, "titus")]);
		System.out.println("search(id): " + searching.search(sortedInd, 4));
		System.out.println("search(id): " + searching.search(sortedInd, 1));
		//System.out.println(searching.search(sortedInd, 1));
		//System.out.println(String.format("%1$"+10+ "s", "RAFA"));

		String a = "b";
		System.out.println(name.length);
		System.out.println(a.compareTo("b"));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo("c"));

	}
}