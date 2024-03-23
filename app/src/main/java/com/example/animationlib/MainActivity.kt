package com.example.animationlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageView
import com.example.animation.LIB.AnimationKC
import com.example.animation.LIB.TranslateToArrayOfPosition


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView: ImageView = findViewById(R.id.imageView)
        val animationKC = AnimationKC(this)

        val Ani=AnimationKC(this)
        Ani.v=imageView

     imageView.setOnClickListener {


       Ani.chain(AnimationKC.AnimationType.LONG_ZERO_TO_ORIGINAL){
           Ani.chain(AnimationKC.AnimationType.CLOCK){
               Ani.chain(AnimationKC.AnimationType.VIBRATE){
                   Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_TOP){
                       Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_BOTTOM){
                           Ani.chain(AnimationKC.AnimationType.FADE_IN){
                               Ani.chain(AnimationKC.AnimationType.FADE_OUT){
                                   Ani.chain(AnimationKC.AnimationType.CLOCK){
                                       Ani.chain(AnimationKC.AnimationType.VIBRATE){
                                           Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_TOP){
                                               Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_BOTTOM){
                                                   Ani.chain(AnimationKC.AnimationType.FADE_IN){
                                                       Ani.chain(AnimationKC.AnimationType.FADE_OUT){
                                                           Ani.chain(AnimationKC.AnimationType.CLOCK){
                                                               Ani.chain(AnimationKC.AnimationType.VIBRATE){
                                                                   Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_TOP){
                                                                       Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_BOTTOM){
                                                                           Ani.chain(AnimationKC.AnimationType.FADE_IN){
                                                                               Ani.chain(AnimationKC.AnimationType.FADE_OUT){
                                                                                   Ani.chain(AnimationKC.AnimationType.CLOCK){
                                                                                       Ani.chain(AnimationKC.AnimationType.VIBRATE){
                                                                                           Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_TOP){
                                                                                               Ani.chain(AnimationKC.AnimationType.ROTATE_180_FROM_BOTTOM){
                                                                                                   Ani.chain(AnimationKC.AnimationType.FADE_IN){
                                                                                                       Ani.chain(AnimationKC.AnimationType.FADE_OUT){

                                                                                                       }

                                                                                                   }
                                                                                               }
                                                                                           }
                                                                                       }
                                                                                   }
                                                                               }

                                                                           }
                                                                       }
                                                                   }
                                                               }
                                                           }
                                                       }

                                                   }
                                               }
                                           }
                                       }
                                   }
                               }

                           }
                       }
                   }
               }
           }
       }





     }


    }



}

