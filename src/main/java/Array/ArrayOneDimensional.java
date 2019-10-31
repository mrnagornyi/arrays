package Array;


public class ArrayOneDimensional {
    public static void main (String[] args)

    {
        //DECLARATION
        //dataType[] arrayName; - in such way should be declared array
        //int[] myArray; - example for any type
        //Object[] arrayOfObjects; - example for Objects

        //DECLARATION C++
        //dataType arrayName[]; - this declaration is coming from C++. Also works
        //int myArray[]; - C++ example for any type
        //Object arrayOfObjects[]; - C++ example for Objects

        //CREATE ARRAY IN THE MEMORY
        //new typeOfArray[length]; - reservation of the place in the memory for array
        //int[] myArray; // example of declaring of the array
        //myArray = new int[10]; // creation and reservation of the memory for 10 elements

        //DECLARE AND CREATE ARRAY IN ONE TIME
        //int[]myArray = new int[10];

        //INDEXING
        //10 elements coming from 0,1,2,3,4...8 till 9

        //LENGTH
        int[] myArray = new int[10]; // - create array of the ints for 10 elements and assigned name for it myArray
        System.out.println(myArray.length); // show length of the array to the screen

        //INITIALISATION AND ACCESS
        String[] seasons = new String[4]; //initialisation
        seasons[0] = "Winter"; //write exactly some value to the cell
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";

        //INITIALISATION AND SETTING VALUES IN THE CELLS
        String[] month = new String[]{"January","February","March"};
        String[] days = {"Monday","Tuesday","Wednesday"};



    }
}
