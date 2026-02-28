package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushTwo: ImageVector
    get() {
        val current = _brushTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushTwo",
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
                moveTo(x = 21.81f, y = 3.94f)
                arcToRelative(a = 34.0f, b = 34.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -8.63f, dy1 = 11.65f)
                lineToRelative(dx = -1.97f, dy = 1.58f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.78f, dy1 = 0.45f)
                arcToRelative(a = 3.92f, b = 3.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -2.86f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.36f, dy1 = -1.19f)
                quadToRelative(dx1 = -0.3f, dy1 = -0.03f, dx2 = -0.6f, dy2 = -0.01f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.49f, dy1 = -0.84f)
                lineToRelative(dx = 1.56f, dy = -1.97f)
                curveToRelative(dx1 = 2.58f, dy1 = -3.23f, dx2 = 7.82f, dy2 = -7.11f, dx3 = 11.65f, dy3 = -8.64f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.52f, dy1 = 0.31f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.32f, dy1 = 1.52f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.43f, y = 17.62f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.1f, dx2 = -0.42f, dy2 = 2.15f, dx3 = -1.21f, dy3 = 2.95f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.43f, dy1 = 1.16f)
                lineTo(x = 4.33f, y = 22.0f)
                arcTo(horizontalEllipseRadius = 2.1f, verticalEllipseRadius = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 19.65f)
                lineToRelative(dx = 0.27f, dy = -2.46f)
                arcToRelative(a = 4.1f, b = 4.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.01f, dy1 = -3.63f)
                quadToRelative(dx1 = 0.3f, dy1 = -0.01f, dx2 = 0.6f, dy2 = 0.01f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.36f, dy1 = 1.19f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.16f, dy1 = 2.29f)
                close()
                moveToRelative(dx = 3.81f, dy = -3.15f)
                arcToRelative(a = 4.73f, b = 4.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.73f, dy1 = -4.73f)
            }
        }.build().also { _brushTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _brushTwo: ImageVector? = null
