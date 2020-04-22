package com.example.adelekejoseph.calculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
    EditText disp;
    int op1;
    int op2;
    String optr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.subtraction);
        mul = (Button) findViewById(R.id.multiplication);
        div = (Button) findViewById(R.id.divison);
        cancel = (Button) findViewById(R.id.cancel);
        equal = (Button) findViewById(R.id.equal);

        disp = (EditText) findViewById(R.id.display);

        try{
            one.setOnClickListener(this);

            two.setOnClickListener(this);

            three.setOnClickListener(this);

            four.setOnClickListener(this);

            five.setOnClickListener(this);

            six.setOnClickListener(this);

            seven.setOnClickListener(this);

            eight.setOnClickListener(this);

            nine.setOnClickListener(this);

            zero.setOnClickListener(this);

            cancel.setOnClickListener(this);

            add.setOnClickListener(this);

            sub.setOnClickListener(this);

            mul.setOnClickListener(this);

            div.setOnClickListener(this);

            equal.setOnClickListener(this);
        }
        catch(Exception e){

        }
    }
    public void operation(){
        if(optr.equals("+")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 + op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
        else if(optr.equals("-")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 - op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
        else if(optr.equals("*")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 * op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
        else if(optr.equals("/")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 / op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
    }
    @Override
    public void onClick(View arg0) {
        Editable str =  disp.getText();
        switch(arg0.getId()){
            case R.id.one:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.two:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.three:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.four:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.five:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.six:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.seven:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.eight:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(nine.getText());
                disp.setText(str);

                break;
            case R.id.nine:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(zero.getText());
                disp.setText(str);

                break;
            case R.id.cancel:
                op1 = 0;
                op2 = 0;
                disp.setText("");
                break;
            case R.id.add:
                optr = "+";
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 + op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.subtraction:
                optr = "-";
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 - op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.multiplication:
                optr = "*";
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 * op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.divison:
                optr = "/";
                if(op1 == 0){
                    op1 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                }
                else if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                else{
                    op2 = Integer.parseInt(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 / op2;
                    disp.setText("Result : " + Integer.toString(op1));
                }
                break;
            case R.id.equal:
                if(!optr.equals(null)){
                    if(op2 != 0){
                        if(optr.equals("+")){
                            disp.setText("");
                            /*op1 = op1 + op2;*/
                            disp.setText("Result : " + Integer.toString(op1));
                        }
                        else if(optr.equals("-")){
                            disp.setText("");/*
							op1 = op1 - op2;*/
                            disp.setText("Result : " + Integer.toString(op1));
                        }
                        else if(optr.equals("*")){
                            disp.setText("");/*
							op1 = op1 * op2;*/
                            disp.setText("Result : " + Integer.toString(op1));
                        }
                        else if(optr.equals("/")){
                            disp.setText("");/*
							op1 = op1 / op2;*/
                            disp.setText("Result : " + Integer.toString(op1));
                        }
                    }
                    else{
                        operation();
                    }
                }
                break;
        }
    }
}

