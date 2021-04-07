package lesson_3;

public class lesson_3 {
    public static void main(String[] args)
    {
        //homework 1
        //bubble sort
        int []array={5,8,6,14,5,-9,6,3,74,9,0,12,4};
        for(int i=0;i<array.length-1;i++)
            for (int j = 0; j <array.length-i-1 ; j++)
                if(array[j]>array[j+1]) {
                    array[j] ^= array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] ^= array[j + 1];
                }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();


        //homework 2

    Rectangle rect=new Rectangle();
        rect.setWidth(10);
        rect.setHeight(20);
        System.out.println("Width = "+rect.getWidth());
        System.out.println("Height = "+rect.getHeight());
        System.out.println("parameter = "+rect.parameter());
        System.out.println("surface = "+rect.surface());
    }
}
