import ddf.minim.*;
PImage pictureOfRecord;
void setup(){
 size(600,600);                                 
 pictureOfRecord= loadImage("record.png");      
 pictureOfRecord.resize(600,600); 
 minim = new Minim(this);
 song = minim.loadFile("186942__lemoncreme__piano-melody.wav", 512);
   }   

Minim minim;
AudioPlayer song;


int imageAngle = 0;
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }


void draw(){
  if(mousePressed){
  imageAngle+=200;
  }
  rotateImage(pictureOfRecord, imageAngle);
  image(pictureOfRecord, 0, 0);  //in draw method
  /*
  if(mousePressed){
    song.play();
  }

else{
  song.pause();
}
*/
}
