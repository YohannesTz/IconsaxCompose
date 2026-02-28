package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Wifi: ImageVector
    get() {
        val current = _wifi
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Wifi",
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
                moveTo(x = 16.31f, y = 10.21f)
                quadToRelative(dx1 = 1.46f, dy1 = 0.6f, dx2 = 2.78f, dy2 = 1.62f)
                moveToRelative(dx = -14.18f, dy = 0.0f)
                curveToRelative(dx1 = 2.44f, dy1 = -1.88f, dx2 = 5.3f, dy2 = -2.7f, dx3 = 8.1f, dy3 = -2.43f)
                moveTo(x = 8.36f, y = 5.28f)
                arcTo(horizontalEllipseRadius = 16.0f, verticalEllipseRadius = 16.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 8.36f)
                moveToRelative(dx = -20.0f, dy = 0.0f)
                arcToRelative(a = 18.0f, b = 18.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.93f, dy1 = -1.84f)
                moveToRelative(dx = 1.86f, dy = 8.97f)
                arcToRelative(a = 8.3f, b = 8.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 10.41f, dy1 = 0.0f)
                moveToRelative(dx = -7.8f, dy = 3.66f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.21f, dy1 = 0.0f)
            }
        }.build().also { _wifi = it }
    }

@Suppress("ObjectPropertyName")
private var _wifi: ImageVector? = null
