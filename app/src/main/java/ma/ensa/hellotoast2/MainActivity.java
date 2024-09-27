package ma.ensa.hellotoast2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button sendia, sendiia;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        sendia = findViewById(R.id.sendi);
        sendiia = findViewById(R.id.sendii);

//methode1
        // sendi.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //     public void onClick(View v) {
        //         Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
        //     }
        // });

        // sendii.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //     public void onClick(View v) {
        //         count++;
        //         textView.setText(String.valueOf(count));
        //     }
        // });
        // methode2
//        View.OnClickListener btn = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(v.getId()==R.id.sendi){
//                    Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
//                }
//                if(v.getId()==R.id.sendii){
//                    count++;
//                    textView.setText(String.valueOf(count));
//                }
//            }
//        };
//        sendia.setOnClickListener(btn);
//        sendiia.setOnClickListener(btn);

        //methode3
        View.OnClickListener btn =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==sendia){
                    Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
                }
                if(v==sendiia){
                    count++;
                    textView.setText(String.valueOf(count));
                }

            }
        };
        sendia.setOnClickListener(btn);
        sendiia.setOnClickListener(btn);

    }
}
