package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LockCircle: ImageVector
    get() {
        val current = _lockCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LockCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 7.75f)
                curveToRelative(dx1 = -1.89f, dy1 = 0.0f, dx2 = -2.25f, dy2 = 0.79f, dx3 = -2.25f, dy3 = 2.25f)
                verticalLineToRelative(dy = 0.62f)
                horizontalLineToRelative(dx = 4.5f)
                verticalLineTo(y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.46f, dx2 = -0.36f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                moveToRelative(dx = 0.0f, dy = 7.35f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -2.2f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.2f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 5.38f, dy = 12.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.2f, dx2 = -0.68f, dy2 = 2.88f, dx3 = -2.88f, dy3 = 2.88f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -2.2f, dy1 = 0.0f, dx2 = -2.88f, dy2 = -0.68f, dx3 = -2.88f, dy3 = -2.88f)
                verticalLineToRelative(dy = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = 0.41f, dy2 = -2.5f, dx3 = 1.63f, dy3 = -2.77f)
                verticalLineTo(y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.93f, dx2 = 0.0f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                reflectiveCurveToRelative(dx1 = 3.75f, dy1 = 2.82f, dx2 = 3.75f, dy2 = 3.75f)
                verticalLineToRelative(dy = 0.73f)
                curveToRelative(dx1 = 1.22f, dy1 = 0.27f, dx2 = 1.63f, dy2 = 1.06f, dx3 = 1.63f, dy3 = 2.77f)
                close()
            }
        }.build().also { _lockCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _lockCircle: ImageVector? = null
