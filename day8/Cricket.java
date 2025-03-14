class Cricket{
public static String score(String name)
{
	System.out.println("name:"+name);
	if(name.equals("jainam"))
	{
	return "Scored 20 runs";
	}
	
	else if(name.equals("purshi"))
		{
    	return "Scored 0 runs";
    	}
		
    else if(name.equals("jaii"))
     {
     return "Scored 81 runs";
      }
	  return "not in the match";
	  }
	  }