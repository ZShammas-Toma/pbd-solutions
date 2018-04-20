
void setup() {
  size(700,400);
}

void draw() {
  ellipse(90,90);
  
// 3 way gradient: yellow/blue, orange, yellow
for (float y = 0; y < height; y++) {
  stroke(lerpColor(0, 0, 0));
  strokeWeight(1);
  line(0, y, width, y);
  }
}