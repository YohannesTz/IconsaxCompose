package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimerPause: ImageVector
    get() {
        val current = _timerPause
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TimerPause",
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
                moveTo(x = 8.01f, y = 5.46f)
                arcToRelative(a = 8.77f, b = 8.77f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 12.74f, dy1 = 7.79f)
                moveTo(x = 12.0f, y = 22.0f)
                arcTo(horizontalEllipseRadius = 8.75f, verticalEllipseRadius = 8.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.01f, y1 = 7.99f)
                moveTo(x = 12.0f, y = 8.0f)
                verticalLineToRelative(dy = 5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.0f, y = 2.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 19.0f, y = 17.0f)
                verticalLineToRelative(dy = 4.0f)
                moveToRelative(dx = -3.0f, dy = -4.0f)
                verticalLineToRelative(dy = 4.0f)
            }
        }.build().also { _timerPause = it }
    }

@Suppress("ObjectPropertyName")
private var _timerPause: ImageVector? = null
