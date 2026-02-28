package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Educare: ImageVector
    get() {
        val current = _educare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Educare",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.52f, y = 5.15f)
                lineToRelative(dx = 2.67f, dy = 2.67f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.62f, dy1 = 0.0f)
                lineToRelative(dx = 2.67f, dy = -2.67f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.81f, dy1 = -1.95f)
                horizontalLineTo(x = 9.32f)
                curveTo(x1 = 8.31f, y1 = 3.19f, x2 = 7.8f, y2 = 4.43f, x3 = 8.52f, y3 = 5.15f)
                moveToRelative(dx = 0.0f, dy = 13.7f)
                lineToRelative(dx = 2.67f, dy = -2.67f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.62f, dy1 = 0.0f)
                lineToRelative(dx = 2.67f, dy = 2.67f)
                arcToRelative(a = 1.14f, b = 1.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.81f, dy1 = 1.95f)
                horizontalLineTo(x = 9.32f)
                curveToRelative(dx1 = -1.01f, dy1 = 0.01f, dx2 = -1.52f, dy2 = -1.23f, dx3 = -0.8f, dy3 = -1.95f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.16f, y = 11.45f)
                lineToRelative(dx = 2.21f, dy = -3.48f)
                arcTo(horizontalEllipseRadius = 1.02f, verticalEllipseRadius = 1.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.95f, y1 = 7.8f)
                lineToRelative(dx = 3.48f, dy = 3.48f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.44f)
                lineTo(x = 5.95f, y = 16.2f)
                arcToRelative(a = 1.02f, b = 1.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.58f, dy1 = -0.17f)
                lineToRelative(dx = -2.21f, dy = -3.48f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.1f)
                moveToRelative(dx = 19.68f, dy = 0.0f)
                lineToRelative(dx = -2.21f, dy = -3.48f)
                arcToRelative(a = 1.02f, b = 1.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.58f, dy1 = -0.17f)
                lineToRelative(dx = -3.48f, dy = 3.48f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.44f)
                lineToRelative(dx = 3.48f, dy = 3.48f)
                arcToRelative(a = 1.02f, b = 1.02f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.58f, dy1 = -0.17f)
                lineToRelative(dx = 2.21f, dy = -3.48f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.1f)
            }
        }.build().also { _educare = it }
    }

@Suppress("ObjectPropertyName")
private var _educare: ImageVector? = null
