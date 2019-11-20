# Chicago to Ternopil Time Converter
## A Little Background 
In June, 2019, I went to visit my family in my native land of Ukraine. I quickly realized that I was very often converting between Chicago and Ternopil time (Ternopil is 8 hours ahead of Chicago), and that I was very, very bored (mostly due to not having access to the Internet or a computer for a whole month). So, I decided to write a Java program in the notepad app on my phone that could convert from Chicago time to Ternopil time and vice versa. I wrote the program in practically one go, and I havent touched it or tested it since. Until now. This shall be my attempt at getting the program running and working properly. Admittedly this program will have a pretty niche audience, but nevertheless it'll be fun to work on. 

## Approach
The program will have two methods: 
- Chicago time to Ternopil time: takes in user inputted Chicago time and converts to Ternopil time by adding 8 hours
- Ternopil time to Chicago time: takes in user input, converts it to Chicago time by subtracting 8 hours

The main function will ask the user to input the city that they're in and the time, and will output the time in the other city. Currently, the program takes the time input in a 24 hour format, but to make the program more complex and interesting, I could have it accept the time in the 12 hour AM/PM format.
