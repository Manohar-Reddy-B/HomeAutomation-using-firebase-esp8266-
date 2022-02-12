package com.example.smarthome

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smarthome.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var lRbulb = true
    private var lRfan = true
    private var lRtv = true
    private var lRwifi = true
    private var BRbulb = true
    private var BRfan = true
    private var BRlamp = true
    private var BRac = true
    private var kRbulb = true
    private var kRvfan = true
    private var kRpump = true
    private var kRfreezer = true
    private lateinit var auth: FirebaseAuth
    var databaseRef: DatabaseReference? = null
    var db: FirebaseDatabase? = null

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        auth = FirebaseAuth.getInstance()
        db = FirebaseDatabase.getInstance()
        databaseRef = db?.reference!!.child("appliance")
//        val currentUser = auth.currentUser
//        val cuDb = databaseRef?.child((currentUser?.uid!!))
          val cuDb= databaseRef

        binding.imageView1.setOnClickListener {
            lRbulb = if (lRbulb) {
                binding.imageView1.setImageResource(R.drawable.bulb_on)
                binding.imageView1.setBackgroundResource(R.color.green)
                cuDb?.child("lRbulb")?.setValue(true)
                false
            } else {
                binding.imageView1.setImageResource(R.drawable.bulb_off)
                binding.imageView1.setBackgroundColor(0x00000000)
                cuDb?.child("lRbulb")?.setValue(false)
                true
            }
        }
        binding.imageView2.setOnClickListener {
            lRfan = if (lRfan) {
                binding.imageView2.setImageResource(R.drawable.fan_on)
                binding.imageView2.setBackgroundResource(R.color.green)
                cuDb?.child("lRfan")?.setValue(true)
                false
            } else {
                binding.imageView2.setImageResource(R.drawable.fan_off)
                binding.imageView2.setBackgroundColor(0x00000000)
                cuDb?.child("lRfan")?.setValue(false)
                true
            }
        }
        binding.imageView3.setOnClickListener {
            lRtv = if (lRtv) {
                binding.imageView3.setImageResource(R.drawable.tv_on)
                binding.imageView3.setBackgroundResource(R.color.green)
                cuDb?.child("lRtv")?.setValue(true)
                false
            } else {
                binding.imageView3.setImageResource(R.drawable.tv_off)
                binding.imageView3.setBackgroundColor(0x00000000)
                cuDb?.child("lRtv")?.setValue(false)
                true
            }
        }
        binding.imageView4.setOnClickListener {
            lRwifi = if (lRwifi) {
                binding.imageView4.setImageResource(R.drawable.wifi_on)
                binding.imageView4.setBackgroundResource(R.color.green)
                cuDb?.child("lRwifi")?.setValue(true)
                false
            } else {
                binding.imageView4.setImageResource(R.drawable.wifi_off)
                binding.imageView4.setBackgroundColor(0x00000000)
                cuDb?.child("lRwifi")?.setValue(false)
                true
            }
        }
        binding.imageView5.setOnClickListener {
            BRbulb = if (BRbulb) {
                binding.imageView5.setImageResource(R.drawable.bulb_on)
                binding.imageView5.setBackgroundResource(R.color.green)
                cuDb?.child("BRbulb")?.setValue(true)
                false
            } else {
                binding.imageView5.setImageResource(R.drawable.bulb_off)
                binding.imageView5.setBackgroundColor(0x00000000)
                cuDb?.child("BRbulb")?.setValue(false)
                true
            }
        }
        binding.imageView6.setOnClickListener {
            BRfan = if (BRfan) {
                binding.imageView6.setImageResource(R.drawable.fan_on)
                binding.imageView6.setBackgroundResource(R.color.green)
                cuDb?.child("BRfan")?.setValue(true)
                false
            } else {
                binding.imageView6.setImageResource(R.drawable.fan_off)
                binding.imageView6.setBackgroundColor(0x00000000)
                cuDb?.child("BRfan")?.setValue(false)
                true
            }
        }
        binding.imageView7.setOnClickListener {
            BRlamp = if (BRlamp) {
                binding.imageView7.setImageResource(R.drawable.lamp_on)
                binding.imageView7.setBackgroundResource(R.color.green)
                cuDb?.child("BRlamp")?.setValue(true)
                false
            } else {
                binding.imageView7.setImageResource(R.drawable.lamp_off)
                binding.imageView7.setBackgroundColor(0x00000000)
                cuDb?.child("BRlamp")?.setValue(false)
                true
            }
        }
        binding.imageView8.setOnClickListener {
            BRac = if (BRac) {
                binding.imageView8.setImageResource(R.drawable.ac_on)
                binding.imageView8.setBackgroundResource(R.color.green)
                cuDb?.child("BRac")?.setValue(true)
                false
            } else {
                binding.imageView8.setImageResource(R.drawable.ac_off)
                binding.imageView8.setBackgroundColor(0x00000000)
                cuDb?.child("BRac")?.setValue(false)
                true
            }
        }
        binding.imageView9.setOnClickListener {
            kRbulb = if (kRbulb) {
                binding.imageView9.setImageResource(R.drawable.bulb_on)
                binding.imageView9.setBackgroundResource(R.color.green)
                cuDb?.child("kRbulb")?.setValue(true)
                false
            } else {
                binding.imageView9.setImageResource(R.drawable.bulb_off)
                binding.imageView9.setBackgroundColor(0x00000000)
                cuDb?.child("kRbulb")?.setValue(false)
                true
            }
        }
        binding.imageView10.setOnClickListener {
            kRvfan = if (kRvfan) {
                binding.imageView10.setImageResource(R.drawable.ventilation_fan_on)
                binding.imageView10.setBackgroundResource(R.color.green)
                cuDb?.child("kRvfan")?.setValue(true)
                false
            } else {
                binding.imageView10.setImageResource(R.drawable.ventilation_fan_off)
                binding.imageView10.setBackgroundColor(0x00000000)
                cuDb?.child("kRvfan")?.setValue(false)
                true
            }
        }
        binding.imageView11.setOnClickListener {
            kRpump = if (kRpump) {
                binding.imageView11.setImageResource(R.drawable.water__pump_on)
                binding.imageView11.setBackgroundResource(R.color.green)
                cuDb?.child("kRpump")?.setValue(true)
                false
            } else {
                binding.imageView11.setImageResource(R.drawable.water__pump_off)
                binding.imageView11.setBackgroundColor(0x00000000)
                cuDb?.child("kRpump")?.setValue(false)
                true
            }
        }
        binding.imageView12.setOnClickListener {
            kRfreezer = if (kRfreezer) {
                binding.imageView12.setImageResource(R.drawable.freezer_on)
                binding.imageView12.setBackgroundResource(R.color.green)
                cuDb?.child("kRfreezer")?.setValue(true)
                false
            } else {
                binding.imageView12.setImageResource(R.drawable.freezer_off)
                binding.imageView12.setBackgroundColor(0x00000000)
                cuDb?.child("kRfreezer")?.setValue(false)
                true
            }
        }
//        binding.logout.setOnClickListener{
//            auth.signOut()
//            val intent= Intent(this,Login::class.java)
//            startActivity(intent)
//            finish()
//        }
    }

//    private fun readData(userName: String) {
//
//        databaseRef = FirebaseDatabase.getInstance().getReference("Users")
//        databaseRef?.child(userName)?.get()?.addOnSuccessListener {
//
//            if (it.exists()) {
//
//                val firstname = it.child("firstName").value
//                val lastName = it.child("lastName").value
//                val age = it.child("age").value
//            } else {
//
//                Toast.makeText(this, "Data Not available", Toast.LENGTH_SHORT).show()
//
//
//            }
//
//        }?.addOnFailureListener {
//
//            Toast.makeText(this, "Failed to C", Toast.LENGTH_SHORT).show()
//
//
//        }

//    }
}