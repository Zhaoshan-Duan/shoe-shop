package com.udacity.shoestore.screens.shoelist

import android.os.Bundle
import android.provider.SyncStateContract.Helpers.update
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding

class ShoeListFragment : Fragment() {

    private lateinit var viewModel: ShoeListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

        viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)

        viewModel.shoeList.observe(viewLifecycleOwner,
            // trigger this when live data changes
            Observer { newList ->
            // update with new list
        })

        binding.fabShoelistDetail.setOnClickListener {
            it.findNavController().navigate(R.id.action_shoeListFragment_to_shoeDetailFragment)
        }

        // Menu
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(context, "You have logged out!", Toast.LENGTH_LONG).show()
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }

    companion object{
        const val TAG = "ShoeListFragment"
    }
}