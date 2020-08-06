package com.cg.distinctCharcterCount;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Filter fil= new Filter();
		Mapper mp= new Mapper();
		List<String> stringList= Arrays.asList("aaryanna", "aayanna", "airianna", "alassandra","allanna", "allannah", "allessandra", "allianna", "allyanna","anastaisa", "anastashia", "anastasia", "annabella", "annabelle","annebelle");
		stringList.stream().filter(fil.nameStartingWithPrefix("aa")).
			map(mp.getDistinctCharactersCount()).
			forEach( c -> System.out.println("\""+c.getName()+"\""+" has "+c.getDistinctCharecterCount()+" distinct characters."));
		

		
		
	}

}
