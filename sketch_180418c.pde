int x;
int xSpeed;
int y;
int ySpeed;
void setup() {
  size(400,400);
  x = 30;
  y = 30;
  ySpeed = 300;
  xSpeed = 300;
  }

void draw() {
  x += xSpeed;
  y += ySpeed;
  
  if (x >= 400) {
    xSpeed = -xSpeed;
    ySpeed = -ySpeed;
  } else if (x <= 0) {
    xSpeed = -xSpeed;
    ySpeed = -ySpeed;
  }
  background(#23395B);
  noStroke();
  fill(#FFFD98);
  ellipse(x, y, 50, 50);
}
  