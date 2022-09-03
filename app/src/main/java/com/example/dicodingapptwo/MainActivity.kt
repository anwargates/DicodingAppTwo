package com.example.dicodingapptwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDrivers: RecyclerView
    private var list: ArrayList<Driver> = arrayListOf()
    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvDrivers = findViewById(R.id.rv_drivers)
        rvDrivers.setHasFixedSize(true)

        list.addAll(DriversData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDrivers.layoutManager = LinearLayoutManager(this)
        val listDriverAdapter = ListDriverAdapter(list)
        rvDrivers.adapter = listDriverAdapter

        listDriverAdapter.setOnItemClickCallback(object : ListDriverAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Driver) {
                showSelectedDriver(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }
            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
            R.id.about -> {
                showAboutPage()
            }
        }
        setActionBarTitle(title)
    }
    private fun showRecyclerGrid() {
        rvDrivers.layoutManager = GridLayoutManager(this, 2)
        val gridDriverAdapter = GridDriverAdapter(list)
        rvDrivers.adapter = gridDriverAdapter

        gridDriverAdapter.setOnItemClickCallback(object : GridDriverAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Driver) {
                showSelectedDriver(data)
            }
        })
    }
    private fun showRecyclerCardView() {
        rvDrivers.layoutManager = LinearLayoutManager(this)
        val cardViewDriverAdapter = CardViewDriverAdapter(list)
        rvDrivers.adapter = cardViewDriverAdapter
    }
    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedDriver(driver: Driver) {
        Toast.makeText(this, "Kamu memilih " + driver.name, Toast.LENGTH_SHORT).show()
    }

    private fun showAboutPage(){
        startActivity(Intent(this, AboutActivity::class.java))
    }
}