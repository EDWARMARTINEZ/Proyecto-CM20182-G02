package co.edu.udea.compumovil.proyecto_cm20182_g02

import android.app.DatePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class InventoryAnimalsActivity : AppCompatActivity() {


    var calendar_animal: ImageView? = null
    var txtcalendar: TextView? = null
    private var dia: Int = 0
    var mes: Int = 0
    var ano: Int = 0
    val hora: Int = 0
    val minutos: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventory_animals)

        setupActionBar()
    }

    private fun setupActionBar() {
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setTitle("Inventario > Animals")
    }



    private fun lookCalendar() {
        val c = Calendar.getInstance()
        dia = c.get(Calendar.DAY_OF_MONTH)
        mes = c.get(Calendar.MONTH)
        ano = c.get(Calendar.YEAR)

        val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth -> txtcalendar?.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year) }, dia, mes, ano)
        datePickerDialog.show()

    }

    private fun init() {
        calendar_animal = findViewById(R.id.imgCalendar_Animals) as ImageView
        txtcalendar = findViewById(R.id.txtCalendar) as TextView
    }





}
