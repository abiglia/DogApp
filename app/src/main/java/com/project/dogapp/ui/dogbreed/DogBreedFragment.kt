package com.project.dogapp.ui.dogbreed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.dogapp.databinding.FragmentDogBreedBinding

class DogBreedFragment : Fragment() {

    private var  _binding:FragmentDogBreedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDogBreedBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}