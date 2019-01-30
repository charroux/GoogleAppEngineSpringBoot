package com.example.appengine.demos.springboot;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

@RestController
public class BackEndTask {
	
	 @PostMapping("/worker")
	  public void worker(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 
		 String name = request.getParameter("name");
		 
		 System.out.println("Back end task receives: " + name);
		 
		 DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		 
		 Filter propertyFilter = new FilterPredicate("name", FilterOperator.GREATER_THAN_OR_EQUAL, name);		  
		 Query q = new Query("Person").setFilter(propertyFilter);
		 List<Entity> results = datastore.prepare(q).asList(FetchOptions.Builder.withDefaults());

		 System.err.println("Back end task displays: ");
		 
		 System.out.println(results);
		 
	  }

}
