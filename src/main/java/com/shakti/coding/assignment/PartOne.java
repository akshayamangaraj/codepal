/**
 *
 */
package com.shakti.coding.assignment;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PartOne {

		String id;
		String value;
	    int x, y;
	    double minDistance;


	   public boolean equals(Object o){
		   PartOne sample= (PartOne)o;
	      return this.x == sample.x && this.y == sample.y;
	   }

	   public String getId() {
	      return id;
	   }

	   public void setId(String id) {
	      this.id = id;
	   }

	   public String getValue() {
	      return value;
	   }

	   public void setValue(String value) {
	      this.value = value;
	   }

	   public static void main(String[] args) throws IOException {
	      ObjectMapper mapper = new ObjectMapper();
	      byte[] encoded = Files.readAllBytes(Paths.get("src/main/resources/sample.json"));
	      String json =  new String(encoded, "UTF-8");

	      List<PartOne> list = mapper.readValue(json, new TypeReference<List<PartOne>>(){});
	      List<PartOne> list1 = new ArrayList<PartOne>();
	      for (PartOne str : list){
	        // System.out.println(str.getValue());
	         PartOne sample = new PartOne();
	         sample.setId(str.id);
	         String[] cords = str.getValue().split(",");
	         sample.x = Integer.parseInt(cords[0]);
	         sample.y = Integer.parseInt(cords[1]);
	         list1.add(sample);
	      }

	      int sourceX = 0;
	      int sourceY = 0;


	     // int minDistance = Integer.MAX_VALUE;
	      double minValue = Double.MAX_VALUE;
	      List<PartOne> alreadyFound  = new LinkedList<PartOne>();
	      PartOne result= null;
	       {
	         for (PartOne sample : list1) {

	            // find the distance using sourceX and sourceY and store it in "distance"
	            double yd = sample.y - sourceY;
	            double xd =	sample.x - sourceX ;
	            double distance = Math.sqrt((yd*yd)+(xd*xd));

	            sample.minDistance = distance;
	         }
	         Comparator<PartOne> comparator = new Comparator<PartOne>() {

				public int compare(PartOne o1, PartOne o2) {
					return o1.minDistance < o2.minDistance ? -1 : 1;
				}
			};
             Collections.sort(list1, comparator);


	         /*

	         if (result != null) {
	            alreadyFound.add(result);

	            result.minDistance =minValue;
	            //sourceX = result.x;
	            //sourceY = result.y;
	            minValue = Double.MAX_VALUE;



	            //print the cor
	         }

	         if (alreadyFound.size() == 26){
	            break;
	         }*/
	      }

	      for (PartOne partOne : list1) {
	    	  System.out.println(partOne.x + ":" + partOne.y+":"+partOne.minDistance);

		}


	   }


}
