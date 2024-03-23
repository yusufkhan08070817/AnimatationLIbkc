package com.example.animation.LIB


import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.animation.R


class AnimationKC(val context: Context) {
    lateinit var animationchane: AnimationKC
    lateinit var v: View

    enum class AnimationType(private val resourceId: Int) {
        FADE_IN(R.anim.fadein),
        FADE_IN_WITH_LAST_STATE(R.anim.fadein_with_last_state),
        FADE_OUT(R.anim.fadeout),
        FADE_OUT_WITH_LAST_STATE(R.anim.fadein_with_last_state),
        TO_UP(R.anim.toup),
        TO_UP_WITH_FADE_OUT(R.anim.toup_with_fadein),
        TO_UP_WITH_FADE_OUT_WITH_STATE(R.anim.toup_with_fadein),
        TO_DOWN(R.anim.todown),
        TO_DOWN_WITH_FADE_IN(R.anim.todown_with_fade),
        TO_DOWN_WITH_FADE_IN_WITH_STATE(R.anim.todownwithfadewithstate),
        TO_RIGHT(R.anim.toright),
        GO_OUT_FROM_RIGHT(R.anim.outtoright),
        TO_LEFT(R.anim.toleft),
        GO_OUT_FROM_LEFT(R.anim.outtoleft),
        GO_OUT_FROM_LEFT_WITH_STATE(R.anim.outleftwithsatae),
        GO_OUT_FROM_RIGHT_WITH_STATE(R.anim.outrightwithstate),
        ZERO_TO_ORIGINAL(R.anim.zero_to_orignal),
        ORIGINAL_TO_ZERO(R.anim.orignal_to_zero),
        ORIGINAL_TO_ZERO_WITH_STATE(R.anim.orignal_to_zero_with_state),
        ROTATE_90(R.anim.rotate90),
        ROTATE_90_WITH_STATE(R.anim.rotate90withstate),
        ROTATE_90_FROM_TOP(R.anim.rotate90fromtop),
        ROTATE_90_FROM_BOTTOM(R.anim.rotate90frombottom),
        ROTATE_180(R.anim.rotate180),
        ROTATE_180_FROM_TOP(R.anim.rotate180fromtop),
        ROTATE_180_FROM_BOTTOM(R.anim.rotate180frombottom),
        ROTATE_270(R.anim.rotate270),
        ROTATE_270_FROM_TOP(R.anim.rotate270fromtop),
        ROTATE_270_FROM_BOTTOM(R.anim.rotate270frombottom),
        ROTATE_360(R.anim.rotate360),
        ROTATE_360_FROM_TOP(R.anim.rotate360fromtop),
        ROTATE_360_FROM_BOTTOM(R.anim.rotate360frombottom),

        LONG_FADE_IN(R.anim.long_fadein),
        LONG_FADE_IN_WITH_LAST_STATE(R.anim.long_fadein_with_last_state),
        LONG_FADE_OUT(R.anim.long_fadeout),
        LONG_FADE_OUT_WITH_LAST_STATE(R.anim.long_fadeoutwithstate),
        LONG_TO_UP(R.anim.long_toup),
        LONG_TO_UP_WITH_FADE_OUT(R.anim.long_toup_with_fadein),
        LONG_TO_UP_WITH_FADE_OUT_WITH_STATE(R.anim.long_toupwithfadewithstate),
        LONG_TO_DOWN(R.anim.long_todown),
        LONG_TO_DOWN_WITH_FADE_IN(R.anim.long_todown_with_fade),
        LONG_TO_DOWN_WITH_FADE_IN_WITH_STATE(R.anim.long_todownwithfadewithstate),
        LONG_TO_RIGHT(R.anim.long_toright),
        LONG_GO_OUT_FROM_RIGHT(R.anim.long_outtoright),
        LONG_TO_LEFT(R.anim.long_toleft),
        LONG_GO_OUT_FROM_LEFT(R.anim.long_outtoleft),
        LONG_GO_OUT_FROM_LEFT_WITH_STATE(R.anim.long_outleftwithsatae),
        LONG_GO_OUT_FROM_RIGHT_WITH_STATE(R.anim.long_outrightwithstate),
        LONG_ZERO_TO_ORIGINAL(R.anim.long_zero_to_orignal),
        LONG_ORIGINAL_TO_ZERO(R.anim.long_orignal_to_zero),
        LONG_ORIGINAL_TO_ZERO_WITH_STATE(R.anim.long_orignal_to_zero_with_state),
        LONG_ROTATE_90(R.anim.long_rotate90),
        LONG_ROTATE_90_WITH_STATE(R.anim.long_rotate90withstate),
        LONG_ROTATE_90_FROM_TOP(R.anim.long_rotate90fromtop),
        LONG_ROTATE_90_FROM_BOTTOM(R.anim.long_rotate90frombottom),
        LONG_ROTATE_180(R.anim.long_rotate180),
        LONG_ROTATE_180_FROM_TOP(R.anim.long_rotate180fromtop),
        LONG_ROTATE_180_FROM_BOTTOM(R.anim.long_rotate180frombottom),
        LONG_ROTATE_270(R.anim.long_rotate270),
        LONG_ROTATE_270_FROM_TOP(R.anim.long_rotate270fromtop),
        LONG_ROTATE_270_FROM_BOTTOM(R.anim.long_rotate270frombottom),
        LONG_ROTATE_360(R.anim.long_rotate360),
        LONG_ROTATE_360_FROM_TOP(R.anim.long_rotate360fromtop),
        LONG_ROTATE_360_FROM_BOTTOM(R.anim.long_rotate360frombottom),

