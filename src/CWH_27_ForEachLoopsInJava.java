public class CWH_27_ForEachLoopsInJava{
        public static void main(String[] args) {

                /*
                String [] students = {"Harry", "Anurag", "Yash", "Shri"};
                System.out.println(students.length);
                System.out.println(students[2]);
                */
                int [] marks = {98, 85, 56, 96, 100};
//                System.out.println(marks[0]);
                System.out.println(marks.length);

                //Displaying the Array

                for(int  i = 0; i < marks.length;i++) {
                        System.out.println(marks[i]);
                }
                        //      Quick Quiz

                for(int  j = marks.length-1 ; j >=0 ;j--) {
                        System.out.println(marks[j]);

                }



                // for-each loop

                for (int element: marks){
                        System.out.println(element);
                }






        }


        }
