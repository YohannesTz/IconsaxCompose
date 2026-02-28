package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicrophoneTwo: ImageVector
    get() {
        val current = _microphoneTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MicrophoneTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 15.5f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.0f, dy1 = -4.0f)
                verticalLineTo(y = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -8.0f, dy1 = 0.0f)
                verticalLineToRelative(dy = 5.5f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.0f, dy1 = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.35f, y = 9.65f)
                verticalLineToRelative(dy = 1.7f)
                arcToRelative(a = 7.66f, b = 7.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 15.3f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.7f)
                moveToRelative(dx = -9.04f, dy = -3.22f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.78f, dy1 = 0.0f)
                moveTo(x = 11.2f, y = 8.55f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.61f, dy1 = 0.0f)
                moveTo(x = 12.0f, y = 19.0f)
                verticalLineToRelative(dy = 3.0f)
            }
        }.build().also { _microphoneTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _microphoneTwo: ImageVector? = null
