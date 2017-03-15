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

        Integer[][] p1 = {{1,0,3},{4,2,6},{7,5,8}};
        Integer[][] p2 = {{4,1,3},{7,2,5},{0,8,6}};
        Integer[][] p3 = {{2,3,6},{1,5,8},{4,7,0}};
        EpuzzGen gen = new EpuzzGen(12345); 
        //Integer[] genArray = ArrayUtils.toObject(gen.puzzGen(6));
        Integer[][] targetGrid = {{1,2,3},{4,5,6},{7,8,0}};

        //run search for P1

        EPuzzleSearch searcher = new EPuzzleSearch(p1,targetGrid);
        SearchState p1init = (SearchState) new EPuzzleState(p1);
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
