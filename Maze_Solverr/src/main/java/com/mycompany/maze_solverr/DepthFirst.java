/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maze_solverr;

import java.util.List;




/**
 *
 * @author Shriniwas Tak
 */
public class DepthFirst {
    public static boolean searchpath(int[][] maze, int x,int y, List<Integer> path){
         if(maze[y][x]==9){
            path.add(x);
            path.add(y);
            return true;
        }

        if(maze[y][x]==0){
            maze[y][x]=2;
            //left
            if(searchpath(maze,x-1,y,path)){
                path.add(x);
                path.add(y);
                 return true;
            }
            //right
            if(searchpath(maze,x+1,y,path)){
                path.add(x);
                path.add(y);
                 return true;
            }
            //up
            if(searchpath(maze,x,y-1,path)){
                path.add(x);
                path.add(y);
                 return true;
            }
            //down
            if(searchpath(maze,x,y+1,path)){
                path.add(x);
                path.add(y);
                 return true;
            }
        }
        return false;
    }
    
}
