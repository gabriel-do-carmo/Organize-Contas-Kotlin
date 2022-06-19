package com.gdsdesenvolvimento.organizecontas.ui.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity(){
    private var _binding : VB? = null
    protected val binding get() =  _binding!!
    private var _viewModel : ViewModel? = null
    protected val viewModel get() = _viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getMyViewBinding()
        _viewModel = getMyViewModel()
        setContentView(getLayoutView())
        codeInject()
    }

    abstract fun getMyViewBinding(): VB
    abstract fun getMyViewModel(): ViewModel?
    abstract fun getLayoutView(): View
    abstract fun codeInject()

}