package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeviceMessage: ImageVector
    get() {
        val current = _deviceMessage
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DeviceMessage",
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
                moveTo(x = 2.0f, y = 8.5f)
                curveTo(x1 = 2.0f, y1 = 5.35f, x2 = 3.8f, y2 = 4.0f, x3 = 6.5f, y3 = 4.0f)
                horizontalLineToRelative(dx = 2.7f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 5.25f)
                verticalLineToRelative(dy = 3.9f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.89f, dy1 = 2.36f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.36f, dy1 = 0.89f)
                verticalLineToRelative(dy = 1.39f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.01f, dy1 = 0.54f)
                lineToRelative(dx = 2.89f, dy = -1.93f)
                horizontalLineToRelative(dx = 2.6f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 20.0f, y1 = 12.2f)
                verticalLineToRelative(dy = 1.7f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.15f, dx2 = -1.8f, dy2 = 4.5f, dx3 = -4.5f, dy3 = 4.5f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -2.7f, dy1 = 0.0f, dx2 = -4.5f, dy2 = -1.35f, dx3 = -4.5f, dy3 = -4.5f)
                verticalLineToRelative(dy = -1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 9.15f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.49f, dx2 = -0.76f, dy2 = 2.61f, dx3 = -2.0f, dy3 = 3.05f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.25f, dy1 = 0.2f)
                horizontalLineToRelative(dx = -2.6f)
                lineToRelative(dx = -2.89f, dy = 1.93f)
                arcToRelative(a = 0.65f, b = 0.65f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = -0.54f)
                verticalLineTo(y = 12.4f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.36f, dy1 = -0.89f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.0f, y1 = 9.15f)
                verticalLineToRelative(dy = -3.9f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.2f, y1 = 4.0f)
                curveToRelative(dx1 = 0.44f, dy1 = -1.24f, dx2 = 1.56f, dy2 = -2.0f, dx3 = 3.05f, dy3 = -2.0f)
                horizontalLineToRelative(dx = 6.5f)
                curveTo(x1 = 20.7f, y1 = 2.0f, x2 = 22.0f, y2 = 3.3f, x3 = 22.0f, y3 = 5.25f)
                moveTo(x = 7.4f, y = 22.0f)
                horizontalLineToRelative(dx = 7.2f)
                moveTo(x = 11.0f, y = 18.4f)
                verticalLineTo(y = 22.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.5f, y = 7.25f)
                close()
                moveToRelative(dx = -2.8f, dy = 0.0f)
                close()
                moveToRelative(dx = -2.8f, dy = 0.0f)
                close()
            }
        }.build().also { _deviceMessage = it }
    }

@Suppress("ObjectPropertyName")
private var _deviceMessage: ImageVector? = null
