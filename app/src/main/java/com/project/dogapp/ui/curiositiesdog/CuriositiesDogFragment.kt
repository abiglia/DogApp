package com.project.dogapp.ui.curiositiesdog

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.dogapp.R
import com.project.dogapp.databinding.FragmentCuriositiesDogBinding
import com.project.dogapp.databinding.FragmentDogBreedBinding

class CuriositiesDogFragment : Fragment() {

    private var  _binding: FragmentCuriositiesDogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCuriositiesDogBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}