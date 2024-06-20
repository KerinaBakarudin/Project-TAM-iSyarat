package com.example.isyarat

import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.bumptech.glide.Glide

@Composable
fun DisplayGIF(navController: NavHostController, imageResId: Int, text: String) {
    val context = LocalContext.current

    AndroidView(
        factory = { context ->
            val inflater = LayoutInflater.from(context)
            val view = inflater.inflate(R.layout.show_gif, FrameLayout(context), false)

            val imageView: ImageView = view.findViewById(R.id.imageView)
            val textView: TextView = view.findViewById(R.id.textView)
            val imageButton: ImageButton = view.findViewById(R.id.buttonback)

            Glide.with(context).load(imageResId).into(imageView)
            textView.text = text

            imageButton.setOnClickListener {
                navController.navigate("kosaKataScreen")
            }

            view
        }
    )
}