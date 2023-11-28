package com.hmwn.accessibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hmwn.accessibility.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
        initListener()

    }

    private fun initView() {

        with(binding) {

            val featureAdapter = FeatureAdapter(getData())

            rvFeature.apply {
                adapter = featureAdapter
                layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            }

        }

    }

    private fun initListener() {

        with(binding) {

            btnSetting.setOnClickListener {

            }

        }

    }

    private fun getData() : List<String> {

        return listOf(
            "Text View",
            "Image View",
            "Edit Text",
            "Tombol"
        )

    }

}