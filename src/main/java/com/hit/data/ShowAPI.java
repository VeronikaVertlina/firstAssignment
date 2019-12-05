package com.hit.data;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;


public class ShowAPI {

	public static void main(String[] args) throws JsonIOException, IOException, NullPointerException
	{
		Gson gson =  new Gson();
		
		
		UpcomingMatch upMatch = new UpcomingMatch();
		//Java objects to String
	
		// 1. Java object to JSON file
	
		gson.toJson(upMatch, new FileWriter("resources/db.json"));
		
		JsonParser jsonParser = new JsonParser();
		JsonObject jsonObject = (JsonObject)jsonParser.parse(new FileReader("resources/db.json"));
				
			String jsonMessage = "{\"name\"}";
			JsonObject jsonObject1= (JsonObject)jsonParser.parse(jsonMessage);
				
	}
}

				
		// 2. Java object to JSON string
//		@SuppressWarnings("unused")
//		String jsonInString = gson.toJson(upMatch);
//		
//		upMatch.firstTeam.setName("Liverpool");
//		upMatch.secondTeam.setName("Arsenal");
//		upMatch.start_date = new Date (27/12/2019); //setDate(24);
//		upMatch.kickoffTime = LocalTime.parse("10:15:30");
//		upMatch.tournament.setName("Euro");
//		
//	}
		
			//Java objects to File
//		try (FileWriter writer = new FileWriter("resources/db.json")){
//	
//			gson.toJson(upMatch, writer);
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
//	private static UpcomingMatch createUpcomingMatch() {
//		
//		UpcomingMatch upMatch = new UpcomingMatch();
//		
//		upMatch.firstTeam.setName("Liverpool");
//		upMatch.secondTeam.setName("Arsenal");
//		upMatch.start_date = new Date (24/12/2019); //setDate(24);
//		upMatch.kickoffTime = LocalTime.parse("10:15:30");
//		upMatch.tournament.setName("Euro");
//		
//		return upMatch;
		
//	}
		
//		ArrayList<UpcomingMatch> arr = new ArrayList<UpcomingMatch>(); 
//		  JsonParser jp = new JsonParser(); //from gson
//		    JsonElement root = jp.parse(new FileReader("resources/db.json")); //Convert the input stream to a json element
//		    
//		    JsonArray rootobj = root.getAsJsonArray(); //May be an array, may be an object. 
//		  
//		    for(JsonElement je : rootobj){
//			   
//		    JsonObject obj = je.getAsJsonObject(); //since you know it's a JsonObject
//		    JsonElement entryFirstTeam = obj.get("firstTeam");//will return members of your object
//	        JsonElement entrySecondTeam = obj.get("secondTeam");
//	        JsonElement entryStartDate = obj.get("startDate");
//	        JsonElement entryTournament = obj.get("tournament");
//	        JsonElement entryLocalTime = obj.get("kickoffTime");
//	        
//	       		       
//	        UpcomingMatch b = new UpcomingMatch (new Team (entryFirstTeam.toString()), new Team (entrySecondTeam.toString()), new Date (12/12/2019), new Tournament (entryTournament.toString()), LocalTime.parse("10:15:30"));    
//	        arr.add(b);
//		   }
//	        
//	}


