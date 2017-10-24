package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //global or module level variables
    private EditText editTextName, editTextAge;
    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setcontentview = show the UI
        //R = reseource class
        setContentView(R.layout.activity_main);

        //linking UI to program
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
    }
    //a button is an instance of the view class
    //method that handle view must have a view parameter
    public void displayMessage(View view){
        String name;
        int age;
        name = editTextName.getText().toString();
        age = Integer.parseInt(editTextAge.getText().toString())+1;
        textViewMessage.setText("Hi" + name +", you will be " + age +" years old in year 2018.");
    }
}
