package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 9.87f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = 0.9f)
                verticalLineToRelative(dy = 2.47f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = 0.4f, dy2 = 0.9f, dx3 = 0.9f, dy3 = 0.9f)
                reflectiveCurveToRelative(dx1 = 0.9f, dy1 = -0.4f, dx2 = 0.9f, dy2 = -0.9f)
                verticalLineToRelative(dy = -2.47f)
                arcToRelative(a = 0.9f, b = 0.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = -0.9f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 17.55f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.75f, dy1 = -4.75f)
                verticalLineToRelative(dy = -1.6f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = 1.6f)
                arcTo(horizontalEllipseRadius = 4.75f, verticalEllipseRadius = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 17.55f)
                moveToRelative(dx = 0.0f, dy = -9.6f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.25f, dy1 = 3.25f)
                verticalLineToRelative(dy = 1.6f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 6.5f, dy1 = 0.0f)
                verticalLineToRelative(dy = -1.6f)
                arcTo(horizontalEllipseRadius = 3.26f, verticalEllipseRadius = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 7.95f)
            }
        }.build().also { _fingerCricle = it }
    }

@Suppress("ObjectPropertyName")
private var _fingerCricle: ImageVector? = null
