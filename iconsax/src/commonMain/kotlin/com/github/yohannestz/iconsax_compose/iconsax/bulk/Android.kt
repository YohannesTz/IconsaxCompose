package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Android: ImageVector
    get() {
        val current = _android
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Android",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.0f, y = 18.0f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.45f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.45f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -3.0f)
                close()
                moveToRelative(dx = 4.0f, dy = 0.0f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.45f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.45f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.0f, y = 11.0f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = 2.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = -2.0f)
                verticalLineToRelative(dy = -5.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.0f, y = 11.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.45f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.45f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                moveToRelative(dx = 16.0f, dy = 0.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.55f, dx2 = -0.45f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.45f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 9.6f, y = 7.6f)
                horizontalLineToRelative(dx = 4.8f)
                arcTo(horizontalEllipseRadius = 1.6f, verticalEllipseRadius = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.0f, y1 = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -8.0f, dy1 = 0.0f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.6f, dy1 = 1.6f)
            }
        }.build().also { _android = it }
    }

@Suppress("ObjectPropertyName")
private var _android: ImageVector? = null
