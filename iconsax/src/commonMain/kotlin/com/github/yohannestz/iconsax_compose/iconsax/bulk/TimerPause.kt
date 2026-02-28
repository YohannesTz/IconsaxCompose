package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimerPause: ImageVector
    get() {
        val current = _timerPause
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TimerPause",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 13.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 13.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 7.59f, x2 = 12.75f, y2 = 8.0f)
                verticalLineToRelative(dy = 5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 13.75f)
                moveToRelative(dx = 2.89f, dy = -10.3f)
                horizontalLineTo(x = 9.11f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.45f)
                horizontalLineToRelative(dx = 5.78f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.45f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 15.0f, y = 19.97f)
                verticalLineToRelative(dy = -2.94f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.27f, dx2 = 0.76f, dy2 = -2.03f, dx3 = 2.03f, dy3 = -2.03f)
                horizontalLineToRelative(dx = 2.94f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.53f, dy1 = 0.06f)
                arcToRelative(a = 8.68f, b = 8.68f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -17.17f, dy1 = -1.73f)
                arcToRelative(a = 8.68f, b = 8.68f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 12.08f, dy1 = 7.97f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 15.0f, y1 = 19.97f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.97f, y = 15.0f)
                horizontalLineToRelative(dx = -2.93f)
                curveTo(x1 = 15.76f, y1 = 15.0f, x2 = 15.0f, y2 = 15.76f, x3 = 15.0f, y3 = 17.03f)
                verticalLineToRelative(dy = 2.93f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.27f, dx2 = 0.76f, dy2 = 2.03f, dx3 = 2.03f, dy3 = 2.03f)
                horizontalLineToRelative(dx = 2.93f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 2.03f, dy2 = -0.76f, dx3 = 2.03f, dy3 = -2.03f)
                verticalLineToRelative(dy = -2.93f)
                curveTo(x1 = 22.0f, y1 = 15.76f, x2 = 21.24f, y2 = 15.0f, x3 = 19.97f, y3 = 15.0f)
                moveToRelative(dx = -2.05f, dy = 5.06f)
                arcToRelative(a = 0.58f, b = 0.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.16f, dy1 = 0.0f)
                verticalLineToRelative(dy = -3.11f)
                arcToRelative(a = 0.58f, b = 0.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.16f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 2.33f, dy = 0.0f)
                arcToRelative(a = 0.58f, b = 0.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.16f, dy1 = 0.0f)
                verticalLineToRelative(dy = -3.11f)
                arcToRelative(a = 0.58f, b = 0.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.16f, dy1 = 0.0f)
                close()
            }
        }.build().also { _timerPause = it }
    }

@Suppress("ObjectPropertyName")
private var _timerPause: ImageVector? = null
