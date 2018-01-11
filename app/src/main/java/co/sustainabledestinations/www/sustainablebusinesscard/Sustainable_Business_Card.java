package co.sustainabledestinations.www.sustainablebusinesscard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sustainable_Business_Card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sustainable__business__card);


     Button buttonClick = (Button) findViewById(R.id.button);
        buttonClick.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://bit.ly/SDAmbassadorsQuiz"));
                startActivity(browserIntent);
            }
        });

    }

}



