package come.geekbrains.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private EditText mEditText;
  SimpleCalculator mSmplCalc;
  private boolean mPlus, mDivide, mMulti, mMinus, mSquare;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initView();
  }

  private void initView() {
    mSmplCalc = new SimpleCalculator();
    mEditText = (EditText) findViewById(R.id.editText);
    ((Button) findViewById(R.id.button_0)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_1)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_2)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_3)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_4)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_5)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_6)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_7)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_8)).setOnClickListener(this);
    ((Button) findViewById(R.id.button_9)).setOnClickListener(this);
    ((Button) findViewById(R.id.butt_point)).setOnClickListener(this);
    initButtonPlusClickListener();
    initButtonDivideClickListener();
    initButtonMultiClickListener();
    initButtonMinusClickListener();
    initButtonSquareClickListener();
    initButtonEqualClickListener();
    initButtonDeleteClickListener();
  }

  private void initButtonDeleteClickListener() {
    ((Button) findViewById(R.id.butt_delete)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        mEditText.setText(null);
      }
    });
  }

  private void initButtonSquareClickListener() {
    ((Button) findViewById(R.id.butt_square)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (mEditText == null) {
          mEditText.setText("");
        } else {
          mSmplCalc.setNumOne(Double.parseDouble(mEditText.getText() + ""));
          mSquare = true;
        }
      }
    });
  }

  private void initButtonMinusClickListener() {
    ((Button) findViewById(R.id.butt_minus)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (mEditText == null) {
          mEditText.setText("");
        } else {
          mSmplCalc.setNumOne(Double.parseDouble(mEditText.getText() + ""));
          mMinus = true;
          mEditText.setText(null);
        }
      }
    });
  }

  private void initButtonMultiClickListener() {
    ((Button) findViewById(R.id.butt_multyplye)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (mEditText == null) {
          mEditText.setText("");
        } else {
          mSmplCalc.setNumOne(Double.parseDouble(mEditText.getText() + ""));
          mMulti = true;
          mEditText.setText(null);
        }
      }
    });
  }

  private void initButtonDivideClickListener() {
    ((Button) findViewById(R.id.butt_divide)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (mEditText == null) {
          mEditText.setText("");
        } else {
          mSmplCalc.setNumOne(Double.parseDouble(mEditText.getText() + ""));
          mDivide = true;
          mEditText.setText(null);
        }
      }
    });
  }

  private void initButtonEqualClickListener() {
    ((Button) findViewById(R.id.butt_equal)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        mSmplCalc.setNumTwo(Double.parseDouble(mEditText.getText() + ""));
        if (mPlus == true) {
          mEditText.setText(mSmplCalc.getNumOne() + mSmplCalc.getNumTwo() + "");
          mPlus = false;
        }
        if (mDivide == true) {
          mEditText.setText(mSmplCalc.getNumOne() / mSmplCalc.getNumTwo() + "");
          mDivide = false;
        }
        if (mMulti == true) {
          mEditText.setText(mSmplCalc.getNumOne() * mSmplCalc.getNumTwo() + "");
          mMulti = false;
        }
        if (mMinus == true) {
          mEditText.setText(mSmplCalc.getNumOne() - mSmplCalc.getNumTwo() + "");
          mMinus = false;
        }
        if (mSquare == true) {
          mEditText.setText(Math.sqrt(mSmplCalc.getNumOne()) + "");
          mSquare = false;
        }
      }
    });
  }

  private void initButtonPlusClickListener() {
    ((Button) findViewById(R.id.butt_plus)).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (mEditText == null) {
          mEditText.setText("");
        } else {
          mSmplCalc.setNumOne(Double.parseDouble(mEditText.getText() + ""));
          mPlus = true;
          mEditText.setText(null);
        }
      }
    });
  }

  @Override
  public void onClick(View view) {
    mSmplCalc.calculate(view.getId());
    mEditText.setText(mEditText.getText() + mSmplCalc.toString());
  }
}
