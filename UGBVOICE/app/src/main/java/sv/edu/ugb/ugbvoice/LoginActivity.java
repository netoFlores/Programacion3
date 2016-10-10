package sv.edu.ugb.ugbvoice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements  OnClickListener {
    private EditText passwd;
    private Button btnLogin;
    AutoCompleteTextView correo;
    int contador = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        passwd = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.email_sign_in_button);
        correo = (AutoCompleteTextView) findViewById(R.id.email);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.email_sign_in_button){
            String a = "meflores@ugb.edu.sv";
            String b = "123456";
            if(contador >3)
            {
                //Escribo el numero de telefono a quien se lo enviaremos el mensaje.
                String numero = "";
                String message = "Se ha intentado ingresar a la aplicacion más de tres veces";
                //Las siguientes lineas hacen el proceso de enviar un mensaje de texto.
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(numero,null, message, null, null);
                Toast.makeText(this, "Sent", Toast.LENGTH_LONG).show();
                //Cierra la aplicación
                finish();
            }
            //Hace la evaluación si correo y la contraseña es correcta o no
            if(a.equals(correo.getText().toString())  && b.equals(passwd.getText().toString())){
                //Cambiar
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }else{
                contador += 1;
                Toast.makeText(this, "Login incorrecto", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}