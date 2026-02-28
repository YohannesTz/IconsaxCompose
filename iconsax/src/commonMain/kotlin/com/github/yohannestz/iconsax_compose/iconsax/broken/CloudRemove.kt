package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudRemove: ImageVector
    get() {
        val current = _cloudRemove
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudRemove",
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
                moveTo(x = 5.54f, y = 11.12f)
                curveToRelative(dx1 = -4.68f, dy1 = 0.33f, dx2 = -4.68f, dy2 = 7.14f, dx3 = 0.0f, dy3 = 7.47f)
                horizontalLineToRelative(dx = 1.92f)
                moveTo(x = 17.47f, y = 8.0f)
                curveToRelative(dx1 = 4.33f, dy1 = 0.55f, dx2 = 6.08f, dy2 = 6.32f, dx3 = 2.8f, dy3 = 9.19f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.64f, dy1 = 1.4f)
                horizontalLineToRelative(dx = -0.09f)
                moveTo(x = 5.59f, y = 11.12f)
                curveTo(x1 = 3.06f, y1 = 4.09f, x2 = 10.92f, y2 = 0.38f, x3 = 15.13f, y3 = 3.7f)
                moveTo(x = 12.97f, y = 17.6f)
                lineToRelative(dx = -2.11f, dy = -2.11f)
                moveToRelative(dx = 2.09f, dy = 0.02f)
                lineToRelative(dx = -2.12f, dy = 2.12f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.0f, y = 16.53f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 2.57f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.53f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.54f, dy1 = -2.94f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 17.0f, y1 = 16.53f)
            }
        }.build().also { _cloudRemove = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudRemove: ImageVector? = null
