package com.gdsdesenvolvimento.organizecontas.ui.view

import android.view.View
import androidx.lifecycle.ViewModel
import com.gdsdesenvolvimento.organizecontas.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun getMyViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
    override fun getMyViewModel(): ViewModel? {
        return null
    }
    override fun getLayoutView(): View = binding.root

    override fun codeInject() {

    }

}