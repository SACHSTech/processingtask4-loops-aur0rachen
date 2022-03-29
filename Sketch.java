  /**
  * This program draws a sequences of objects using loop patterns
  * @author: Aurora Chen
  */

import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(255, 250, 253);
  }

  public void draw() {
    stroke(0);
    line(width / 2, 0, width / 2, height);
    line(0, height / 2, width, height / 2);
  
    // Quad 1
    for (int intLineX = width / 20; intLineX < width / 2; intLineX += width / 20){
      line(intLineX, 0, intLineX, height / 2);
    }
    for (int intLineY = height / 20; intLineY < height / 2; intLineY += height / 20){
      line(0, intLineY, width / 2, intLineY);
    } 
    
    // Quad 2 
    int intCircleSize = width / 20;
    fill(255, 0, 187);
    for (int intCircleX = width / 2 + width / 20; intCircleX > width / 2 && intCircleX <= width; intCircleX += width / 10){
      for (int intCircleY = height / 20; intCircleY < height / 2 && intCircleY <= height; intCircleY += height / 10){
        ellipse(intCircleX, intCircleY, intCircleSize, intCircleSize);
      }
    }

    // Quad 3
    for(int i = 0; i < width / 2 && i < width; i++){
      int intColor = i * 255 / (width/2);
      stroke(intColor);
      line(i, height / 2, i, height);
    }
    
    // Quad 4
    stroke(0);
    
    translate((float)(width * 0.75), (float)(height * 0.75));

    fill(255, 166, 0);
    for(int intPetal = 0; intPetal < 8; intPetal ++){
      rotate(PI / 4);
      ellipse(width / 16, height / 80, width / 5, height / 20);
    }

    noStroke();
    fill(118, 194, 109);
    int intFlowerCircle = width / 12;
    ellipse(0, 0, intFlowerCircle, intFlowerCircle);
  }
}