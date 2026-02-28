package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Routing: ImageVector
    get() {
        val current = _routing
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Routing",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.07f, y = 4.6f)
                curveToRelative(dx1 = 0.8f, dy1 = -3.46f, dx2 = 6.01f, dy2 = -3.46f, dx3 = 6.8f, dy3 = 0.0f)
                curveToRelative(dx1 = 0.47f, dy1 = 2.03f, dx2 = -0.82f, dy2 = 3.75f, dx3 = -1.94f, dy3 = 4.82f)
                arcToRelative(a = 2.14f, b = 2.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.93f, dy1 = 0.0f)
                curveTo(x1 = 2.89f, y1 = 8.35f, x2 = 1.6f, y2 = 6.63f, x3 = 2.07f, y3 = 4.6f)
                close()
                moveToRelative(dx = 13.0f, dy = 12.0f)
                curveToRelative(dx1 = 0.8f, dy1 = -3.46f, dx2 = 6.04f, dy2 = -3.46f, dx3 = 6.84f, dy3 = 0.0f)
                curveToRelative(dx1 = 0.47f, dy1 = 2.03f, dx2 = -0.82f, dy2 = 3.75f, dx3 = -1.95f, dy3 = 4.82f)
                arcToRelative(a = 2.15f, b = 2.15f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.94f, dy1 = 0.0f)
                curveToRelative(dx1 = -1.13f, dy1 = -1.07f, dx2 = -2.42f, dy2 = -2.79f, dx3 = -1.95f, dy3 = -4.82f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 5.0f)
                horizontalLineToRelative(dx = 2.68f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 8.51f)
                lineTo(x = 8.01f, y = 15.5f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.32f, y1 = 19.0f)
                horizontalLineTo(x = 12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 5.49f, y = 5.5f)
                close()
                moveToRelative(dx = 13.0f, dy = 12.0f)
                close()
            }
        }.build().also { _routing = it }
    }

@Suppress("ObjectPropertyName")
private var _routing: ImageVector? = null
