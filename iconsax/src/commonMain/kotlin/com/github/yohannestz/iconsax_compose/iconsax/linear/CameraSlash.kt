package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CameraSlash: ImageVector
    get() {
        val current = _cameraSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CameraSlash",
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
                moveTo(x = 6.0f, y = 10.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveTo(x = 6.76f, y = 22.0f)
                horizontalLineToRelative(dx = 10.48f)
                curveToRelative(dx1 = 2.76f, dy1 = 0.0f, dx2 = 3.86f, dy2 = -1.69f, dx3 = 3.99f, dy3 = -3.75f)
                lineToRelative(dx = 0.52f, dy = -8.26f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = -2.48f)
                moveTo(x = 18.0f, y = 6.0f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.45f, dy1 = -0.89f)
                lineToRelative(dx = -0.72f, dy = -1.45f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 13.15f, y1 = 2.0f)
                horizontalLineToRelative(dx = -2.29f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.69f, dy1 = 1.66f)
                lineTo(x = 7.45f, y = 5.11f)
                arcTo(horizontalEllipseRadius = 1.6f, verticalEllipseRadius = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.0f, y1 = 6.0f)
                arcToRelative(a = 3.75f, b = 3.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.75f, dy1 = 3.99f)
                lineToRelative(dx = 0.52f, dy = 8.26f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.67f, dy1 = 2.21f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.0f, y = 17.31f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.75f, dy1 = -4.29f)
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _cameraSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _cameraSlash: ImageVector? = null
