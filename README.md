__first-assignment__

---

You are going to build a football game service which clients can use to get the fixtures 
(upcoming matches) and the results of football matches. 
Specifications:
 1. A team has a [unique ID](https://stackoverflow.com/questions/1389736/how-do-i-create-a-unique-id-in-java) and a name. 
 2. A tournament has a [unique ID](https://stackoverflow.com/questions/1389736/how-do-i-create-a-unique-id-in-java) and a name 
 3. A match has a status 
 4. An upcoming match has 2 teams start_date, [kickoff time](https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html) and a tournament. 
 5. A finished game has 2 teams, start_date, a tournament and a score. 
 6. The data for the matches is available from the attached text files (aka Data origin, [result_upcoming.csv](https://www.youtube.com/watch?v=3_40oiUdLG8), resultplayed.csv). 
 7. A match status can either be 'upcoming" or "played". 

Implement a [restful api service](https://www.guru99.com/restful-web-services.html), (<https://www.viralpatel.net/java-read-write-csv-file/>) with the following features: 
1. Get list of matches by team. 
2. Get list of matches by team filtered by status 
3. Get list of matches by tournament. 
4. Get list of matches by tournament filtered by status 

Assumptions 
1. The clients of this system know the teams and tournaments it supports 
2. The data in the Data origin has a known format and is valid. 
3. The matches input file path can be hard coded to the example input file path and 
4. No need to handle concurrency concerns. 
5. No Ul is required. 
6. All of the service responses will be in [json format](https://github.com/typicode/json-server).
 (<https://www.youtube.com/watch?v=x3NAo8zqdmo>,
 <https://www.mkyong.com/java/how-do-convert-java-object-to-from-json-format-gson-api/>).
7. No persistence required. 
