package com.example.randomjokegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private TextView jokeTextView;
    private Button newJokeButton;
    private String[] jokes = {
            "Why did the math book look sad?\n Because it had too many problems.",
            "Why did the teacher wear sunglasses?\n Because her students were so bright!",
            "Why did the science teacher break up with the history teacher?\n They had no chemistry.",
            "Why did the student bring a ladder to school?\n To reach the high grades!",
            "Teacher: \"Why did you do your math homework on the floor?\"\n" +
                    "Student: \"You told me to do it without tables.\"",
            "Teacher: \"What is the difference between a book and a teacher?\"\n" +
                    "Student: \"You can close a book, but you can't close a teacher.\""
    };
    private int[] colors={
            Color.BLUE,Color.RED
    };
    private int cor=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jokeTextView = findViewById(R.id.joke_text_view);
        newJokeButton = findViewById(R.id.new_joke_button);
        newJokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jokeTextView.setTextColor(colors[cor]);
                cor=(cor+1)%2;
                Random random = new Random();
                int index = random.nextInt(jokes.length);
                String randomQuote = jokes[index];
                jokeTextView.setText(randomQuote);

            }
        });
    }
}