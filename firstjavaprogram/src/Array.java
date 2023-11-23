public class Array {
        public static void main(String[] args) {
            System.out.println("Hello, World!\n");
            //declaring an array
            String[] arr;
            int i;
            //allocating memory to array
            arr = new String[10];
            //String[] arr = new String[10];

            // for(i=0; i<10; i++)
            // {
            //     int a=100;
            //     arr[i]=a;
            // }
            arr[0]="apple";
            arr[1]="orange";
            arr[2]="apple3";
            arr[3]="apple4";
            arr[4]="apple5";
            arr[5]="apple6";
            arr[6]="apple7";
            arr[7]="apple8";
            arr[8]="apple9";
            arr[9]="apple10";

            /*
            String[] arr = new String("apple", "orange", "mango", "so on");


            */
            //displaying the elements of an array
            System.out.println("the elements in the array are:\n");
            for(i=0; i<10; i++)
            {
                System.out.println("array: " + arr[i] +"\n");

            }

            System.out.println("another shortcut way of declaring an array is:\n");
            //declaring with initializing the size.
            String[] arr1 = { "apple", "orange", "mango", "so on" };
            for(int j=0;j<4;j++)
            {
                System.out.println(arr1[j]+"\n");
            }

        }
}

