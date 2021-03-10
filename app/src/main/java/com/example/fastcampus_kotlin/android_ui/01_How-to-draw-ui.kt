package com.example.fastcampus_kotlin.android_ui

// 안드로이드에서 화면을 그리는 방법
// - xml을 이용한다.
// - xml이란?
//    - DSL Language (Domain Specific Language)
//    - 안드로이드 UI를 그리기 위해 특화된 언어이다.

// 핸드폰마다 화면 크기가 다 다른데, 어떻게 화면을 그려야할까?
// - 픽셀, dpi, dp 단위
// - 픽셀: 핸드폰 화면에서 빛이 나오는 전구 (가장 작은 단위)
// - dpi: dot per inch (ldpi -> 1인치에 120 픽셀 / mdpi -> 160 / hdpi -> 240 / xhdpi -> 320 / xxhdpi -> 480 / xxxhdpi -> 640
// - dpi(해상도)에 따라, 같은 픽셀의 객체도 크기가 달라 보일 수 있다!
// - dp: Density Independent Pixel (픽셀 독립적인 단위 -> 픽셀이라는 단위 대신, 이를 사용하면 해상도에 독립적으로 사용할 수 있다!)
// - 동일한 화면을 보여주기 위해서는, dp를 사용해야한다!