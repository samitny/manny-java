package com.threew.manny.transformers;

import java.lang.reflect.Field;
import java.util.HashMap;

public class HashMapToEntityTransformer extends Transformer {
	@Override
	public <E, T> T convert(E source, T dest) throws Exception {
		HashMap<String, String> map = (HashMap<String, String>) source;
		
		Field[] fields = dest.getClass().getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			
			String fieldName = field.getName();
			String value = (String) map.get(fieldName);
			
			field.set(dest, value);
		}
		
		return dest;
	}
}
