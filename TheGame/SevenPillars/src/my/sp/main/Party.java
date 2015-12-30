package my.sp.main;
import java.util.LinkedList;

public class Party 
{
	int partyCapacity = 8;
	int partySize = 0;
	LinkedList<Character> party = new LinkedList<Character>();
	
	boolean recruitMember(Character newMember)
	{
		if( partySize < partyCapacity)
		{
			party.add(newMember);
			partySize++;
			return true;
		}
		return false;	
	}
	boolean removeMember()
	{
		return true;
	}
	
}
