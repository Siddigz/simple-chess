package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Board extends JPanel{
    public int tileSize = 85;

    int cols = 8;
    int rows = 8;



    public Board(){
        this.setPreferredSize(new Dimension(cols * tileSize, rows*tileSize));
        this.setBackground(Color.blue);


    }



    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                g2d.setColor((c+r) %2 == 0 ? new Color(230,200,180) : new Color(160,105,50));
                g2d.fillRect(c*tileSize, r*tileSize, tileSize, tileSize);
            }

        }
    }
}
