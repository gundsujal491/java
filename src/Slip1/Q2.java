/*Construct a linked List containing names of colours: red, blue, yellow and orange. Then
extend the program to do the following:
i. Display the contents of the List using an Iterator
ii. Display the contents of the List in reverse order using a ListIterator
iii. Create another list containing pink and green. Insert the elements of this list between
blue and yellow.*/

package Slip1;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q2 {
        public static void main(String[] args) {
            // Step 1: Create a LinkedList containing names of colours
            LinkedList<String> colourList = new LinkedList<>();
            colourList.add("Red");
            colourList.add("Blue");
            colourList.add("Yellow");
            colourList.add("Orange");

            // i. Display the contents of the list using an Iterator
            System.out.println("Colours in the list:");
            for (String s : colourList) {
                System.out.println(s);
            }

            // ii. Display the contents of the list in reverse order using a ListIterator
            System.out.println("\nColours in reverse order:");
            ListIterator<String> listIterator = colourList.listIterator(colourList.size());
            while (listIterator.hasPrevious()) {
                System.out.println(listIterator.previous());
            }

            // iii. Create another list containing pink and green, and insert between blue and yellow
            LinkedList<String> newColours = new LinkedList<>();
            newColours.add("Pink");
            newColours.add("Green");

            // Insert the new colours between Blue and Yellow
            int yellowIndex = colourList.indexOf("Yellow");  // Find the index of "Yellow"
            colourList.addAll(yellowIndex, newColours);      // Insert newColours before "Yellow"

            // Display the updated list
            System.out.println("\nUpdated list of colours:");
            for (String colour : colourList) {
                System.out.println(colour);
            }
        }
    }
