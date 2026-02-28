package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SmartHome: ImageVector
    get() {
        val current = _smartHome
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SmartHome",
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
                moveTo(x = 21.97f, y = 11.28f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.11f, dy1 = -2.91f)
                lineToRelative(dx = -6.93f, dy = -5.54f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.86f, dy1 = -0.01f)
                lineTo(x = 3.14f, y = 8.37f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.11f, dy1 = 2.91f)
                lineToRelative(dx = 0.28f, dy = 1.68f)
                moveToRelative(dx = 9.09f, dy = 8.85f)
                horizontalLineToRelative(dx = 6.2f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.04f, dy1 = -2.57f)
                lineToRelative(dx = 0.63f, dy = -3.74f)
                moveTo(x = 2.0f, y = 19.0f)
                arcToRelative(a = 2.9f, b = 2.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = 3.0f)
                moveToRelative(dx = -3.0f, dy = -6.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.5f, dy1 = 0.18f)
                moveTo(x = 8.0f, y = 22.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.37f, dy1 = -2.12f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.19f, dy1 = -1.99f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 2.0f, y = 22.0f)
                close()
            }
        }.build().also { _smartHome = it }
    }

@Suppress("ObjectPropertyName")
private var _smartHome: ImageVector? = null
