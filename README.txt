Deploy:
add war to servlet container

Work:
send data:

http://localhost:8080/resources/consuming
POST

{"user": "test",
"year": "2014",
"month": "APRIL",
"coldWater": "10.8",
"hotWater": "34334.203",
"gas": "3.131"}

"user" - more than 1 symbol, less than 10 symbols
"year" - only 4 symbols
for coldWater, hotWater, gas - limit 5 symbols before point and 2 symbols - after point
correct month's values :  JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER

get all data by User:
http://localhost:8080/resources/all
POST
{"user": "test"}

DB:
http://localhost:8080/resources/console
url: jdbc:h2:~/h2/app_db