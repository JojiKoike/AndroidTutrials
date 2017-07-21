package georgie.jp.androidtutrials;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Step 4 : MainActivityから渡された情報を取得
        String color = getIntent().getStringExtra("Color");

        // Step 5 : MainActivityから渡された値に応じて、背景色のカラーコードを設定
        int colorCode = 0;
        switch (color) {
            case "red":
                colorCode = Color.RED;
                break;
            case "blue":
                colorCode = Color.BLUE;
                break;
        }

        // Step 6 : 背景色を変更
        findViewById(R.id.cl_main2).setBackgroundColor(colorCode);

    }
}
