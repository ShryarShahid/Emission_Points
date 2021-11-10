package com.example.emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    private TextView textView1;
    private Button option1, option2,option3,option4;
    private ArrayList<QuizModel> quizModelArrayList;
    Random random;
    int currentScore=0, questionsAttempted=1, currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2);
        textView1 = findViewById(R.id.textView3);
        option1 = findViewById(R.id.button1);
        option2 = findViewById(R.id.button2);
        option3 = findViewById(R.id.button3);
        option4 = findViewById(R.id.button4);
        quizModelArrayList = new ArrayList<>();
        random= new Random();
        currentPos = random.nextInt(quizModelArrayList.size());
        getQuizQuestions(quizModelArrayList);
        setDataToViews(currentPos);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionsAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionsAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionsAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (quizModelArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4.getText().toString().trim().toLowerCase())) {
                    currentScore++;
                }
                questionsAttempted++;
                currentPos = random.nextInt(quizModelArrayList.size());
                setDataToViews(currentPos);
            }
        });

    }

    private void setDataToViews(int currentPos) {
        textView1.setText("Questions Attempted : "+ questionsAttempted + "/10");
        textView.setText(quizModelArrayList.get(currentPos).getQuestion());
        option1.setText(quizModelArrayList.get(currentPos).getOption1());
        option2.setText(quizModelArrayList.get(currentPos).getOption2());
        option3.setText(quizModelArrayList.get(currentPos).getOption3());
        option4.setText(quizModelArrayList.get(currentPos).getOption4());
    }

    private void getQuizQuestions(ArrayList<QuizModel> quizModelArrayList) {
        quizModelArrayList.add(new QuizModel(Question: "How are you?", option1:"Fine", option2: "Nice", option3:"Great", option4: "Not", answer:"Fine"));
    }
}