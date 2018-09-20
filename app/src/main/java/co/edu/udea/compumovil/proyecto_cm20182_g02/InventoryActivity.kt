package co.edu.udea.compumovil.proyecto_cm20182_g02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class InventoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory)

        setupActionBar()
        init()
    }

    private fun setupActionBar() {
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setTitle("Inventario")
    }

    private fun init() {
        val imganimalsregister = findViewById<ImageView>(R.id.imgAnimalsRegister)

        imganimalsregister.setOnClickListener { view ->
            menuInventoryAnimalsRegisterActivity()
        }
    }


    private fun menuInventoryAnimalsRegisterActivity() {
        val miIntent: Intent = Intent(this, InventoryAnimalsActivity::class.java)
        startActivity(miIntent)
    }

}
