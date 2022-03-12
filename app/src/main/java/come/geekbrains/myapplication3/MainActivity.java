package come.geekbrains.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

  EditText mEditText;
  Button btn_1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mEditText = (EditText) findViewById(R.id.editText);
    btn_1 = (Button) findViewById(R.id.button_1);

    btn_1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        mEditText.setText(mEditText.getText()+"1");
      }
    });
  }
}