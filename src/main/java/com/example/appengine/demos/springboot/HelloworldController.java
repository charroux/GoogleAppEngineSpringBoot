/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.appengine.demos.springboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;
import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions; 
import com.google.appengine.api.taskqueue.TaskOptions.Method;

@RestController
public class HelloworldController {
	
  @GetMapping("/person")
  public String hello() {
	
	  System.out.println("GET on /person");
	  
	  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	  
	  Query q = new Query("Person");
	  List<Entity> results = datastore.prepare(q).asList(FetchOptions.Builder.withDefaults());

	  System.out.println(results);
	  
	  return "Hello world - springboot-appengine-standard - data store!";
  }

  @PostMapping("/person")
  public void addPerson(@RequestBody Person person) {
	  
	  System.out.println(person);

	  DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
	  
	  Entity tintin = new Entity("Person");
	  tintin.setProperty("age", person.getAge());
	  tintin.setProperty("name", person.getName());
	  
	  datastore.put(tintin);

  }

 

}
