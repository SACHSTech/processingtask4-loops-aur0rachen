import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 250, 253);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    //lines 
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
    int flowerCircle = width / 12;
    ellipse(300, 300, flowerCircle, flowerCircle);


  }
}