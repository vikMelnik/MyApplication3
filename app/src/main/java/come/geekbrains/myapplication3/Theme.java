package come.geekbrains.myapplication3;

import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

public enum Theme {

  ONE(R.style.CalcButton, R.string.theme_one,"THEME_ONE"),
  TWO(R.style.CalcButton_Action, R.string.theme_two, "THEME_TWO");

  private @StyleRes
          final int theme;

  private @StringRes
          final int title;

  private final String key;

  Theme(int theme, int title, String key) {
    this.theme = theme;
    this.title = title;
    this.key = key;
  }
  public int getTitle() {
    return title;
  }

  public String getKey() {
    return key;
  }

  public int getTheme() {
    return theme;
  }

}
