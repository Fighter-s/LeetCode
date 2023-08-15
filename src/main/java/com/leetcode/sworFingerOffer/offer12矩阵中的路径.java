package com.leetcode.sworFingerOffer;

public class offer12矩阵中的路径 {
    public boolean exist(char[][] board, String word) {
        int length = board.length;
        int width = board[0].length;

        for(int i = 0; i < length;i++){
            for(int j = 0;j< width;j++){
                if(dfs(board,word,0,i,j)) return true;
            }
        }

        return false;
    }

    private boolean dfs(char[][] board,String word,int index,int x,int y){
        int length = board.length;
        int width = board[0].length;

        // 判断各种边界条件
        if(x < 0 || x >= length || y < 0 || y >= width || word.charAt(index) != board[x][y]) return false;

        // 判断如果index == word.length-1 则找到word
        if(index == word.length()-1) return true;

        // 将走过的路径进行标记
        board[x][y] = '\0';

        // 下上左右进行回溯
        boolean res = dfs(board, word, index+1, x+1, y) || dfs(board, word, index+1, x-1, y)
        || dfs(board, word, index+1, x, y+1) || dfs(board, word, index+1, x, y-1);

        board[x][y] = word.charAt(index);

        return res;
    }


}
