package ccim.iar.ui.screen;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ccim.iar.ui.main.run;

public class SearchCriteria {
	
	private static final Logger log = LogManager.getLogger(SearchCriteria.class);

	public static String USE_HCN = "USE_HCN"; // 0/1, no/yes, default no
	public static String HCN = "HCN";
	public static String LAST_NAME = "LAST_NAME";
	public static String FIRST_NAME = "FIRST_NAME";
	public static String DOB = "DOB"; // i.e.06-Oct-2016
	public static String SEX = "SEX"; //M,F,UNK
	public static String STREET = "STREET";
	public static String UNIT = "UNIT";
	public static String POSTAL_CODE = "POSTAL_CODE";
	public static String PHONE = "PHONE";
	
	
	private Map<String, String> map = new HashMap<String, String>();
	
	public void addField(String name, String value) {
		map.put(name, value);		
	}

	public String getField(String name) {
		return map.get(name);		
	}

}
