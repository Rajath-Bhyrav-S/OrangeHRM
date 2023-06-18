package com.qspiders.orangeHRM.genaricutilities;

import java.time.LocalDateTime;

public class JavaUtlity
{
	public String timeStamp()
	{
		String timeStamp= LocalDateTime.now().toString().replace(':','-' );
		return timeStamp;
		
	}

}
