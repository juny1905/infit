package com.example.ryan.infit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConceptRoomActivity extends AppCompatActivity {
    TextView tv_style, tv_style_description;
    ImageView img_concept_room, img_saying_character;
    Button btn_go_shopping;
    int idx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concept_room);

        Intent intent_prev = getIntent();
        MBTI person = (MBTI) intent_prev.getSerializableExtra("person");
        final int style_index = intent_prev.getIntExtra("style_index", 0);
        tv_style = findViewById(R.id.tv_style);
        tv_style_description = findViewById(R.id.tv_style_description);
        img_concept_room = findViewById(R.id.img_concept_room);
        img_saying_character = findViewById(R.id.im_saying_character);
        btn_go_shopping = findViewById(R.id.btn_go_shopping);

        btn_go_shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(),RoomSample.class);
                intent.putExtra("style",style_index);
                startActivity(intent);
            }
        });

        if(style_index == 0 || style_index == 1 || style_index == 2 ||
                style_index == 6 || style_index == 7 || style_index == 9)
            tv_style.setText(Style_Info.Styles[style_index] + " 이란?");
        else
            tv_style.setText(Style_Info.Styles[style_index] + " 란?");

        tv_style_description.setText("  " + Style_Info.Styles_description[style_index]);

        img_concept_room.setImageDrawable(getDrawable(Style_Info.index_to_cloud[style_index]));

        switch (person.getMBTI_Result_4words()) {
            case "INTJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_intj));
                break;
            case "INTP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_intp));
                break;
            case "ENTJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_entj));
                break;
            case "ENTP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_entp));
                break;
            case "INFJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_infj));
                break;
            case "INFP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_infp));
                break;
            case "ENFJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_enfj));
                break;
            case "ENFP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_enfp));
                break;
            case "ISTJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_istj));
                break;
            case "ISFJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_isfj));
                break;
            case "ESTJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_estj));
                break;
            case "ESFJ":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_esfj));
                break;
            case "ISTP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_istp));
                break;
            case "ISFP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_isfp));
                break;
            case "ESTP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_estp));
                break;
            case "ESFP":
                img_saying_character.setImageDrawable(getDrawable(R.mipmap.chara_esfp));
                break;
            default:
                img_saying_character.setImageDrawable(getDrawable(R.drawable.ic_launcher_background));
                break;
        }


    }
}
