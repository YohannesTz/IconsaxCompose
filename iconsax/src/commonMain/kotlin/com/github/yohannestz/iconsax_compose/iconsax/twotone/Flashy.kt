package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Flashy: ImageVector
    get() {
        val current = _flashy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Flashy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 9.32f, y = 13.28f)
                horizontalLineToRelative(dx = 3.09f)
                verticalLineToRelative(dy = 7.2f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.02f, dy1 = 0.76f)
                lineToRelative(dx = 7.57f, dy = -8.6f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.87f, dy1 = -1.92f)
                horizontalLineToRelative(dx = -3.09f)
                verticalLineToRelative(dy = -7.2f)
                arcToRelative(a = 1.15f, b = 1.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.02f, dy1 = -0.76f)
                lineToRelative(dx = -7.57f, dy = 8.6f)
                arcToRelative(a = 1.16f, b = 1.16f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.87f, dy1 = 1.92f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.5f, y = 4.0f)
                horizontalLineToRelative(dx = -7.0f)
                moveToRelative(dx = 6.0f, dy = 16.0f)
                horizontalLineToRelative(dx = -6.0f)
                moveToRelative(dx = 3.0f, dy = -8.0f)
                horizontalLineToRelative(dx = -3.0f)
            }
        }.build().also { _flashy = it }
    }

@Suppress("ObjectPropertyName")
private var _flashy: ImageVector? = null
