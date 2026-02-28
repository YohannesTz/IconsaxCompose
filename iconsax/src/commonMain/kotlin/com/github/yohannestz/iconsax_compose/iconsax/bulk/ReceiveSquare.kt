package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiveSquare: ImageVector
    get() {
        val current = _receiveSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiveSquare",
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
                moveTo(x = 16.19f, y = 2.0f)
                horizontalLineTo(x = 7.82f)
                curveTo(x1 = 4.17f, y1 = 2.0f, x2 = 2.0f, y2 = 4.17f, x3 = 2.0f, y3 = 7.81f)
                verticalLineToRelative(dy = 8.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.64f, dx2 = 2.17f, dy2 = 5.81f, dx3 = 5.81f, dy3 = 5.81f)
                horizontalLineToRelative(dx = 8.37f)
                curveToRelative(dx1 = 3.64f, dy1 = 0.0f, dx2 = 5.81f, dy2 = -2.17f, dx3 = 5.81f, dy3 = -5.81f)
                verticalLineTo(y = 7.81f)
                curveTo(x1 = 22.0f, y1 = 4.17f, x2 = 19.83f, y2 = 2.0f, x3 = 16.19f, y3 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.47f, y = 15.04f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 15.26f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.53f, dy1 = -0.22f)
                lineToRelative(dx = 3.0f, dy = -3.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineToRelative(dx = -1.72f, dy = 1.72f)
                verticalLineTo(y = 6.51f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = -0.34f, dy2 = -0.75f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = 0.34f, dx2 = -0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 6.19f)
                lineToRelative(dx = -1.72f, dy = -1.72f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                close()
                moveToRelative(dx = 7.24f, dy = 1.24f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.95f, dy1 = -0.47f)
                arcToRelative(a = 18.3f, b = 18.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -11.53f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.95f, dy1 = 0.47f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.47f, dy1 = 0.95f)
                arcToRelative(a = 19.7f, b = 19.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 12.48f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = -0.95f)
            }
        }.build().also { _receiveSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _receiveSquare: ImageVector? = null
