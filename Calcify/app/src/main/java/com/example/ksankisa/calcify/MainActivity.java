package com.example.ksankisa.calcify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float One = 0;
    float Two = 0;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Result_text = (EditText)findViewById(R.id.Result_text);
        Result_text.setText("0");

        Button button_0 = (Button)findViewById(R.id.button_0);

        button_0.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("0");
                    }

                }
        );

        Button button_1 = (Button)findViewById(R.id.button_1);

        button_1.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("1");
                    }

                }
        );

        Button button_2 = (Button)findViewById(R.id.button_2);

        button_2.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("2");
                    }

                }
        );

        Button button_3 = (Button)findViewById(R.id.button_3);

        button_3.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("3");
                    }

                }
        );

        Button button_4 = (Button)findViewById(R.id.button_4);

        button_4.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("4");
                    }

                }
        );

        Button button_5 = (Button)findViewById(R.id.button_5);

        button_5.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("5");
                    }

                }
        );

        Button button_6 = (Button)findViewById(R.id.button_6);

        button_6.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("6");
                    }

                }
        );

        Button button_7 = (Button)findViewById(R.id.button_7);

        button_7.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("7");
                    }

                }
        );
        ////

        Button button_8 = (Button)findViewById(R.id.button_8);

        button_8.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("8");
                    }

                }
        );

        Button button_9 = (Button)findViewById(R.id.button_9);

        button_9.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.append("9");
                    }

                }
        );

        Button clear_button = (Button)findViewById(R.id.clear_button);

        clear_button.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.setText("0");
                    }

                }
        );



        Button plus_button = (Button)findViewById(R.id.plus_button);

        plus_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V){
                        EditText Result_text = (EditText)findViewById(R.id.Result_text);
                        if(Result_text == null){
                            Result_text.setText("");
                        }
                        else{
                            One = Float.parseFloat(Result_text.getText() + "");
                            mAddition = true;
                            Result_text.setText(null);
                        }
                    }
                }



        );

        Button minus_button = (Button)findViewById(R.id.minus_button);
        minus_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V){
                        EditText Result_text = (EditText)findViewById(R.id.Result_text);
                        if(Result_text == null){
                            Result_text.setText("");
                        }
                        else{
                            One = Float.parseFloat(Result_text.getText() + "");
                            mSubtract = true;
                            Result_text.setText(null);
                        }
                    }
                }



        );

        Button multiply_button = (Button)findViewById(R.id.multiply_button);
        multiply_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V){
                        EditText Result_text = (EditText)findViewById(R.id.Result_text);
                        if(Result_text == null){
                            Result_text.setText("");
                        }
                        else{
                            One = Float.parseFloat(Result_text.getText() + "");
                            mMultiplication = true;
                            Result_text.setText(null);
                        }
                    }
                }



        );

        Button divide_button = (Button)findViewById(R.id.divide_button);
        divide_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V){
                        EditText Result_text = (EditText)findViewById(R.id.Result_text);
                        if(Result_text.getText() == null){
                            Result_text.setText("");
                        }
                        else{
                            One = Float.parseFloat(Result_text.getText() + "");
                            mDivision = true;
                            Result_text.setText(null);
                        }
                    }
                }



        );

        Button point_button = (Button)findViewById(R.id.point_button);

        point_button.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Result_text.setText(Result_text.getText()+".");
                    }

                }
        );

        Button equal_button = (Button)findViewById(R.id.equal_button);
        equal_button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View V){
                        TextView Result_text = (EditText)findViewById(R.id.Result_text);
                        Two = Float.parseFloat(Result_text.getText() + "");
                        if (mAddition == true){

                            Result_text.setText(One + Two +"");
                            mAddition=false;
                        }


                        if (mSubtract == true){
                            Result_text.setText(One - Two+"");
                            mSubtract=false;
                        }

                        if (mMultiplication == true){
                            Result_text.setText(One * Two+"");
                            mMultiplication=false;
                        }

                        if (mDivision == true){
                            Result_text.setText(One / Two+"");
                            mDivision=false;
                        }
                    }
                }
        );





    }



}
