PImage pepperoni;
void setup() { pepperoni = loadImage("pepperoni.png");
pepperoni.resize(30,30);
  size(500,500);   
}
void draw() {

  background(200,200,200);
  noStroke();
  fill(300,200,0);
  ellipse(200, 260, 200, 200);
  fill(255,0,0);
  ellipse(200,260,180,180);
  fill(300,250,0);
  ellipse(200,260,160,160);
  image(pepperoni,200,200);
}
