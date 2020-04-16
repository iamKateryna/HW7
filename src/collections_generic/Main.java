package collections_generic;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            int j = (int) Math.round((Math.random() * 122) - 100);
            myCollection.add(j);
        }
        System.out.println("myCollection");
        System.out.println(myCollection);
        ArrayList<Integer> newCollection = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) > 5){
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println("newCollection");
        System.out.println(newCollection);
        System.out.println("edited myCollection");
        Iterator<Integer> myCollectionIt = myCollection.iterator();

        while(myCollectionIt.hasNext()) {

            Integer nextInt = myCollectionIt.next();
            if (nextInt > 20) {
                myCollectionIt.remove();
            }
        }
        System.out.println(myCollection);
        System.out.println("inserting");
        myCollection.add(2, -1);
        myCollection.add(8, -3); //shifted by 1 position with the next element
        myCollection.add(5, -4);

        System.out.println(myCollection);
        for (int i = 0; i < myCollection.size();i++){
            System.out.println("pos  " + i + ":  value of element  " + myCollection.get(i));
        }

        Collections.sort(myCollection);
        System.out.println(myCollection);
        
                /*               practical task 2                    */

        HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();

        employeeMap.put(21, "Alice");
        employeeMap.put(23, "Brad");
        employeeMap.put(45, "John");
        employeeMap.put(34, "Boris");
        employeeMap.put(52, "Ien");
        employeeMap.put(27, "Mark");
        employeeMap.put(18, "Alice");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());
       /* System.out.println("Enter ID");
        int ID = scanner.nextInt();
        if (!(employeeMap.containsKey(ID))){System.out.println("no");}*/
        System.out.println("Enter name");
        String name = scanner.nextLine();
        if (!(employeeMap.containsValue(name))){System.out.println("no");}

    }
}
