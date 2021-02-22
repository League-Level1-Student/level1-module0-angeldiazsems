int score = 0;
void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }

void setup(){
  size(600,600);
   randomNumber = (int) random(width);
  
}
int y = 50;
int randomNumber; 
void draw(){
  y++;
  
  background(#00328C);
  fill(#256EE8);
   stroke(20, 40, 200);
    ellipse(randomNumber, y, 50, 50);
 
 if(y >= 600){
   checkCatch(randomNumber);
    y=50;
    randomNumber = (int) random(width);
     ellipse(randomNumber, y, 50, 50);
     
}

fill(#CB574C);
rect( mouseX,500, 130, 300);

 fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);



}
