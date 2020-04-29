package com.example.adelekejoseph.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.apache.commons.lang3.StringUtils;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal, decimal;
    TextView etDisplay, tvClause;
    double op1, op2;
    String strClause;
    Operator operator;

    public void Clear(View view) {
        tvClause.setText( "" );
        etDisplay.setText( "" );
        operator = null;
        strClause = "";
    }

    public void Erase(View view) {
        String str = tvClause.getText().toString();
        String result = removeLastCharacter( str );
        tvClause.setText( result );
        strClause = result;
    }

    private String removeLastCharacter(String str) {
        return StringUtils.substring( str, 0, str.length() - 1 );
    }

    public void Decimal(View view) {
        String strDecimal = strClause + getViewText( view );
        tvClause.setText( strDecimal );
        strClause = strDecimal;
    }

    enum Operator {
        SUB( "-" ),
        ADD( "+" ),
        DIV( "/" ),
        MUL( "x" );

        private String operator;

        Operator(String operator) {
            this.operator = operator;
        }

        public String getOperator() {
            return this.operator;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        etDisplay = findViewById( R.id.tv_result );
        tvClause = findViewById( R.id.tv_clause );
    }

    private String setCalculationClause(String textToAdd) {
        if (strClause != null) {
            strClause = textToAdd;
        } else if (strClause != null) {
            strClause = strClause + textToAdd;
        } else {
            strClause = textToAdd;
        }
        return strClause;
    }

    private String getViewText(View view) {
        Button b = (Button) view;
        return b.getText().toString();
    }

    public double add(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public double sub(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    public double division(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }

    private double multiplication(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public void compute(View view) {
        if (!isCalculationEntryEmpty()) {
            if (operator != null) {

                int firstNumberIndexEnd = strClause.indexOf( operator.getOperator() );

                if (firstNumberIndexEnd != -1) {
                    op1 = Double.parseDouble( strClause.substring( 0, firstNumberIndexEnd ) );
                }

                String valueAfterOperator = strClause.substring( strClause.lastIndexOf( operator.getOperator() ) + 1 );

                if (!valueAfterOperator.isEmpty()) {
                    op2 = Double.parseDouble( valueAfterOperator );

                    double result = 0;

                    try {
                        switch (operator) {
                            case ADD:
                                result = add( op1, op2 );
                                break;
                            case DIV:
                                result = division( op1, op2 );
                            case MUL:
                                result = multiplication( op1, op2 );
                            case SUB:
                                result = sub( op1, op2 );
                        }
                    } catch (NumberFormatException e) {
                        Log.e( "", "NumberFormatException" );
                        tvClause.setText( R.string.error );
                        return;
                    }
                    etDisplay.setText( String.valueOf( result ) );
                    operator = null;
                }
            }
        }
    }

    private boolean isCalculationEntryEmpty() {
        if (strClause != null) {
            return true;
        } else
            return false;
    }


    public void getNumber(View view) {
        String strNumber;
        if (strClause == null) {
            strNumber = getViewText( view );
        } else {
            strNumber = strClause + getViewText( view );
        }
        tvClause.setText( strNumber );
        strClause = strNumber;
    }

    public void Add(View view) {
        operator = Operator.ADD;
        tvClause.setText( setCalculationClause( operator.getOperator() ) );
    }

    public void Sub(View view) {
        operator = Operator.SUB;
        tvClause.setText( setCalculationClause( operator.getOperator() ) );
    }

    public void Multi(View view) {
        operator = Operator.MUL;
        tvClause.setText( setCalculationClause( operator.getOperator() ) );
    }

    public void Div(View view) {
        operator = Operator.DIV;
        tvClause.setText( setCalculationClause( operator.getOperator() ) );
    }
}

