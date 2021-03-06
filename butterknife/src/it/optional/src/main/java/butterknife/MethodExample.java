package butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import butterknife.InjectView;
import butterknife.OnClick;
import butterknife.Optional;
import butterknife.Views;

public class MethodExample extends Activity {
  static boolean HAS_ONE = true;

  @OnClick(1)
  public void doStuff() {}

  @Optional @OnClick(2)
  public void doOtherStuff() {}

  @Override public View findViewById(int id) {
    if (HAS_ONE && id == 1) {
      return new View(this);
    }
    return null;
  }
}
