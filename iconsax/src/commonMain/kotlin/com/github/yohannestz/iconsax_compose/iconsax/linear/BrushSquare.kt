package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BrushSquare: ImageVector
    get() {
        val current = _brushSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BrushSquare",
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
                moveTo(x = 10.97f, y = 2.0f)
                horizontalLineToRelative(dx = -2.0f)
                curveToRelative(dx1 = -5.0f, dy1 = 0.0f, dx2 = -7.0f, dy2 = 2.0f, dx3 = -7.0f, dy3 = 7.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineToRelative(dy = -2.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.88f, y = 3.56f)
                arcToRelative(a = 27.0f, b = 27.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -6.9f, dy1 = 9.32f)
                lineToRelative(dx = -1.58f, dy = 1.26f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.63f, dy1 = 0.36f)
                lineToRelative(dx = -0.03f, dy = -0.46f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.93f, dy1 = -1.83f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.89f, dy1 = -0.95f)
                quadToRelative(dx1 = -0.24f, dy1 = -0.02f, dx2 = -0.48f, dy2 = -0.01f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.39f, dy1 = -0.67f)
                lineTo(x = 11.09f, y = 9.0f)
                arcToRelative(a = 27.0f, b = 27.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.32f, dy1 = -6.92f)
                arcToRelative(a = 1.13f, b = 1.13f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.47f, dy1 = 1.48f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.78f, y = 14.49f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.91f, dy1 = 3.29f)
                lineTo(x = 7.9f, y = 17.99f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.87f, dy1 = -1.88f)
                lineToRelative(dx = 0.21f, dy = -1.97f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.21f, dy1 = -2.9f)
                lineToRelative(dx = 0.48f, dy = 0.01f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.89f, dy1 = 0.95f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.96f, dy1 = 2.29f)
                moveToRelative(dx = 3.04f, dy = -2.51f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.79f, dy1 = -3.79f)
            }
        }.build().also { _brushSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _brushSquare: ImageVector? = null
