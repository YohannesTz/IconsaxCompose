package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WristClock: ImageVector
    get() {
        val current = _wristClock
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WristClock",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 9.66f)
                verticalLineToRelative(dy = 2.79f)
                lineToRelative(dx = 1.4f, dy = 1.4f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.96f, y = 7.89f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 5.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.5f, dy1 = 6.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.5f, dy1 = 5.13f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 6.44f, b = 6.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.95f, dy1 = 0.02f)
                horizontalLineTo(x = 8.03f)
                arcTo(horizontalEllipseRadius = 6.5f, verticalEllipseRadius = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.5f, y1 = 12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.03f, y = 17.15f)
                close()
                arcToRelative(a = 6.44f, b = 6.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.95f, dy1 = -0.02f)
                horizontalLineTo(x = 16.0f)
                lineToRelative(dx = -0.51f, dy = 2.47f)
                curveTo(x1 = 15.0f, y1 = 21.5f, x2 = 13.9f, y2 = 22.0f, x3 = 12.55f, y3 = 22.0f)
                horizontalLineToRelative(dx = -1.09f)
                curveToRelative(dx1 = -1.35f, dy1 = 0.0f, dx2 = -2.46f, dy2 = -0.5f, dx3 = -2.94f, dy3 = -2.41f)
                close()
                moveToRelative(dx = 0.0f, dy = -10.3f)
                close()
                arcToRelative(a = 6.44f, b = 6.44f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.95f, dy1 = 0.02f)
                horizontalLineTo(x = 16.0f)
                lineTo(x = 15.49f, y = 4.4f)
                curveTo(x1 = 15.0f, y1 = 2.5f, x2 = 13.9f, y2 = 2.0f, x3 = 12.55f, y3 = 2.0f)
                horizontalLineToRelative(dx = -1.09f)
                curveTo(x1 = 10.11f, y1 = 2.0f, x2 = 9.0f, y2 = 2.5f, x3 = 8.52f, y3 = 4.41f)
                close()
            }
        }.build().also { _wristClock = it }
    }

@Suppress("ObjectPropertyName")
private var _wristClock: ImageVector? = null
