package com.example.user.rockpaperscissor;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 14/12/2016.
 */

public class ComputerTest {

   Computer computer;

    @Before
    public void before() {
        computer = new Computer();

    }
    @Test
    public void choiceSizeTest(){
        assertEquals(3,computer.choiceSize());
    }


    @Test
    public void addInWinToComputerTest(){
        computer.addWinToComputer();
        computer.addWinToComputer();
        assertEquals(2,computer.numberOfComputerWins());
    }

}


