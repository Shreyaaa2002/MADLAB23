/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
              for(int j=4-(i+1);j>0;j--)
        {
              System.out.print(" ");
        }
           for(int k=0;k<=i;k++)
           {
                  System.out.print("* ");
           }
        System.out.print("\n");
        
        }
    }
}