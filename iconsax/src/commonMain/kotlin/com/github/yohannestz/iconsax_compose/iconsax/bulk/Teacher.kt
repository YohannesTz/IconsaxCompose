package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Teacher: ImageVector
    get() {
        val current = _teacher
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Teacher",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.38f, y = 12.84f)
                verticalLineToRelative(dy = 4.93f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.18f, dy1 = 3.03f)
                lineToRelative(dx = -3.19f, dy = 1.06f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.02f, dy1 = 0.0f)
                lineTo(x = 7.8f, y = 20.8f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.18f, dy1 = -3.03f)
                lineToRelative(dx = 0.01f, dy = -4.93f)
                lineToRelative(dx = 4.42f, dy = 2.88f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.94f, dy1 = 0.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.98f, y = 6.46f)
                lineToRelative(dx = -5.99f, dy = -3.93f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.94f, dy1 = 0.0f)
                lineTo(x = 4.03f, y = 6.46f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.34f)
                lineToRelative(dx = 1.6f, dy = 1.04f)
                lineToRelative(dx = 4.42f, dy = 2.88f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.94f, dy1 = 0.0f)
                lineToRelative(dx = 4.39f, dy = -2.88f)
                lineToRelative(dx = 1.37f, dy = -0.9f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -4.92f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.27f, dy1 = -3.62f)
            }
        }.build().also { _teacher = it }
    }

@Suppress("ObjectPropertyName")
private var _teacher: ImageVector? = null
