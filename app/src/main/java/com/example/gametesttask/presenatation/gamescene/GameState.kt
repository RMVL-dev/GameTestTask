package com.example.gametesttask.presenatation.gamescene

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameState: ViewModel() {

    private var _timer = MutableLiveData("")
    val timer: LiveData<String> get() = _timer

    private var _coins = MutableLiveData(100)
    val coins: LiveData<Int> get() = _coins

    init {
        startTimer()
    }


    fun startTimer(){

        object : CountDownTimer(40000, 1000){
            override fun onTick(millisUntilFinished: Long) {
                val secondsRemaining = millisUntilFinished/1000
                _timer.value = secondsRemaining.toString()


            }
            override fun onFinish() {

            }
        }.start()

    }


}