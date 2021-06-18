package com.example.pvwatts.ui.home.addproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.pvwatts.R
import com.example.pvwatts.databinding.FragmentAddProject02Binding
import com.google.android.material.button.MaterialButton

class AddProjectFragment02 : Fragment(R.layout.fragment_add_project_02) {

    private lateinit var binding: FragmentAddProject02Binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddProject02Binding.bind(view)
        nextFragment()
        backFragment()
    }

    private fun nextFragment() {
        activity?.findViewById<MaterialButton>(R.id.button_next)?.setOnClickListener {
            findNavController().navigate(R.id.action_addProjectFragment02_to_addProjectFragment03)
        }
    }

    private fun backFragment() {
        activity?.findViewById<MaterialButton>(R.id.button_back)?.setOnClickListener {
            activity?.onBackPressed()
        }
    }
}