package Array;

import java.util.Arrays;

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
        System.out.println("myArray length = " + myArray.length); // show length of the array to the screen

        //INITIALISATION AND ACCESS
        String[] seasons = new String[4]; //initialisation
        seasons[0] = "Winter"; //write exactly some value to the cell
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";

        //INITIALISATION AND SETTING VALUES IN THE CELLS
        String[] month = new String[]{"January","February","March","April","May"};
        String[] days = {"Monday","Tuesday","Wednesday"};

        for(int i=0;i<4;i++) {
            System.out.println(month[i]);
        }

        //INITIALISATION OF TWO-DIMENSIONAL ARRAY
        int[][] twoDimensionalArray = new int [8][8]; //[1st] - row [2nd] - number of cell
        for(int m = 0; m < 7 ; m++){
            for(int n = 0; n <7; n++) {
                twoDimensionalArray[m][n] = m*n + 1;
            }
        }
        for(int m=0;m<7;m++){
            for(int n=0; n < 7; n++){
                System.out.print(twoDimensionalArray[m][n] + " ");
            }
            System.out.println();
        }
        //2nd
        int[][]anotherTwoDimensionalArray = new int[2][2];
        int[][] anotherTwoDimensionalArray1 = {
                {1,2,3},
                {4,5,6},
                {9,8,7}
        };
        for(int m=0;m<3;m++){
            for(int n=0; n < 3; n++){
                System.out.print(anotherTwoDimensionalArray1[m][n] + " ");
            }
            System.out.println();
        }
        System.out.println("anotherTwoDimensionalArray1 length rows = " + anotherTwoDimensionalArray1.length);
        System.out.println("anotherTwoDimensionalArray1 length columns = " + anotherTwoDimensionalArray1[0].length);
        // ALSO PRINT TWO-SIDED ARRAY
        System.out.println("2nd type of the printing : " + Arrays.deepToString(anotherTwoDimensionalArray1));
        //FIND SOME ELEMENT IN THE ARRAY
        int K = Arrays.binarySearch(month,1,3,"March");
        System.out.println("INDEX OF THE SOME ELEMENT IN THE ARRAY = " + K + " VALUE UNDER THIS INDEX IS = " + month[K]);

        int E = Arrays.binarySearch(anotherTwoDimensionalArray1[0],2);
        System.out.println("INDEX OF THE SOME ELEMENT IN THE ARRAY = " + E + " VALUE UNDER THIS INDEX IS = " + anotherTwoDimensionalArray1[0][E]);
        //SORT (Arrays.sort())
        Arrays.sort(anotherTwoDimensionalArray1[2],0,2);
        System.out.println("SORTED ARRAY : ");
        for(int m=0;m<3;m++){
            for(int n=0; n < 3; n++){
                System.out.print(anotherTwoDimensionalArray1[m][n] + " ");
            }
            System.out.println();
        }
        //ARRAY TO STRING
        System.out.println("ARRAY TO STRING : " + Arrays.toString(anotherTwoDimensionalArray1[1]));
        //COPY OF SOME ELEMENTS (JUST FIRST ELEMENS)
        String[] copySeasons = Arrays.copyOf(seasons,2);
        System.out.println(" COPY OF SOME ELEMENTS : " + Arrays.toString(copySeasons));
        //COPY OF SOME ELEMENTS (MIDDLE ELEMENS)
        copySeasons = Arrays.copyOfRange(seasons,0,2);
        System.out.println(" COPY OF MIDDLE ELEMENTS : " + Arrays.toString(copySeasons));
        //ARRAY1.equals(ARRAY2) - compares just links to the objects
        //Arrays.equals(ARRAY1,ARRAY2) - compares exactly data in the arrays

        //Arrays.deepEquals(ARRAY1,ARRAY2) - comparing of two-dimensional arrays

    }
}
