package com.dicoding.myflexiblefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val mHomeFragment = HomeFragment()
        val fragment = mFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        /*
        Kode di bawah ini digunakan untuk memvalidasi apakah suatu fragment adalah instance dari suatu kelas
         */
        if (fragment !is HomeFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name" + HomeFragment::class.java.simpleName)
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mHomeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}