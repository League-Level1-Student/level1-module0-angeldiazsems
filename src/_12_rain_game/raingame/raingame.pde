void setup(){
  size(600,600);
}
int y = 50;
void draw(){
  y++;
  background(120,200,100);
  fill(150, 200, 75);
   stroke(20, 40, 200);
    ellipse(75, y, 70, 70);
    
 if(y == 600){
    ellipse(140, y, 70, 70);
    
}






}
