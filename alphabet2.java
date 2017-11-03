/****************************************************************************
 *
 * Created on : 30 Oct. 2017
 * Created for : ICS3UR
 * daily Assignment - Unit 3-09
 * This program displays a nested loop program that prints capital letters
 *   from A - Z and lower case
 *
 ****************************************************************************/
 
public class alphabet 
{
     public static void main(String[] args)
    {
         for (int ascii = 65; ascii <= 90; ascii++)
              for (int ascii2 = 97; ascii2 <= 122; ascii2++)
        {
              {  
                   char newCapitalCharacter = (char) ascii;
                   char newLowerCharacter = (char) ascii2;
                   System.out.println(newCapitalCharacter + " => " +  newLowerCharacter);
              }   
         }
     }
}
