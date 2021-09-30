package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


     fun clkBu(view:View){
        val buSelected = view as Button
        var cellID =0
        var player0 = 5
        when(buSelected.id){
            R.id.a1 -> cellID=1
            R.id.a2 -> cellID=2
            R.id.a3 -> cellID=3
            R.id.b1 -> cellID=4
            R.id.b2 -> cellID=5
            R.id.b3 -> cellID=6
            R.id.c1 -> cellID=7
            R.id.c2 -> cellID=8
            R.id.c3 -> cellID=9

        }
         playGame(cellID,buSelected)
         checkWinner()
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer:Boolean=true

    fun playGame(cellID:Int,buSelected:Button){
        if(activePlayer){
            buSelected.setBackgroundColor(Color.GREEN)
            buSelected.text = "X"
            player1.add(cellID)
            activePlayer=false
            autoPlay()
        }else{
            buSelected.setBackgroundColor(Color.BLUE)
            buSelected.text = "O"
            player2.add(cellID)
            activePlayer=true
        }
        buSelected.isEnabled= false

    }
    fun checkWinner(){
        var won=-1
        //row1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3))won=1
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3))won=2
        //row2
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6))won=1
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6))won=2
        //row3
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9))won=1
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9))won=2
        //col1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7))won=1
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7))won=2
        //col2
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8))won=1
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8))won=2
        //col3
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9))won=1
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9))won=2
        //diag1
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9))won=1
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9))won=2
        //diag2
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7))won=1
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7))won=2
        if(won!=-1)Toast.makeText(this,"Player $won has won the Game!",Toast.LENGTH_LONG).show()

    }

    fun checkWinner(){
        var won=-1
        //row1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3))won=1
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3))won=2
        //row2
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6))won=1
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6))won=2
        //row3
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9))won=1
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9))won=2
        //col1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7))won=1
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7))won=2
        //col2
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8))won=1
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8))won=2
        //col3
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9))won=1
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9))won=2
        //diag1
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9))won=1
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9))won=2
        //diag2
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7))won=1
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7))won=2
        if(won!=-1)Toast.makeText(this,"Player $won has won the Game!",Toast.LENGTH_LONG).show()

    }
    fun checkWinner(){
        var won=-1
        //row1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3))won=1
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3))won=2
        //row2
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6))won=1
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6))won=2
        //row3
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9))won=1
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9))won=2
        //col1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7))won=1
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7))won=2
        //col2
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8))won=1
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8))won=2
        //col3
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9))won=1
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9))won=2
        //diag1
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9))won=1
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9))won=2
        //diag2
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7))won=1
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7))won=2
        if(won!=-1)Toast.makeText(this,"Player $won has won the Game!",Toast.LENGTH_LONG).show()

    }
    fun autoPlay(){
        var emptyCells = ArrayList<Int>()
        for(cellID in 1..9)if (!(player1.contains(cellID)||player2.contains(cellID)))emptyCells.add(cellID)
        var r= Random()
        val randIndex = r.nextInt(emptyCells.size-0)+0
        val cellID = emptyCells.get(randIndex)
        var buSelected:Button?
        when(cellID){
            1 -> buSelected=a1
            2 -> buSelected=a2
            3 -> buSelected=a3
            4 -> buSelected=b1
            5 -> buSelected=b2
            6 -> buSelected=b3
            7 -> buSelected=c1
            8 -> buSelected=c2
            9 -> buSelected=c3
            else->buSelected=c3
        }
        playGame(cellID,buSelected)

    }


    }

