# Cartoonizer Android App

This is an Android  app with the White-box CartoonGAN TensorFlow Lite models , cycleGAN & styleGAN2.   

## TensorFlow Lite Model
There are three TensorFlow Lite Models included in the Android app and see the [ml](../ml/) README for details.  
Android Studio ML Model Binding was used to import these models into the Android project.

## Requirements
* Android Studio Preview Beta version - download [here](https://developer.android.com/studio/preview).
* Android device (with at least 3GB RAM) in developer mode with USB debugging enabled
* USB cable to connect an Android device to computer

## Build and run
* Clone the project repo:  
`git clone https://github.com/margaretmz/CartoonGAN-e2e-tflite-tutorial.git`  
* Open the Android code android/selfie2anime in Android Studio.
* Connect your Android device to computer then click on `"Run -> Run 'app'`.
* Once the app is launched on device, grant camera permission.
* sign up to launch the app.
* select the type you want (cycleGAN , styleGAN2 , cycleGAN).
* Take a selfie or a photo and wait to process the selfie. 
* You will then see a screen with both the selfie and anime image.

## features
1- cartoonGAN
2- Style transfer
3- CycleGAN
4- Augmanted reality
5- game

##cartoonGAN
The white-box CartooGAN TensorFlow Lite models (with metatdata) are available on TensorFlow Hub in three different formats:
Dynamic-range
Integer
float16

![image](https://user-images.githubusercontent.com/60838458/126578239-7c5c7afb-6044-4312-b5a0-192b53e6dc75.png)


paper: https://openaccess.thecvf.com/content_cvpr_2018/papers/Chen_CartoonGAN_Generative_Adversarial_CVPR_2018_paper.pdf
helpful resources: https://blog.tensorflow.org/2020/09/how-to-create-cartoonizer-with-tf-lite.html

