package sv.edu.ugb.ugbvoice;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, TextToSpeech.OnInitListener {
    private static final int MY_DATA_CHECK_CODE=1;
    private Button btnVoice;
    private EditText txtVoice;
    private TextToSpeech mTts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVoice = (Button) findViewById(R.id.btnVoice);
        txtVoice = (EditText) findViewById(R.id.texto);
        btnVoice.setOnClickListener(this);
        Intent checkIntent = new Intent();
        checkIntent.setAction(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);
        startActivityForResult(checkIntent, MY_DATA_CHECK_CODE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }

    @Override
    public void onClick(View v) {
        String cadena = this.txtVoice.getText().toString();
        mTts.speak(cadena, TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    public void onInit(int status) {
        mTts.setLanguage(new Locale(Locale.getDefault().getDisplayLanguage()));
    }

    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == MY_DATA_CHECK_CODE){
            if(requestCode == TextToSpeech.Engine.CHECK_VOICE_DATA_PASS){
                mTts = new TextToSpeech(this, this);
            }else{
                Intent installIntent = new Intent();
                installIntent.setAction(TextToSpeech.Engine.ACTION_INSTALL_TTS_DATA);
                startActivity(installIntent);
            }
        }
    }

}
