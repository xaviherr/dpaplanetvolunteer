package esan.dpa.voluntariado.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import esan.dpa.voluntariado.R
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {

    private lateinit var loginView: View
    private lateinit var loginBtn: Button
    private lateinit var sponsorRegisterText: TextView
    private lateinit var volunteerRegisterText: TextView
    private lateinit var userEdit: EditText
    private lateinit var passwordEdit: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginView = inflater.inflate(R.layout.fragment_login, container, false)
        loginBtn = loginView.btnLogin
        sponsorRegisterText = loginView.txtAuspiciador
        volunteerRegisterText = loginView.txtVoluntario
        userEdit = loginView.txtLoginUsuario
        passwordEdit = loginView.txtLoginClave

        setLoginBtnListener()
        setVolunteerRegisterTextListener()
        setSponsorRegisterTextListener()

        return loginView
    }

    private fun setLoginBtnListener(){
        loginBtn.setOnClickListener {
            findNavController()
                .navigate(LoginFragmentDirections
                    .actionLoginFragmentToEventListFragment())
        }
    }

    private fun setSponsorRegisterTextListener(){
        sponsorRegisterText.setOnClickListener {
            findNavController()
                .navigate(LoginFragmentDirections
                    .actionLoginFragmentToSponsorRegisterFragment())
        }
    }

    private fun setVolunteerRegisterTextListener(){
        volunteerRegisterText.setOnClickListener {
            findNavController()
                .navigate(LoginFragmentDirections
                    .actionLoginFragmentToVolunteerRegisterFragment())
        }
    }

}