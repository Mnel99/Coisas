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

        TextView textView2 = new TextView(this);
        textView2.setText("Coentros com batatas e pizza.");

        Button buttonJogar = new Button(this);
        buttonJogar.findViewById(R.id.center);
        buttonJogar.setText("Jogar");

        Button buttonInventario = new Button(this);
        buttonInventario.findViewById(R.id.center);
        buttonInventario.setText("Inventário");

        buttonJogar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                count++;
                textView.setText("Olá Mundo" + count);
            }
        });

        buttonInventario.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                count--;
                textView.setText("Hello World" + count);
            }
        });

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(textView);
        linearLayout.addView(buttonJogar);
        linearLayout.addView(buttonInventario);
        linearLayout.addView(textView2);

        setContentView(linearLayout);
        //setContentView(R.layout.activity_main);
    }
}