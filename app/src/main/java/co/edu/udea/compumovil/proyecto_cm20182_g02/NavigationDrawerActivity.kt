package co.edu.udea.compumovil.proyecto_cm20182_g02

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_navigation_drawer.*
import kotlinx.android.synthetic.main.app_bar_navigation_drawer.*
import kotlinx.android.synthetic.main.content_navigation_drawer.*

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        setSupportActionBar(toolbar)

        /*
        boton.setOnClickListener{
            fragmentMenuCargar()
        }
        */

        fragmentMenuCargar()

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

    }



    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.navigation_drawer, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.action_close) { //salir
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
/*Selecionar un elmento del menu    */
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.


        when (item.itemId) {
            R.id.nav_diary -> {
                // Handle the camera action
            }
            R.id.nav_breeding -> {

            }
            R.id.nav_inventory -> {
                cargarInventoryActivityTabbed()
            }
            R.id.nav_product -> {

            }
            R.id.nav_close -> {
                finish()
            }
            R.id.action_close -> {
                finish()
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }


    fun onClick(view: View) {

        when (view.id) {
            R.id.imgInventory -> cargarInventoryActivityTabbed()

        //    R.id.imgBebidaC -> cargarActivityBebida()
        }

    }


    private fun fragmentMenuCargar() { ///muestra de cargar fragmento no lo estoy utilizando
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.content_fragment, MenuFragment())
        fm.commit()
    }


    private fun cargarInventoryActivityTabbed() {
        val miIntent: Intent = Intent(this, InventoryActivityTabbed::class.java)
        startActivity(miIntent)

    }


}
