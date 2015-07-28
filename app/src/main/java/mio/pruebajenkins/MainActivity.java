package mio.pruebajenkins;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textViewResult = null;
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonMas, buttonMenos, buttonDiv, buttonPor, buttonC, buttonEquals = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager();
        getActionBar();
    }
}
