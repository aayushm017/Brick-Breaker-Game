package BrickBreakerGame;
import java.awt.*;

public class mapGenerator {
    public int map[][];  //will contain all the bricks
    public int brickWidth;
    public int brickHeight;

    public mapGenerator(int row, int col){
        map=new int[row][col];
        for(int i=0; i < map.length; i++){
            for(int j=0; j<map[0].length; j++){
                map[i][j] = 1;  //it will detect that this particular brick has not been intersected with the ball becoz it has to be shown inside the pane;
            }
        }

        brickWidth=540/col;
        brickHeight=150/row;
    }

    public void draw(Graphics2D g){  // when this function will be called then bricks will be drawn on the particular position when there is a value of 1
        for(int i=0; i < map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j] > 0){
                    g.setColor(Color.white);
                    g.fillRect(j * brickWidth+80, i* brickHeight+50, brickWidth, brickHeight);

                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickValue(int value, int row, int col){
        map[row][col]=value;
    }
}
