package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bitcoin: ImageVector
    get() {
        val current = _bitcoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bitcoin",
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
                moveTo(x = 16.49f, y = 11.61f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.62f, dy1 = -1.78f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.92f, dy1 = -2.92f)
                horizontalLineToRelative(dx = -0.88f)
                verticalLineTo(y = 5.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 1.42f)
                horizontalLineTo(x = 10.6f)
                verticalLineTo(y = 5.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.12f, y1 = 5.09f, x2 = 9.12f, y2 = 5.5f)
                verticalLineToRelative(dy = 1.42f)
                horizontalLineTo(x = 7.05f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 0.98f)
                verticalLineToRelative(dy = 7.16f)
                horizontalLineTo(x = 7.05f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = 0.75f, dx2 = 0.75f, dy2 = 0.75f)
                horizontalLineToRelative(dx = 2.06f)
                verticalLineToRelative(dy = 1.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -1.42f)
                horizontalLineToRelative(dx = 1.21f)
                verticalLineToRelative(dy = 1.42f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = 0.34f, dy2 = 0.75f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = -0.34f, dx2 = 0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -1.42f)
                horizontalLineToRelative(dx = 1.65f)
                curveToRelative(dx1 = 1.78f, dy1 = 0.0f, dx2 = 3.23f, dy2 = -1.31f, dx3 = 3.23f, dy3 = -2.92f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.1f, dx2 = -0.7f, dy2 = -2.06f, dx3 = -1.71f, dy3 = -2.55f)
                moveToRelative(dx = -5.65f, dy = -3.19f)
                horizontalLineToRelative(dx = 3.36f)
                curveToRelative(dx1 = 0.8f, dy1 = 0.0f, dx2 = 1.42f, dy2 = 0.76f, dx3 = 1.42f, dy3 = 1.42f)
                arcToRelative(a = 1.43f, b = 1.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.42f, dy1 = 1.42f)
                horizontalLineTo(x = 9.53f)
                verticalLineTo(y = 8.42f)
                close()
                moveToRelative(dx = 4.13f, dy = 7.16f)
                horizontalLineTo(x = 9.53f)
                verticalLineToRelative(dy = -2.83f)
                horizontalLineToRelative(dx = 5.44f)
                curveToRelative(dx1 = 0.95f, dy1 = 0.0f, dx2 = 1.73f, dy2 = 0.64f, dx3 = 1.73f, dy3 = 1.42f)
                reflectiveCurveToRelative(dx1 = -0.78f, dy1 = 1.41f, dx2 = -1.73f, dy2 = 1.41f)
            }
        }.build().also { _bitcoin = it }
    }

@Suppress("ObjectPropertyName")
private var _bitcoin: ImageVector? = null
