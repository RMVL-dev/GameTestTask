package com.example.gametesttask.presenatation.timerimp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout
import com.example.gametesttask.R
import com.example.gametesttask.databinding.TimerLayoutBinding

class TimerPart @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : RelativeLayout(context, attrs) {

    private var _binding:TimerLayoutBinding? = null
    val binding get() = _binding!!

    init {
        _binding = TimerLayoutBinding.bind(
            LayoutInflater.from(context).inflate(R.layout.timer_layout, this, true)
        )
    }

    fun updateCountdown(timer:Int){
        binding.countdown.text = timer.toString()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        _binding = null
    }



}