        SHORT_FADE_IN(R.anim.short_fadein),
        SHORT_FADE_IN_WITH_LAST_STATE(R.anim.short_fadein_with_last_state),
        SHORT_FADE_OUT(R.anim.short_fadeout),
        SHORT_FADE_OUT_WITH_LAST_STATE(R.anim.short_fadeoutwithstate),
        SHORT_TO_UP(R.anim.short_toup),
        SHORT_TO_UP_WITH_FADE_OUT(R.anim.short_toup_with_fadein),
        SHORT_TO_UP_WITH_FADE_OUT_WITH_STATE(R.anim.short_toupwithfadewithstate),
        SHORT_TO_DOWN(R.anim.short_todown),
        SHORT_TO_DOWN_WITH_FADE_IN(R.anim.short_todown_with_fade),
        SHORT_TO_DOWN_WITH_FADE_IN_WITH_STATE(R.anim.short_todownwithfadewithstate),
        SHORT_TO_RIGHT(R.anim.short_toright),
        SHORT_GO_OUT_FROM_RIGHT(R.anim.short_outtoright),
        SHORT_TO_LEFT(R.anim.short_toleft),
        SHORT_GO_OUT_FROM_LEFT(R.anim.short_outtoleft),
        SHORT_GO_OUT_FROM_LEFT_WITH_STATE(R.anim.short_outleftwithsatae),
        SHORT_GO_OUT_FROM_RIGHT_WITH_STATE(R.anim.short_outrightwithstate),
        SHORT_ZERO_TO_ORIGINAL(R.anim.short_zero_to_orignal),
        SHORT_ORIGINAL_TO_ZERO(R.anim.short_orignal_to_zero),
        SHORT_ORIGINAL_TO_ZERO_WITH_STATE(R.anim.short_orignal_to_zero_with_state),
        SHORT_ROTATE_90(R.anim.short_rotate90),
        SHORT_ROTATE_90_WITH_STATE(R.anim.short_rotate90withstate),
        SHORT_ROTATE_90_FROM_TOP(R.anim.short_rotate90fromtop),
        SHORT_ROTATE_90_FROM_BOTTOM(R.anim.short_rotate90frombottom),
        SHORT_ROTATE_180(R.anim.short_rotate180),
        SHORT_ROTATE_180_FROM_TOP(R.anim.short_rotate180fromtop),
        SHORT_ROTATE_180_FROM_BOTTOM(R.anim.short_rotate180frombottom),
        SHORT_ROTATE_270(R.anim.short_rotate270),
        SHORT_ROTATE_270_FROM_TOP(R.anim.short_rotate270fromtop),
        SHORT_ROTATE_270_FROM_BOTTOM(R.anim.short_rotate270frombottom),
        SHORT_ROTATE_360(R.anim.short_rotate360),
        SHORT_ROTATE_360_FROM_TOP(R.anim.short_rotate360fromtop),
        SHORT_ROTATE_360_FROM_BOTTOM(R.anim.short_rotate360frombottom),
        CLOCK(R.anim.clock),
        CLOCK_INFINITE(R.anim.clockinfinate),
        VIBRATE(R.anim.vibrate);

        fun getAnimation(context: Context): Animation {
            return AnimationUtils.loadAnimation(context, resourceId)
        }
    }

    fun loadAnimation(animationType: AnimationType): Animation {
        return animationType.getAnimation(context)
    }

    fun startAnimation(view: View, animationType: AnimationType) {
        val animation = loadAnimation(animationType)
        view.startAnimation(animation)
    }

    fun chain(AnimatatonType: AnimationType, nextani: () -> Unit): AnimationKC {
        val ana = AnimationKC(context)
        val lodede = ana.loadAnimation(AnimatatonType)
        lodede.setAnimationListener(/* listener = */ object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
                nextani()
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }


        })
        v.startAnimation(lodede)
        return ana
    }

}