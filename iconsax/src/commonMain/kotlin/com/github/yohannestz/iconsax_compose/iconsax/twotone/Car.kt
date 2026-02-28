package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Car: ImageVector
    get() {
        val current = _car
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Car",
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
                moveTo(x = 15.51f, y = 2.83f)
                horizontalLineTo(x = 8.49f)
                curveTo(x1 = 6.0f, y1 = 2.83f, x2 = 5.45f, y2 = 4.07f, x3 = 5.13f, y3 = 5.59f)
                lineTo(x = 4.0f, y = 10.99f)
                horizontalLineToRelative(dx = 16.0f)
                lineToRelative(dx = -1.13f, dy = -5.4f)
                curveTo(x1 = 18.55f, y1 = 4.07f, x2 = 18.0f, y2 = 2.83f, x3 = 15.51f, y3 = 2.83f)
                moveToRelative(dx = 6.48f, dy = 16.99f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.96f, y1 = 22.0f)
                horizontalLineToRelative(dx = -1.88f)
                curveToRelative(dx1 = -1.08f, dy1 = 0.0f, dx2 = -1.23f, dy2 = -0.46f, dx3 = -1.42f, dy3 = -1.03f)
                lineToRelative(dx = -0.2f, dy = -0.6f)
                curveTo(x1 = 16.18f, y1 = 19.55f, x2 = 16.0f, y2 = 19.0f, x3 = 14.56f, y3 = 19.0f)
                horizontalLineTo(x = 9.44f)
                curveToRelative(dx1 = -1.44f, dy1 = 0.0f, dx2 = -1.65f, dy2 = 0.62f, dx3 = -1.9f, dy3 = 1.37f)
                lineToRelative(dx = -0.2f, dy = 0.6f)
                curveTo(x1 = 7.14f, y1 = 21.54f, x2 = 7.0f, y2 = 22.0f, x3 = 5.92f, y3 = 22.0f)
                horizontalLineTo(x = 4.04f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 19.82f)
                lineToRelative(dx = 0.56f, dy = -6.09f)
                curveTo(x1 = 2.7f, y1 = 12.23f, x2 = 3.0f, y2 = 11.0f, x3 = 5.62f, y3 = 11.0f)
                horizontalLineToRelative(dx = 12.76f)
                curveToRelative(dx1 = 2.62f, dy1 = 0.0f, dx2 = 2.9f, dy2 = 1.23f, dx3 = 3.05f, dy3 = 2.73f)
                close()
                moveTo(x = 4.0f, y = 8.0f)
                horizontalLineTo(x = 3.0f)
                moveToRelative(dx = 18.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -1.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 3.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = -1.5f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveTo(x = 6.0f, y = 15.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveToRelative(dx = 6.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
        }.build().also { _car = it }
    }

@Suppress("ObjectPropertyName")
private var _car: ImageVector? = null
