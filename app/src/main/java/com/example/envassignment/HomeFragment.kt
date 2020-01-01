package com.example.envassignment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() { //View.OnClickListener

    //var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        var navController = findNavController()
        Navigation.setViewNavController(btnLogin, navController)
        btnLogin.setOnClickListener{
            navController.navigate(R.id.action_homeFragment_to_loginFragment2)
        }

        /*val login = root.findViewById<View>(R.id.btnLogin) as Button

            login.setOnClickListener {view: View? ->
                if (view != null) {
                    view.findNavController().navigate(R.id.action_homeFragment_to_loginFragment2)
                }
            }*/


            /*root.btnLogin.setOnClickListener{ view : View ->
                view.findNavController().navigate(R.id.action_homeFragment_to_loginFragment2)
            }*/

        return root
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        //view.findViewById<Button>(R.id.btnLogin).setOnClickListener(this)
    }*/

    /*override fun onClick(v: View?){
        when(v!!.id){
            R.id.btnLogin -> navController!!.navigate(R.id.action_homeFragment_to_loginFragment2)
            //the 6 image buttons put at here, then specify which fragment should go
        }
    }*/

    /*private fun Button.setOnClickListener(homeFragment: HomeFragment) {
        when(view!!.id){
            R.id.btnLogin -> navController!!.navigate(R.id.action_homeFragment_to_loginFragment2)
        }
    }*/
}




