int y;
int ySpeed;
void setup() {
  size(700,400);
  y = 200;
  ySpeed = 1;
}

void draw() {
  // sun loop
  if (y > 70) {
    y -= ySpeed;
  }
  // sky
  background(#ff7373);
  // sun
  fill(#ffd700);
  ellipse(280, y, 90, 90);
  // water
  fill(#1b9194);
  rect(0, 160, 700, 400);
  // turtle
  fill(#a0db8e);
  ellipse(230, 260, 130, 90);
  rect(140, 280, 30, 90);
  // set x to a variable for the turtle
  // rotate rects
  // add clouds
  }
 