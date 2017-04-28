package Test;

import clases.Sokoban;
import clasesArboles.Node;

import javax.swing.*;

/**
 * Created by jeather on 4/24/17.
 */
public class TestSokoban {

    public static void main(String[] args) {
        String [][]game = {{"#","#","#","#","#","#","#","#"},
                           {"#"," ",".",".","#","#","#","#"},
                           {"#"," ","C"," "," "," "," ","#"},
                           {"#"," "," ","#","C","#"," ","#"},
                           {"#"," ","P"," ",".","C"," ","#"},
                           {"#","#","#","#","#","#","#","#"}
        };
        String game2 [][]={{"#","#","#","#"},
                           {"#",".",".","#"},
                           {"#","C","C","#"},
                           {"#"," "," ","#"},
                           {"#","#"," ","#"},
                           {"#","P"," ","#"},
                           {"#","#","#","#"}};
        
        String game3 [][]={
                           {"#","#","#","#","#","#"},
                           {"#","#"," "," ","#","#"},
                           {"#","P","C"," ","#","#"},
                           {"#","#","C"," ","#","#"},
                           {"#","#"," ","C"," ","#"},
                           {"#",".","C"," "," ","#"},
                           {"#",".",".","C.",".","#"},
                           {"#","#","#","#","#","#"},
                           };

        String game4 [][]={{"#","#","#","#","#","#","#","#"},
                           {"#",".","."," ","P"," "," ","#"},
                           {"#","C"," ","#"," "," "," ","#"},
                           {"#"," "," ","#","#","C"," ","#"},
                           {"#"," "," ","C"," "," ",".","#"},
                           {"#","#","#","#","#","#","#","#"}};
        //Sokoban sk = new Sokoban(7,4,game2);

        Sokoban sk = new Sokoban(6,8,game4);
    }
}
