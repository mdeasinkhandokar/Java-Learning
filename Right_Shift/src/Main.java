public class Main {
    public static void main(String [] args){

        /*
        Decimal 16   = 0001 0000
16 >> 1      = 0000 1000 (8)
16 >> 2      = 0000 0100 (4)
16 >> 3      = 0000 0010 (2)

         */

/*
        int n=16;
        System.out.println("n>>2 :" + (n>>2));
*/


        int i;
        int num =0xFFFFFFE;

        for(i=0;i<4;i++){
            num=num<<1;
            System.out.println(num);
        }

/*
Iteration	Binary (Left Shifted)	Decimal Output	Note
1	0001 1111...111100	536,870,908	No overflow
2	0011 1111...111000	1,073,741,816	No overflow
3	0111 1111...110000	2,147,483,632	Max near overflow
4	1111 1111...000000	-32	Overflow occurred


 */

    }
}
