package com.threew.manny.transformers;

import java.util.HashMap;

public class RowToHashMapTransformer extends Transformer {

	@Override
	public <E, T> T convert(E source, T dest) throws Exception {
		// TEST: We're going to ignore the SOURCE parameter since we're just using some test data.
		
//		HashMap<String, String> row = new HashMap<String, String>();
		
		HashMap<String, String> dbUser = (HashMap<String, String>) dest;
		
		// THIS IS JUST A TEST DATA.
		// For each field...
			dbUser.put("id", "uptime@gmail.com");
			dbUser.put("name", "Sam");
			dbUser.put("level", "admin");
		
		return (T) dbUser;
	}

}
