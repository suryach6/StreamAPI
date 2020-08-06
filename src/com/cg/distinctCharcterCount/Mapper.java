package com.cg.distinctCharcterCount;

import java.util.function.Function;

public class Mapper {
	Function<String,CharacterCount>getDistinctCharactersCount(){
		
		return stringName->{
			
			int charecterCount= (int) stringName.chars().distinct().count();
			return new CharacterCount(stringName,charecterCount);
				
	
		
	};
	
	}
}
