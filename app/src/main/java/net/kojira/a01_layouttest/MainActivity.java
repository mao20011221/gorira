package net.kojira.a01_layouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView text = findViewById(R.id.text);
        final ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (count) {
                    case 0:
                        text.setText("uuuuuuuuuuuuuuuu");
                        imageView.setImageResource(R.drawable.goriraen2);
                        break;
                    case 1:
                        text.setText("eeeeeeeeeeeeee");
                        break;
                    case 2:
                        text.setText("oooooooooooooo");
                        break;
                    case 3:
                        text.setText("kkkkkkkkkkkkk");
                        break;
                }
                count += 1;
            }
        });

    }
}
