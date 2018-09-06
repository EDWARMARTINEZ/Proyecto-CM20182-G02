package co.edu.udea.compumovil.proyecto_cm20182_g02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

/**
 * A login screen that offers login via email/password.
 */
class LoginActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttons = findViewById<Button>(R.id.email_sign_in_button)

        buttons.setOnClickListener{
            view -> cargarActivityMenu()
        }

    }

    private fun cargarActivityMenu() {
        val miIntent: Intent = Intent(this, MenuActivity::class.java)
        startActivity(miIntent)
    }



}
