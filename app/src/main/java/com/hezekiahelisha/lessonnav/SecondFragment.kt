package com.hezekiahelisha.lessonnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.hezekiahelisha.lessonnav.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    val args:SecondFragmentArgs by navArgs()

    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        val myNumber = args.number

        binding.secondTextView.text = myNumber.toString()

        binding.secondTextView.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_secondFragment_to_firstFragment)
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }

}