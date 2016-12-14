package com.example.user.rockpaperscissor;

        import java.util.ArrayList;
        import java.util.Random;

/**
 * Created by user on 14/12/2016.
 */
public class Game {
    private String playerOption;
    private String computerOption;
    private ArrayList<Integer> playerWins;


    public Game(String computerOption, String playerOption){
        this.computerOption = computerOption;
        this.playerOption = playerOption;
        playerWins = new ArrayList<Integer>();


    }

    public String getPlayerOption(){
        return this.playerOption;
    }


    public String getWinner(){
        if(this.computerOption == "Rock" && this.playerOption == "Scissors"){
            return "Computer Wins!";
        }
        else if(this.computerOption == "Rock" && this.playerOption == "Paper"){
            return "You Win!";
        }
        else if(this.computerOption == "Rock" && this.playerOption == "Rock"){
            return "It's a Draw";
        }
        else if (this.computerOption == "Paper" && this.playerOption == "Paper"){
            return "It's a Draw";
        }
        else if (this.computerOption == "Paper" && this.playerOption == "Scissors"){
            return "You Win!";
        }
        else if (this.computerOption == "Paper" && this.playerOption == "Rock"){
            return "Computer Wins!";
        }
        else if (this.computerOption == "Scissors" && this.playerOption== "Paper"){
            return "Computer Wins!";
        }
        else if (this.computerOption == "Scissors" && this.playerOption == "Rock"){
            return "You Win!";
        }
        else if (this.computerOption == "Scissors" && this.playerOption == "Scissors"){
            return "It's a Draw!";
        }

        return "enter valid option";
    }

    public void addWinToPlayer(){
        playerWins.add(1);
    }

    public int numberOfComputerWins(){
        return playerWins.size();
    }
}