  /**
  * This program draws a sequences of objects using loop patterns
  * @author: Aurora Chen
  */

import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(200, 200);
  }

  public void setup() {
    background(255, 250, 253);
  }

  public void draw() {
    stroke(0);
    line(width / 2, 0, width / 2, height);
    line(0, height / 2, width, height / 2);
  
    // Quad 1
    for (int lineX = width / 20; lineX < width / 2; lineX += width / 20){
      line(lineX, 0, lineX, height / 2);
    }
    for (int lineY = height / 20; lineY < height / 2; lineY += height / 20){
      line(0, lineY, width / 2, lineY);
    }
    
    // Quad 2 
    int circleSize = width / 20;
    
    for (int circleX = width / 2 + width / 20; circleX > width / 2; circleX += width / 10){
      for (int circleY = height / 20; circleY < height / 2; circleY += height / 10){
        ellipse(circleX, circleY, circleSize, circleSize);
      }
    }

    // Quad 3
    for(int i = 0; i < width / 2; i++){
      int color = i * 255 / (width/2);
      stroke(color);
      line(i, height / 2, i, height);
    }
    
    // Quad 4
    stroke(0);
    translate((float)(width * 0.75), (float)(height * 0.75));
    
    for(int petal = 0; petal < 8; petal ++){
      rotate(PI / 4);
      ellipse(width / 16, height / 80, width / 5, height / 20);
    }
    
    int flowerCircle = width / 12;
    ellipse(0, 0, flowerCircle, flowerCircle); 
  }
}