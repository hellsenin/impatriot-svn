package egovframework.com.dev.util;

import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import oracle.sql.CLOB;

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
	
	@SuppressWarnings("deprecation")
	public static CLOB strToClob(String regContent) throws Exception {

		CLOB clob =  CLOB.empty_lob();
		
		return clob;
	}
	
	public static String readClobData(Reader reader) throws IOException {
		
		StringBuffer data = new StringBuffer();
		char[] buf = new char[1024];
		int cnt = 0;
		
		if (null != reader) {
			while ( (cnt = reader.read(buf)) != -1) {
				data.append(buf, 0, cnt);
			}
		}
		
		return data.toString();
    }
}