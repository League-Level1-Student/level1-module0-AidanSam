void setup(){
size(300, 300);
    background(0, 0, 0);



}
int q=0;
void draw(){
makeMagical();
for(q=0; q<300; q++){
  
  fill(255, 0, 0);
  
ellipse(getWormX(q),getWormY(q),5,5);

}
  }

float frequency = .001;
    float noiseInterval = PI;

   



 void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
