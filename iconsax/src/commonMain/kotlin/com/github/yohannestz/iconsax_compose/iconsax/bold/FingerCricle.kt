package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FingerCricle: ImageVector
    get() {
        val current = _fingerCricle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FingerCricle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 7.95f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.25f, dy1 = 3.25f)
                verticalLineToRelative(dy = 1.6f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.6f)
                arcTo(horizontalEllipseRadius = 3.26f, verticalEllipseRadius = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 7.95f)
                moveToRelative(dx = 0.9f, dy = 5.29f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = -0.4f, dy2 = 0.9f, dx3 = -0.9f, dy3 = 0.9f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = -0.4f, dx2 = -0.9f, dy2 = -0.9f)
                verticalLineToRelative(dy = -2.47f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.49f, dx2 = 0.4f, dy2 = -0.9f, dx3 = 0.9f, dy3 = -0.9f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = 0.4f, dx2 = 0.9f, dy2 = 0.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveToRelative(dx = 4.75f, dy = 10.8f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -9.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.6f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.5f, dy1 = 0.0f)
                close()
            }
        }.build().also { _fingerCricle = it }
    }

@Suppress("ObjectPropertyName")
private var _fingerCricle: ImageVector? = null
