# MTGWebsiteCodeCreator

This is a team project to help a friend develop their website.

---

*The current code is incomplete but does build properly.*

The idea behind this project was to develop a program in which a user can enter a
decklist for the strategic card game Magic: the Gathering.

The program will return the HTML code that the user can use on their website so that
it appears similar to [this](http://tcdecks.net/deck.php?id=13923&iddeck=102384).

---

Me and a friend(Danny) would split it up into parts:

* I would create the Dialog box that would ask the user for input and store it into a String.

* Danny would create the code that takes that String and forms the HTML code for the website, storing that code into a String and returning it to me.

* I would then display the HTML code to our user in a way that would allow them to copy the code and paste it into their website.

---

In order for me to accomplish my tasks, I looked into Java code and tutorials that allows me to create pop up windows and buttons.

I found that I would need to learn how to use packages like [swing](https://docs.oracle.com/javase/tutorial/uiswing/start/about.html) and [awt](https://docs.oracle.com/javase/7/docs/api/java/awt/package-summary.html).

Using websites like [this](https://www.javatpoint.com/java-jbutton#) to figure out how buttons work using ActionListener() and ActionPerformed().

I took some code I could find and started messing around with it to see what parts of the program would change as I changed certain values.

I found that making my `Intro Window` a JLabel wouldn't allow the output text(the HTML code) to be copy/pastable - so I looked into other options and found `TextArea` to be a useful alternative.

*In addition to this, JLabel would read in and implement HTML code - so in the long run, this is a lot better as I would have had to find a fix for that. TextArea doesn't read in and implement HTML code, so when we run a string with HTML code into our TextArea, the HTML code will be visible for our user to copy.*


**This is the code I have now posted:**

I am now at the point in which I have an `Intro Window` that can explain the program to the user.
There is a button that allows them to enter a new decklist. 
That button will open a `Decklist Input Window` where our user can input information.
Upon clicking Submit, the `Decklist Input Window` will close out and that **same** information will be printed out on the `Intro Window`, capable of being copied to the user's clipboard.

---

Danny has provided me his portion of the code.
His `main` function currently produces the String of HTML code we need.

**I need to:**

* seperate the code that produces that String into a new call method that takes in a string(our user's decklist), uses that string to produce the String with the HTML code and returns it.

* call that method in my code and move it into his `main` so that we have the finished product.

#### *new updates will be added soon.*

---
 ### Updates 5/3/2018
 
 Danny has completed his side of the code.
 He has already implemented Maven into his code allowing him to create an executable JAR file.
 
 I have installed Maven onto my machine and successfully built his code.
 This was probably the most difficult part as I am running a different version of JAVA on my computer.
 I had to look into editing his .pom file.
 
 I then edited his code and combined everything into our finished project which I will now be updating.
 
 There are a few things left to do.
 
 * Right now, when a person plugs in a decklist, they usually format it as such:
 
 4 First Card
 
 3 Second Card
 
 4 Third Card
 
 2 Fourth Card
 
 
  and the code just removes the first two characters in each string and links each card to their proper webpage
  
  I want to store that number and put it before the linked card so it appears as such:
  
  4 linked html code for First Card
 
  3 linked html code for Second Card
 
  .
  
  .
  
  .
  
  * I also want to wrap the entire code in a table so that it appears nice when pasted into a webpage.
  
  Small changes like this will give the project a more *finished* feel to it.
  
  Aside from that, this is pretty much completed.
  
  ---


