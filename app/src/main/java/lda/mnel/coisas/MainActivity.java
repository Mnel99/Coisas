package lda.mnel.coisas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TextView textView = new TextView(this);
        textView.setText("Hello World");


        Button button = new Button(this);
        button.findViewById(R.id.);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                count++;
                textView.setText("Olá Mundo" + count);
            }
        });

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(textView);
        linearLayout.addView(button);

        setContentView(linearLayout);
        //setContentView(R.layout.activity_main);
    }
}