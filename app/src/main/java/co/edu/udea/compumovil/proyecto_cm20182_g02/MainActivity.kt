package co.edu.udea.compumovil.proyecto_cm20182_g02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed(Runnable { cargarActivityLoguin() }, 3000)

    }


    private fun cargarActivityLoguin() {
        val miIntent:Intent= Intent ( this, LoginActivity::class.java)
            startActivity(miIntent)
            finish()
    }
}
