import java.util.Arrays;

public class lesson_2 {
   public static void main(String[] args)
   {
       //Task 1
       //Create an array and fill it with 2 number.
       int[] array_1={2,2,2,2,2};


       //Task 2
       //Create an array and fill it with numbers from 1:1000.
       int[] array_2=new int[1000];
       for (int i = 1; i <=1000 ; i++)
            array_2[i-1]=i;



       //Task 3
       //Create an array and fill it with odd numbers from -20:20
       int[] array_3=new int[20];
       int j=0;                                                // second option
       for (int i =-19 ; i <=20 ; i+=2)                        // for(int i=-19;i<0;i+=2) {
           array_3[j++]=i;                                     //     array_3[j] = i;
                                                               //     array_3[array_3.length-j-1]=Math.abs(i);
                                                               //     j++;}


       //Task 4
       //Create an array and fill it. Print all elements which can be divided by 5.
       int[] array_4={45,78,6,55,56,10,8,5,57,86,352,10};
       for (int i =0 ; i <array_4.length ; i++)
           if(array_4[i]%5==0)System.out.println(array_4[i]);



       //Task 5
       //Create an array and fill it. Print all elements which are between 24.12 and 467.23.
       double[] array_5={54.35,86.3,55,863.8,566.3,786.2,0};
       for (int i = 0; i < array_5.length; i++) {
           if(array_5[i]>24.12 && array_5[i]<467.23)
               System.out.println(array_5[i]);
       }


       //Task 6
       //Create an array and fill it. Print count of elements which can be divided by 2.
       int[] array_6={5,3,2,45,212,1,51,6,5,3,2,15,5236,87998,32};
       int counte=0;
       for (int i = 0; i < array_6.length; i++) {
           if(array_6[i]%2==0)counte++;
       }
       System.out.println("counte = " + counte);


       //Task 7
       //Given an integer, 0< N < 21 , print its first 10 multiples.
       //Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.
       int n=5;
       for (int i = 1; i < 11; i++)
           System.out.println(n + " * " + i + " = " + (n * i));




       //Search and print numbers that don't have pairs            // second option
       int[] array_8={2,5,3,1,5,5,5,4,3,1,2,5,4};                  //int xor=array_8[0];
       for (int i = 1; i < array_8.length; i++)
           array_8[0]^=array_8[i];                                 //xor^=array_8[i];
       System.out.println(array_8[0]);                             //System.out.println("xor = "+xor);


   }
}
