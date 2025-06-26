package com.example.cpen252_lab1;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int numMessage;
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

        // 1 Expressing
      numMessage = 10;
      Log.i("numMessage = ",""+numMessage);

      numMessage++;
      numMessage = numMessage + 1 ;
      Log.i("numMessage = ",""+numMessage);

      boolean isFriend = true ;
      Log.i("isFriend = ",""+isFriend);

        // 2
       String contact = "wiraphat";
       String message = "APP";

       Toast.makeText(this, "Message form " +contact, Toast.LENGTH_LONG).show();
       Toast.makeText(this, "Message is " + message,Toast.LENGTH_LONG).show();

        // 3 switch
        String command = "go east";
        switch (command){
            case "go east":
                String Message =" player go to east";
                Log.i("message : ",Message);
                Toast.makeText(this, "Message form " +Message, Toast.LENGTH_LONG).show();
                break;
            case "go wast":
                Log.i("message : ","player go to wast");
                break;
            default:
                Log.i("message : ","Default message");
                break;
        }

        // 4 Loops
        Log.i("message:","In countUp method");
        int x = 0;
        while(true){
            x++;
            Log.i("x = ","" + x);
            Toast.makeText(this, "Message form " +x, Toast.LENGTH_LONG).show();
            if(x == 3){
                break;
            }
        }

        // 5 Using methods
        String mess = joinThese("Method","are","cool");
        Log.i("message ",mess);
        Toast.makeText(this, "Message form " +mess, Toast.LENGTH_LONG).show();
        float area = gatAreaCircle(5f);
        Log.i("area",""+area);
        Toast.makeText(this, "Message form " +area, Toast.LENGTH_LONG).show();
    }
    // 5
    String joinThese(String a, String b, String c){
        return a+b+c;
    }
    float gatAreaCircle(float radius){
        return (float)(3.14*radius*radius);
    }
}