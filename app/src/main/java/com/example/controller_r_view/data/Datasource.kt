package com.example.controller_r_view.data

import com.example.controller_r_view.data.model.Controller
import com.example.controller_r_view.R

class Datasource() {

    fun loadController(): List<Controller> {
        return listOf(
            Controller(
                R.drawable.ps5_controller,
                "PS5 Controller",
                69.99,
                false
            ),
            Controller(
                R.drawable.xbox_controller,
                "Xbox Controller",
                45.99,
                true
            ),
            Controller(
                R.drawable.nintento_joy_con,
                "Nintendo Joy Cons",
                59.99,
                false
            ),
            Controller(
                R.drawable.nintendo_switch_pro_controller,
                "Nintendo Switch Pro Controller",
                55.99,
                false
            ),
            Controller(
                R.drawable._bitdo_sn30_pro_controller,
                "8Bitdo SN30 Pro Controller",
                40.06,
                true
            )
        )
    }
}

