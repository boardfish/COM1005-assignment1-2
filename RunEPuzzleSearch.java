/**
 * RunEPuzzleSearch.java
 *
 *
 * March 2017 version

   run an 8-PUZZLE search

 */

import sheffield.*;
import java.util.*;

public class RunEPuzzleSearch {

public static void main(String[] arg) {

        // create an EasyWriter

        EasyWriter screen = new EasyWriter();

        //set up grids

        EpuzzGen gen = new EpuzzGen(16458);
        int[][] generatedPuzzle = gen.puzzGen(6);
        int value;
        Integer[][] puzzle = new Integer[3][3];
        for (int i = 0; i<3; i++) {
          for (int j = 0; j<3; j++) {
            value = generatedPuzzle[i][j];
            puzzle[i][j] = new Integer(value);
          }
        }
        Integer[][] targetGrid = {{1,2,3},{4,5,6},{7,8,0}};

        //run search for P1

        EPuzzleSearch searcher = new EPuzzleSearch(puzzle,targetGrid);
        SearchState p1init = (SearchState) new EPuzzleState(puzzle, 1, 1);
        String res_astar = searcher.runSearch(p1init, "AStar");
        screen.println(res_astar);

        //change from search1 - specify strategy
        //String res_df = searcher.runSearch(initState, "breadthFirst");
        //screen.println(res_df);
        //String res_bf = searcher.runSearch(initState, "depthFirst");
        //screen.println(res_bf);
        //String res_bb = searcher.runSearch(initState, "branchAndBound");

}
}
