package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudAdd: ImageVector
    get() {
        val current = _cloudAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CloudAdd",
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
                moveToRelative(dx = -1.87f, dy = -7.47f)
                curveTo(x1 = 2.38f, y1 = 2.19f, x2 = 15.92f, y2 = -1.38f, x3 = 17.47f, y3 = 8.0f)
                curveToRelative(dx1 = 4.33f, dy1 = 0.55f, dx2 = 6.08f, dy2 = 6.32f, dx3 = 2.8f, dy3 = 9.19f)
                arcToRelative(a = 5.3f, b = 5.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.64f, dy1 = 1.4f)
                horizontalLineToRelative(dx = -0.09f)
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
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.44f, y = 16.53f)
                lineToRelative(dx = 0.99f, dy = 0.99f)
                lineToRelative(dx = 2.13f, dy = -1.97f)
            }
        }.build().also { _cloudAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _cloudAdd: ImageVector? = null
