package com.example.dummiesprojects;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox pepBox,cheeseBox;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pepBox=(CheckBox)findViewById(R.id.checkBox);
        cheeseBox=(CheckBox)findViewById(R.id.checkBox2);
        textView=(TextView)findViewById(R.id.textView2);
    }
    public void onButtonClick(View view){
        StringBuilder str = new StringBuilder("");
        if(pepBox.isChecked()){
            str.append("Pepperoni ");

        }
        if(cheeseBox.isChecked()){
            str.append("Extra cheese");

        }
        if(str.length()==0){
            str.append("plain");

        }
        textView.setText(str);
    }
}
