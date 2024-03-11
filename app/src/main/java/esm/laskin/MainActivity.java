package esm.laskin;

import static esm.laskin.R.id.editFirstNumber;

import android.os.Bundle;
import android.view.View;

import android.view.ViewDebug;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editFirstNumberIn;
    private EditText editSecondNumberIn;

    private TextView textSeeResultOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        editFirstNumberIn = findViewById(R.id.editFirstNumber);
        editSecondNumberIn = findViewById(R.id.editSecondNumber);
        textSeeResultOut = findViewById(R.id.textSeeResult);

    }


    public void plus(View view){
        int editFirstNumberInInt =  Integer.parseInt(editFirstNumberIn.getText().toString());
        int ediySecondNumberInInt =  Integer.parseInt(editSecondNumberIn.getText().toString());
        int addition = editFirstNumberInInt + ediySecondNumberInInt;
        String stringAddition = String.valueOf(addition);
        textSeeResultOut.setText(stringAddition);
    }
    public void minus(View view){
        int editFirstNumberInInt =  Integer.parseInt(editFirstNumberIn.getText().toString());
        int ediySecondNumberInInt =  Integer.parseInt(editSecondNumberIn.getText().toString());
        int addition = editFirstNumberInInt - ediySecondNumberInInt;
        String stringAddition = String.valueOf(addition);
        textSeeResultOut.setText(stringAddition);
    }
    public void multiply(View view){
        int editFirstNumberInInt =  Integer.parseInt(editFirstNumberIn.getText().toString());
        int ediySecondNumberInInt =  Integer.parseInt(editSecondNumberIn.getText().toString());
        int addition = editFirstNumberInInt * ediySecondNumberInInt;
        String stringAddition = String.valueOf(addition);
        textSeeResultOut.setText(stringAddition);
    }
    public void divide(View view){
        int editFirstNumberInInt =  Integer.parseInt(editFirstNumberIn.getText().toString());
        int editSecondNumberInInt =  Integer.parseInt(editSecondNumberIn.getText().toString());
        int addition = editFirstNumberInInt / editSecondNumberInInt;
        String stringAddition = String.valueOf(addition);
        textSeeResultOut.setText(stringAddition);
    }
}