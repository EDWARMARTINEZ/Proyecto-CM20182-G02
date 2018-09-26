package co.edu.udea.compumovil.proyecto_cm20182_g02

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_navigation_drawer.*
import kotlinx.android.synthetic.main.app_bar_navigation_drawer.*


class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)
        setSupportActionBar(toolbar)

        fragmentMenuCargar()


     /*
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
*/

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

        //Menu
        selectionMenuImagen()

        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.navigation_drawer, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if (id == R.id.action_close) { //salir
            finish()
        }else if(id == R.id.action_notification)
        {


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


    fun selectionMenuImagen() {

        val imgventory = findViewById<ImageView>(R.id.imgInventory)
        val imgdiary = findViewById<ImageView>(R.id.imgDiary)
        val imgbreeding = findViewById<ImageView>(R.id.imgBreeding)

        imgventory.setOnClickListener{
            menuInventoryActivity()
        }

        imgdiary.setOnClickListener{
            menuDiaryActivityTabbed()
        }


        imgbreeding.setOnClickListener{
            menuBreedingActivityTabbed()
        }

    }


    private fun fragmentMenuCargar() { ///muestra de cargar fragmento no lo estoy utilizando
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(R.id.content_fragment, MenuFragment())
        fm.commit()
    }


    private fun menuInventoryActivity() {
        val miIntent: Intent = Intent(this, InventoryActivity::class.java)
        startActivity(miIntent)
    }


    private fun menuDiaryActivityTabbed() {
        val miIntent: Intent = Intent(this, Activity_Diary_tabbed::class.java)
        startActivity(miIntent)
    }


    private fun menuBreedingActivityTabbed() {
        val miIntent: Intent = Intent(this, BreedingActivityTabbed::class.java)
        startActivity(miIntent)
    }



}
