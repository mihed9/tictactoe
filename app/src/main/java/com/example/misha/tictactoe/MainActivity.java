package com.example.misha.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String PLAYER1 = "Player 1";
        final String PLAYER2 = "Player 2";

        final boolean[] choosePlayer = {true};
        final int[][] matrix = new int[3][3];

        for (int[] row : matrix) {
            Arrays.fill(row, 0);
        }

        changeTitle(PLAYER1);

        final Button restart = (Button) findViewById(R.id.newGame);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });

        final Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[0][0] != 1 && matrix[0][0] != 2) {

                    matrix[0][0] = 1;
                    choosePlayer[0] = false;
                    btn1.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[0][0] != 1 && matrix[0][0] != 2) {

                    matrix[0][0] = 2;
                    choosePlayer[0] = true;
                    btn1.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }
            }
        });

        final Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[0][1] != 1 && matrix[0][1] != 2) {

                    matrix[0][1] = 1;
                    choosePlayer[0] = false;
                    btn2.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[0][1] != 1 && matrix[0][1] != 2) {

                    matrix[0][1] = 2;
                    choosePlayer[0] = true;
                    btn2.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }
            }
        });

        final Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[0][2] != 1 && matrix[0][2] != 2) {

                    matrix[0][2] = 1;
                    choosePlayer[0] = false;
                    btn3.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[0][2] != 1 && matrix[0][2] != 2) {

                    matrix[0][2] = 2;
                    choosePlayer[0] = true;
                    btn3.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }
            }
        });

        final Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[1][0] != 1 && matrix[1][0] != 2) {

                    matrix[1][0] = 1;
                    choosePlayer[0] = false;
                    btn4.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[1][0] != 1 && matrix[1][0] != 2) {

                    matrix[1][0] = 2;
                    choosePlayer[0] = true;
                    btn4.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }

            }
        });

        final Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[1][1] != 1 && matrix[1][1] != 2) {

                    matrix[1][1] = 1;
                    choosePlayer[0] = false;
                    btn5.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[1][1] != 1 && matrix[1][1] != 2) {

                    matrix[1][1] = 2;
                    choosePlayer[0] = true;
                    btn5.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }

            }
        });

        final Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[1][2] != 1 && matrix[1][2] != 2) {

                    matrix[1][2] = 1;
                    choosePlayer[0] = false;
                    btn6.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[1][2] != 1 && matrix[1][2] != 2) {

                    matrix[1][2] = 2;
                    choosePlayer[0] = true;
                    btn6.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }

            }
        });

        final Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[2][0] != 1 && matrix[2][0] != 2) {

                    matrix[2][0] = 1;
                    choosePlayer[0] = false;
                    btn7.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[2][0] != 1 && matrix[2][0] != 2) {

                    matrix[2][0] = 2;
                    choosePlayer[0] = true;
                    btn7.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }

            }
        });

        final Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[2][1] != 1 && matrix[2][1] != 2) {

                    matrix[2][1] = 1;
                    choosePlayer[0] = false;
                    btn8.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[2][1] != 1 && matrix[2][1] != 2) {

                    matrix[2][1] = 2;
                    choosePlayer[0] = true;
                    btn8.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }

            }
        });

        final Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (choosePlayer[0] && matrix[2][2] != 1 && matrix[2][2] != 2) {

                    matrix[2][2] = 1;
                    choosePlayer[0] = false;
                    btn9.setBackgroundResource(R.drawable.cross);
                    changeTitle(PLAYER2);
                    choosePlayer(checkResult(matrix));

                } else if (matrix[2][2] != 1 && matrix[2][2] != 2) {

                    matrix[2][2] = 2;
                    choosePlayer[0] = true;
                    btn9.setBackgroundResource(R.drawable.circle);
                    changeTitle(PLAYER1);
                    choosePlayer(checkResult(matrix));

                }

            }
        });
    }

    private int checkResult(int[][] matrix) {

        boolean finishByDiagonal = true;
        int countStroke = 0;

        /**
         Checking the same elements by row
         **/
        for (int row = 0; row < matrix.length; row++) {

            boolean finishByRow = true;

            for (int col = 0; col < matrix[row].length; col++) {

                int value = matrix[row][col];

                if (value != 0) {
                    countStroke++;
                    if(countStroke == 9){
                        return 3;
                    }
                }

                if (value != matrix[row][0]) {
                    finishByRow = false;
                }
            }

            if (finishByRow) {
                return matrix[row][0];
            }
        }

        /**
         Checking the same elements by column
         **/
        for (int col = 0; col < matrix.length; col++) {

            boolean finishByCol = true;

            for (int row = 0; row < matrix.length; row++) {

                int value = matrix[row][col];

                if (value != matrix[0][col]) {
                    finishByCol = false;
                }
            }

            if (finishByCol) {
                return matrix[0][col];
            }
        }

        /**
         Checking the same elements by diagonal
         **/
        for (int i = 0; i < matrix.length; i++) {
            int value = matrix[0][0];

            if (value != matrix[i][i]) {
                finishByDiagonal = false;
            }
        }

        if (finishByDiagonal) {
            return matrix[0][0];
        }

        finishByDiagonal = true;
        int rowCount = 0;

        for (int col = matrix.length - 1; col >= 0; col--) {
            int value = matrix[0][matrix.length - 1];

            if (value != matrix[rowCount][col]) {
                finishByDiagonal = false;
            }
            rowCount++;
        }

        if (finishByDiagonal) {
            return matrix[0][matrix.length - 1];
        }

        return 0;
    }

    private void changeTitle(String player) {

        TextView txtPlayer1 = (TextView) this.findViewById(R.id.player1);
        TextView txtPlayer2 = (TextView) this.findViewById(R.id.player2);

        if (player.equals("Player 1")) {
            txtPlayer1.setTextColor(Color.RED);
            txtPlayer2.setTextColor(Color.BLACK);
        } else if (player.equals("Player 2")) {
            txtPlayer2.setTextColor(Color.RED);
            txtPlayer1.setTextColor(Color.BLACK);
        }
    }

    private void alertMessage(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Congratulations!!!!");
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Start new game!!!",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                });
        alertDialog.show();
    }

    private void choosePlayer(int result){

        final String PLAYER1WON = "Player 1 won!!!";
        final String PLAYER2WON = "Player 2 won!!!";
        final String DEADHEAT = "Dead heat!!!";

        if (result == 1) {
            alertMessage(PLAYER1WON);
        } else if(result == 2){
            alertMessage(PLAYER2WON);
        } else if(result == 3){
            alertMessage(DEADHEAT);
        }
    }
}