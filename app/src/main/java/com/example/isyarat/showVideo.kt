package com.example.isyarat

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import androidx.compose.runtime.DisposableEffect
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

fun setRequestedOrientation(context: Context, orientation: Int) {
    val activity = context as? Activity
    activity?.requestedOrientation = orientation
}

@Composable
fun VideoScreen1() {
    val context = LocalContext.current

    DisposableEffect(Unit) {
        setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        onDispose {
            setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
        }
    }

    AndroidView(
        factory = {
            val videoView = VideoView(it)
            val uri = Uri.parse("android.resource://" + context.packageName + "/" + R.raw.katasapa)
            videoView.setVideoURI(uri)
            val mediaController = MediaController(it)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)
            videoView.start()
            videoView
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun VideoScreen2() {
    val context = LocalContext.current

    DisposableEffect(Unit) {
        setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        onDispose {
            setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
        }
    }

    AndroidView(
        factory = {
            val videoView = VideoView(it)
            val uri = Uri.parse("android.resource://" + context.packageName + "/" + R.raw.katasifat)
            videoView.setVideoURI(uri)
            val mediaController = MediaController(it)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)
            videoView.start()
            videoView
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun VideoScreen3() {
    val context = LocalContext.current

    DisposableEffect(Unit) {
        setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        onDispose {
            setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
        }
    }

    AndroidView(
        factory = {
            val videoView = VideoView(it)
            val uri = Uri.parse("android.resource://" + context.packageName + "/" + R.raw.keluarga)
            videoView.setVideoURI(uri)
            val mediaController = MediaController(it)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)
            videoView.start()
            videoView
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun VideoScreen4() {
    val context = LocalContext.current

    DisposableEffect(Unit) {
        setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        onDispose {
            setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
        }
    }

    AndroidView(
        factory = {
            val videoView = VideoView(it)
            val uri = Uri.parse("android.resource://" + context.packageName + "/" + R.raw.hari)
            videoView.setVideoURI(uri)
            val mediaController = MediaController(it)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)
            videoView.start()
            videoView
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun VideoScreen5() {
    val context = LocalContext.current

    DisposableEffect(Unit) {
        setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)
        onDispose {
            setRequestedOrientation(context, ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
        }
    }

    AndroidView(
        factory = {
            val videoView = VideoView(it)
            val uri = Uri.parse("android.resource://" + context.packageName + "/" + R.raw.perkenalan)
            videoView.setVideoURI(uri)
            val mediaController = MediaController(it)
            mediaController.setAnchorView(videoView)
            videoView.setMediaController(mediaController)
            videoView.start()
            videoView
        },
        modifier = Modifier.fillMaxWidth()
    )
}