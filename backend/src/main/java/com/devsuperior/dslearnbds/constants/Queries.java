package com.devsuperior.dslearnbds.constants;

public class Queries {
	
	public static final String  JPQL_NOTIFICATION =  
			"SELECT obj "
		  + "FROM Notification obj "
		  + "WHERE (obj.user = :user) "
		  + "AND (obj.read = false "
		  + "OR :unreadOnly = false) "
		  + "ORDER BY obj.moment DESC";
	
	

}
