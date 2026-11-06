class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //first lets check rows
        for(int row=0; row<9; row++){
            HashSet<Character> set =new HashSet<>();

            for(int column=0; column<9; column++){

                char current = board[row][column];

                if(current == '.')continue;

                if(!set.add(current))return false;
            }
        }

        //secondly check columns

        for(int row=0; row<9; row++){
            HashSet<Character> set =new HashSet<>();

            for(int column=0; column<9; column++){

                char current = board[column][row];

                if(current == '.')continue;

                if(!set.add(current))return false;
            }
        }

        //lastly check boxes

        for(int row=0; row<9; row+=3){
            for(int column=0; column<9; column+=3){
                HashSet<Character> set = new HashSet<>();

                for(int i=row; i<row+3;i++){
                    for(int j=column; j<column+3; j++){

                        char current = board[i][j];

                        if(current == '.')continue;

                        if(!set.add(current))return false;
                    }
                }
            }
        }

            return true;
    }
}
