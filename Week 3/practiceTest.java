import java.awt.*;

public class practiceTest {
    public static void main(String[] args) {
        int numOfSteps = 10;
        Color boobah = new Color(45,32,100);
        DrawingPanel canvas = new DrawingPanel(400,400);
        Graphics paint = canvas.getGraphics();
        int x = 175;
        int y = 175;
        for(int i=0;i<numOfSteps;i++) {

            paint.setColor(Color.CYAN);
            paint.fillRect(x,y,200,25);

            paint.setColor(Color.BLACK);
            paint.drawString("bazinga",50,50);

            paint.setColor(Color.BLACK);
            paint.drawRect(x,y,200,25);

            paint.setColor(Color.BLACK);
            paint.drawString("bazinga",50,75);
            x+=25;
            y-=25;

            canvas.sleep(300);
        }




    }
}
