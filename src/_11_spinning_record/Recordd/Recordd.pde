PImage pictureOfRecord;
import ddf.minim.*;
int i = 0;
void setup(){
size(1000,1000);
pictureOfRecord= loadImage("record.png");
pictureOfRecord.resize(1000,1000);     
image(pictureOfRecord, 0 ,0 );
minim = new Minim(this);
}
void draw(){

for(i=0; i<150; i++){
  
  rotateImage(pictureOfRecord, i );
 println(i);
}
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
