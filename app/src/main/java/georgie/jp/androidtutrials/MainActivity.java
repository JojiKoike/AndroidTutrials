package georgie.jp.androidtutrials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {

        // Step 1 :　遷移先に伝える情報を入れる箱を作る
        // Intentコンストラクの引数は以下の通り
        // Intent(遷移元Activityクラス名.this, 遷移先Activityクラス名.class)
        // 郵便封筒に例えると,,,
        // Intent : 封筒、遷移元Activityクラス名 : 送り元住所、遷移先Activityクラス名.class : 送り先住所
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        // Step 2 : Step1で用意した箱に、遷移先に伝える情報を以下の形式で設定する
        // intent.putExtra("Key文字列", "Value文字列")
        switch (view.getId()) {
            case R.id.btn_red:
                // 「あお」がクリックされた時
                intent.putExtra("Color", "red");
                break;
            case R.id.btn_blue:
                // 「あか」がクリックされた時
                intent.putExtra("Color", "blue");
                break;
        }

        // Step 3 : Step2で詰めた値を伝えつつ、遷移先Activityを起動
        startActivity(intent);

    }
}
