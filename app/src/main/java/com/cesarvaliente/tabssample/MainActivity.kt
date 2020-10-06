package com.cesarvaliente.tabssample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.device.dualscreen.core.DisplayPosition
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab_layout.addTab(tab_layout.newTab().setText("Tab 1"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 2"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 3"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 4"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 5"))
        tab_layout.addTab(tab_layout.newTab().setText("Tab 6"))

        move_to_start.setOnClickListener { tab_layout.surfaceDuoDisplayPosition = DisplayPosition.START }
        move_to_end.setOnClickListener { tab_layout.surfaceDuoDisplayPosition = DisplayPosition.END }
        span.setOnClickListener { tab_layout.surfaceDuoDisplayPosition = DisplayPosition.DUAL }
}
}