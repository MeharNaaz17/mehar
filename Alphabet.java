class Alphabet

{

public static void main(String args[])

{

 int alpha=65;  

 for(int i=1;i<6;i++)

 {

  for(int j=6-i; j>1; j--)  
  {
   System.out.print(" ");
   }
    for (int j=1; j<=i; j++ ) 
{
   System.out.print((char)alpha);

   alpha++;

  }

  System.out.println();

 }

}

}