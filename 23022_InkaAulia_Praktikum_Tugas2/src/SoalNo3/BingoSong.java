/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalNo3;

/**
 *
 * @author 
 */
public class BingoSong {
    
    private String[] letters = {"B", "I", "N", "G", "O"};
    public BingoSong() {
        singSong();
    }
    
    public void singSong() {
        for (int i = 0; i <= letters.length; i++) {
            printVerse(i);
        }
    }
    private void printVerse(int clapCount) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        for (int j = 0; j < 3; j++) {
            printClapLine(clapCount);
        }
        System.out.println("And Bingo was his name-o.\n");
    }
   
    private void printClapLine(int clapCount) {
        StringBuilder line = new StringBuilder();
        for (int k = 0; k < clapCount; k++) {
            line.append("(clap)-");
        }
        for (int l = clapCount; l < letters.length; l++) {
            line.append(letters[l]).append("-");
        }
        line.deleteCharAt(line.length() - 1);
        
        
        System.out.println(line.toString());
    }
        public static void main(String[] args) {
        
        new BingoSong();
    }
}


