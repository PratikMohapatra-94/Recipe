package com.crate.RecipeCrate.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtil {
	
	public String getTime() {
		
		  Calendar cal = Calendar.getInstance();
		  SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		  return sdf.format(cal.getTime());
	}

}
