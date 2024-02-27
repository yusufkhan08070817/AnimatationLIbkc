package com.example.animation.LIB


import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.animation.R


class AnimationKC( context: Context) {
     val fadein = AnimationUtils.loadAnimation(context, R.anim.fadein)
     val fadein_with_last_state = AnimationUtils.loadAnimation(context, R.anim.fadein_with_last_state)
     val fadeout=AnimationUtils.loadAnimation(context, R.anim.fadeout)
     val fadeout_with_last_state=AnimationUtils.loadAnimation(context, R.anim.fadeoutwithstate)
    val toup=AnimationUtils.loadAnimation(context, R.anim.toup)
    val toup_with_fadeout=AnimationUtils.loadAnimation(context, R.anim.toup_with_fadein)
    val toup_with_fadeout_with_state=AnimationUtils.loadAnimation(context, R.anim.toupwithfadewithstate)
    val todown=AnimationUtils.loadAnimation(context, R.anim.todown)
    val todown_with_fadein=AnimationUtils.loadAnimation(context, R.anim.todown_with_fade)
    val todown_with_fadein_with_state=AnimationUtils.loadAnimation(context, R.anim.todownwithfadewithstate)
    val toright=AnimationUtils.loadAnimation(context, R.anim.toright)
    val go_out_from_right=AnimationUtils.loadAnimation(context, R.anim.outtoright)
    val toleft=AnimationUtils.loadAnimation(context, R.anim.toleft)
     val go_out_from_left=AnimationUtils.loadAnimation(context, R.anim.outtoleft)
     val go_out_from_left_with_state=AnimationUtils.loadAnimation(context, R.anim.outleftwithsatae)
     val go_out_from_right_with_state=AnimationUtils.loadAnimation(context, R.anim.outrightwithstate)
     val zero_to_origal=AnimationUtils.loadAnimation(context, R.anim.zero_to_orignal)
     val orignal_to_zero=AnimationUtils.loadAnimation(context, R.anim.orignal_to_zero)
     val orignal_to_zero_with_state=AnimationUtils.loadAnimation(context, R.anim.orignal_to_zero_with_state)
    val rotate90=AnimationUtils.loadAnimation(context, R.anim.rotate90)
    val rotate90_with_state=AnimationUtils.loadAnimation(context, R.anim.rotate90withstate)
    val rotate90_from_top=AnimationUtils.loadAnimation(context, R.anim.rotate90fromtop)
    val rotate90_from_bottom=AnimationUtils.loadAnimation(context, R.anim.rotate90frombottom)
    val rotate180=AnimationUtils.loadAnimation(context, R.anim.rotate180)
    val rotate180_from_top=AnimationUtils.loadAnimation(context, R.anim.rotate180fromtop)
    val rotate180_from_bottom=AnimationUtils.loadAnimation(context, R.anim.rotate180frombottom)
    val rotate270=AnimationUtils.loadAnimation(context, R.anim.rotate270)
    val rotate270_from_top=AnimationUtils.loadAnimation(context, R.anim.rotate270fromtop)
    val rotate270_from_bottom=AnimationUtils.loadAnimation(context, R.anim.rotate270frombottom)
    val rotate360=AnimationUtils.loadAnimation(context, R.anim.rotate360)
    val rotate360_from_top=AnimationUtils.loadAnimation(context, R.anim.rotate360fromtop)
    val rotate360_from_bottom=AnimationUtils.loadAnimation(context, R.anim.rotate360frombottom)



    fun AnimationStater(View:View,animatation:Animation)
    {
        View.startAnimation(animatation)
    }
}