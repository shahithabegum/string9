import java.util.*;
import java.lang.*;
class se9
{
  public static void main(String arg[])
   {
     try
         {
            String s="ilovemycountry";
            String s1=s.intern();
           if(s==s1){
             System.out.println(s==s1);
	}
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}