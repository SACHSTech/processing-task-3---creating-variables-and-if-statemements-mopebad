import processing.core.PApplet;

public class Sketch extends PApplet {
  int houseX, houseY; // Variables to store the house's position
  int houseColor; // Variable to store the house's color as an integer
  boolean houseDrawn = false; //check if house is drawn

  /**
   * Called once at the beginning of execution, put your size call in this method
   */
  public void settings() {
    size(400, 400);
  }

  /**
   * Called once at the beginning of execution. 
   */
  public void setup() {
    // Set the background color
    background(220);

    // Initialize the house position and color
    houseX = (int)(random(width));
    houseY = (int)(random(height));
    houseColor = color(random(255), random(255), random(255));

    // Display the current time in the setup
    String currentTime = nf(hour(), 2) + ":" + nf(minute(), 2) + ":" + nf(second(), 2);
    textSize(16);
    fill(0);
    text("Current Time: " + currentTime, 20, 20);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Check if the house is already drawn
    if (!houseDrawn) {
      // Draw the house at the randomly generated position
      drawHouse(houseX, houseY, houseColor);

      // House drawn
      houseDrawn = true;
    }
  }

  // Draw the house
  void drawHouse(int x, int y, int houseColor) {
    // Draw the house body
    fill(houseColor);
    rect(x, y, 100, 100);

    // Draw the roof
    fill(150, 50, 0); // Brown color for the roof
    triangle(x, y, x + 50, y - 50, x + 100, y);
  }
}
