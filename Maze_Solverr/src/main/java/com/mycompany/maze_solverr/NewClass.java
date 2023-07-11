/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solverr;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


/**
 *
 * @author Shriniwas Tak
 */
public class NewClass extends JFrame{
    
      public int [][]maze={{1,1,1,1,1,1,1,1,1,1,1,1,1},
                         {1,0,1,0,1,0,1,0,0,0,0,0,1},
                         {1,0,1,0,0,0,1,0,1,1,1,0,1},
                         {1,0,1,1,1,1,1,0,0,0,0,0,1},
                         {1,0,0,1,0,0,0,0,1,1,1,0,1},
                         {1,0,1,0,1,1,1,0,1,0,0,0,1},
                         {1,0,1,0,1,0,0,0,1,1,1,0,1},
                         {1,0,1,0,1,1,1,0,1,0,1,0,1},
                         {1,0,0,0,0,0,0,0,0,0,1,9,1},
                         {1,1,1,1,1,1,1,1,1,1,1,1,1}};
      
       public  List<Integer> path=new ArrayList<>();

    public NewClass(){
        this.setTitle("Maze solver Project");
        this.setSize(640,720);
        //this.setBackground(Color.Black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        DepthFirst.searchpath(maze, 1, 1, path);
    }
       @Override
    public void paint (Graphics g){
        g.translate(60, 60);

        for(int i=0;i<maze.length;i++){
            for(int j=0;j<maze[0].length;j++){
                Color color;
                switch(maze[i][j]){
                    case 1: color=Color.BLACK;break;
                    case 9: color=Color.RED;break;
                    default:color=Color.WHITE;break;
                }
                g.setColor(color);
                g.fillRect(40*j, 40*i, 40, 40);
                g.setColor(Color.RED);
                g.drawRect(40*j,40*i,40,40);
            }
        }
        
        for(int i=0;i<path.size();i+=2){
            int pathx=path.get(i);
            int pathy=path.get(i+1);
            
            g.setColor(Color.green);
            g.fillRect(40*pathx, 40*pathy, 30, 30);
            
            //System.out.println("X coordinates"+ pathx);
            //System.out.println("Y coordinates"+ pathy);
            
        }
    }
    public static void main(String agrs[]){
        NewClass view=new NewClass();

    }
}
