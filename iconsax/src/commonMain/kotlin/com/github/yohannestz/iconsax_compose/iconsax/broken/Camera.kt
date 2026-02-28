package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Camera: ImageVector
    get() {
        val current = _camera
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Camera",
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
                moveTo(x = 2.77f, y = 18.25f)
                curveTo(x1 = 2.89f, y1 = 20.31f, x2 = 4.0f, y2 = 22.0f, x3 = 6.76f, y3 = 22.0f)
                horizontalLineToRelative(dx = 10.48f)
                curveToRelative(dx1 = 2.76f, dy1 = 0.0f, dx2 = 3.86f, dy2 = -1.69f, dx3 = 3.99f, dy3 = -3.75f)
                lineToRelative(dx = 0.52f, dy = -8.26f)
                arcTo(horizontalEllipseRadius = 3.75f, verticalEllipseRadius = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.0f, y1 = 6.0f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.45f, dy1 = -0.89f)
                lineToRelative(dx = -0.72f, dy = -1.45f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.15f, y1 = 2.0f)
                horizontalLineToRelative(dx = -2.29f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.69f, dy1 = 1.66f)
                lineTo(x = 7.45f, y = 5.11f)
                arcTo(horizontalEllipseRadius = 1.6f, verticalEllipseRadius = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 6.0f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.75f, dy1 = 3.99f)
                lineToRelative(dx = 0.26f, dy = 4.07f)
                moveTo(x = 10.5f, y = 8.0f)
                horizontalLineToRelative(dx = 3.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 18.0f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.5f)
            }
        }.build().also { _camera = it }
    }

@Suppress("ObjectPropertyName")
private var _camera: ImageVector? = null
