package com.example.gametesttask.presenatation.gamescene

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.gametesttask.R
import com.example.gametesttask.databinding.FragmentGameSceneBinding


class GameScene : Fragment() {

    private var _binding: FragmentGameSceneBinding? = null
    val binding get() = _binding!!

    private val gameViewModel:GameState by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentGameSceneBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        gameViewModel.timer.observe(viewLifecycleOwner){
            binding.timer.binding.countdown.text = it
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}