package com.example.worldcinema1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class Profile : AppCompatActivity() {

    lateinit var tb: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        tb=findViewById(R.id.toolbar)
        setSupportActionBar(this.tb)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Профиль"
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> {
                val inte = Intent(this, ToolBarActivity::class.java)
                startActivity(inte)
                finish()
            }
            R.id.one ->{
                Toast.makeText(this, "работает", Toast.LENGTH_SHORT).show()
            }
            R.id.two ->{
                Toast.makeText(this, "машинка би-бип", Toast.LENGTH_SHORT).show()
            }
            R.id.three ->{
                Toast.makeText(this, "уведомления делают птыщь, птыщь, птыщь", Toast.LENGTH_SHORT).show()
            }
        }

        return true
    }
}