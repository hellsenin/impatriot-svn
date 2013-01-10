package egovframework.com.dev.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class EDevBBSManageUtil {
	
	Logger log = Logger.getLogger(this.getClass());

	public static String getBullId(String regBoardId) throws Exception {

		Calendar cal = Calendar.getInstance();
		String strBullId = "BB";
		
		cal.setTime(new Date(System.currentTimeMillis()));
		strBullId += new SimpleDateFormat("yyyymmddhhmmss").format(cal.getTime());
		
		return strBullId;
	}

}
