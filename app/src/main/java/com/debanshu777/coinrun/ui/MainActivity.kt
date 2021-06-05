package com.debanshu777.coinrun.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.debanshu777.coinrun.R
import com.debanshu777.coinrun.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())
        navHostFragment.findNavController()
            .addOnDestinationChangedListener{_,destination,_ ->
                when(destination.id){
                    R.id.settingsFragment,R.id.runFragment,R.id.statisticsFragment->
                        bottomNavigationView.visibility= View.VISIBLE
                    else-> bottomNavigationView.visibility=View.GONE
                }
            }
    }
}