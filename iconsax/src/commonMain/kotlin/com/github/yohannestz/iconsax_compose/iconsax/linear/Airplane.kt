package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Airplane: ImageVector
    get() {
        val current = _airplane
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Airplane",
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
                moveTo(x = 9.03f, y = 21.69f)
                lineToRelative(dx = 2.33f, dy = -1.96f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.28f, dy1 = 0.0f)
                lineToRelative(dx = 2.33f, dy = 1.96f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.4f, dy1 = -0.58f)
                lineToRelative(dx = 0.44f, dy = -1.33f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.24f, dy1 = -1.03f)
                lineToRelative(dx = -2.27f, dy = -2.28f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = -0.71f)
                verticalLineToRelative(dy = -2.85f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.42f, dx2 = 0.31f, dy2 = -0.62f, dx3 = 0.7f, dy3 = -0.46f)
                lineToRelative(dx = 4.91f, dy = 2.12f)
                curveToRelative(dx1 = 0.77f, dy1 = 0.33f, dx2 = 1.4f, dy2 = -0.08f, dx3 = 1.4f, dy3 = -0.92f)
                verticalLineToRelative(dy = -1.29f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.12f, dy1 = -1.7f)
                lineTo(x = 14.3f, y = 8.25f)
                arcTo(horizontalEllipseRadius = 0.6f, verticalEllipseRadius = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 7.79f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.53f, dy1 = -2.48f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.95f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.99f, y1 = 4.8f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 0.6f, b = 0.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = 0.46f)
                lineToRelative(dx = -5.58f, dy = 2.41f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.12f, dy1 = 1.69f)
                verticalLineToRelative(dy = 1.29f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.84f, dx2 = 0.63f, dy2 = 1.25f, dx3 = 1.4f, dy3 = 0.92f)
                lineToRelative(dx = 4.91f, dy = -2.12f)
                curveToRelative(dx1 = 0.38f, dy1 = -0.17f, dx2 = 0.7f, dy2 = 0.04f, dx3 = 0.7f, dy3 = 0.46f)
                verticalLineToRelative(dy = 2.85f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.71f)
                lineToRelative(dx = -2.27f, dy = 2.28f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.24f, dy1 = 1.03f)
                lineToRelative(dx = 0.44f, dy = 1.33f)
                arcToRelative(a = 0.98f, b = 0.98f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.39f, dy1 = 0.58f)
            }
        }.build().also { _airplane = it }
    }

@Suppress("ObjectPropertyName")
private var _airplane: ImageVector? = null
