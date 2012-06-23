/**
 * 
 */
package com.threew.manny;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.threew.manny.transformers.HashMapToEntityTransformer;
import com.threew.manny.transformers.RowToHashMapTransformer;
import com.threew.manny.transformers.Transformer;


/**
 * @author samit
 *
 */
public class Start {
	
	public String desc = "Mouse Story";

	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InstantiationException 
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws Exception {
		
		Transformer toHashMap = new RowToHashMapTransformer();
		Transformer toEntity = new HashMapToEntityTransformer();
		
		// Get the user from the DB;
		// Foreach user...
			HashMap<String, String> userHashMap = new HashMap<String, String>();
			
			toHashMap.convert("put the user row from the DB here", userHashMap);
			
			User u = toEntity.convert(userHashMap, new User());
			
			System.out.println(u.id);
		// end foreach
	}
}