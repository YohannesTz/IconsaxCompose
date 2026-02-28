package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WindTwo: ImageVector
    get() {
        val current = _windTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WindTwo",
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
                moveTo(x = 9.5f, y = 11.6f)
                curveToRelative(dx1 = 1.54f, dy1 = 0.92f, dx2 = 3.46f, dy2 = 0.92f, dx3 = 5.0f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 3.46f, dy1 = -0.92f, dx2 = 5.0f, dy2 = 0.0f)
                lineToRelative(dx = 2.5f, dy = 1.5f)
                moveToRelative(dx = -20.0f, dy = 0.0f)
                lineToRelative(dx = 2.5f, dy = -1.5f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.47f, dy1 = -0.58f)
                moveTo(x = 2.0f, y = 3.9f)
                lineToRelative(dx = 2.5f, dy = 1.5f)
                curveToRelative(dx1 = 1.54f, dy1 = 0.92f, dx2 = 3.46f, dy2 = 0.92f, dx3 = 5.0f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 3.46f, dy1 = -0.92f, dx2 = 5.0f, dy2 = 0.0f)
                reflectiveCurveToRelative(dx1 = 3.46f, dy1 = 0.92f, dx2 = 5.0f, dy2 = 0.0f)
                lineTo(x = 22.0f, y = 3.9f)
                moveTo(x = 2.0f, y = 20.1f)
                lineToRelative(dx = 2.5f, dy = -1.5f)
                curveToRelative(dx1 = 1.54f, dy1 = -0.92f, dx2 = 3.46f, dy2 = -0.92f, dx3 = 5.0f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 3.46f, dy1 = 0.92f, dx2 = 5.0f, dy2 = 0.0f)
                reflectiveCurveToRelative(dx1 = 3.46f, dy1 = -0.92f, dx2 = 5.0f, dy2 = 0.0f)
                lineToRelative(dx = 2.5f, dy = 1.5f)
            }
        }.build().also { _windTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _windTwo: ImageVector? = null
