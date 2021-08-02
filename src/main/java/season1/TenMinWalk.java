package season1;

public class TenMinWalk {
	
	public static boolean isValid(char[] walk) {
		
	   String walkingList=new String(walk);
	   if(walkingList.length()==10 )
	   {
		   int north=(int) walkingList.chars().filter(c->c=='n').count();
		   int south=(int) walkingList.chars().filter(c->c=='s').count();
		   if(north==south)
		   {
			   int east=(int) walkingList.chars().filter(c->c=='e').count();
			   int west=(int) walkingList.chars().filter(c->c=='w').count();
			   if(east==west) 
			   {
				   return true;
			   }
		   }
		   
	   }
	    return false;
	  }
}
