package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cake: ImageVector
    get() {
        val current = _cake
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cake",
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
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 3.11f, y = 22.0f)
                verticalLineToRelative(dy = -9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.66f, dx2 = 1.49f, dy2 = -3.0f, dx3 = 3.33f, dy3 = -3.0f)
                horizontalLineToRelative(dx = 11.11f)
                curveToRelative(dx1 = 1.84f, dy1 = 0.0f, dx2 = 3.33f, dy2 = 1.34f, dx3 = 3.33f, dy3 = 3.0f)
                verticalLineToRelative(dy = 9.0f)
                moveTo(x = 5.56f, y = 10.0f)
                verticalLineTo(y = 7.17f)
                curveTo(x1 = 5.56f, y1 = 5.97f, x2 = 6.64f, y2 = 5.0f, x3 = 7.98f, y3 = 5.0f)
                horizontalLineToRelative(dx = 8.05f)
                curveToRelative(dx1 = 1.33f, dy1 = 0.0f, dx2 = 2.41f, dy2 = 0.97f, dx3 = 2.41f, dy3 = 2.17f)
                verticalLineTo(y = 10.0f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.53f, y = 13.98f)
                lineToRelative(dx = 0.37f, dy = 0.01f)
                arcToRelative(a = 1.35f, b = 1.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.33f, dy1 = 1.35f)
                verticalLineToRelative(dy = 0.33f)
                arcToRelative(a = 1.35f, b = 1.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.7f, dy1 = 0.0f)
                verticalLineToRelative(dy = -0.31f)
                arcToRelative(a = 1.35f, b = 1.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.7f, dy1 = 0.0f)
                verticalLineToRelative(dy = 0.31f)
                arcToRelative(a = 1.35f, b = 1.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.7f, dy1 = 0.0f)
                verticalLineToRelative(dy = -0.31f)
                arcToRelative(a = 1.35f, b = 1.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.7f, dy1 = 0.0f)
                verticalLineToRelative(dy = 0.31f)
                arcToRelative(a = 1.35f, b = 1.35f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.7f, dy1 = 0.0f)
                verticalLineToRelative(dy = -0.31f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.74f, dx2 = 0.6f, dy2 = -1.35f, dx3 = 1.35f, dy3 = -1.35f)
                horizontalLineToRelative(dx = 0.45f)
                moveTo(x = 8.0f, y = 5.0f)
                verticalLineTo(y = 3.0f)
                moveToRelative(dx = 8.0f, dy = 2.0f)
                verticalLineTo(y = 3.0f)
                moveToRelative(dx = -4.0f, dy = 2.0f)
                verticalLineTo(y = 2.0f)
            }
        }.build().also { _cake = it }
    }

@Suppress("ObjectPropertyName")
private var _cake: ImageVector? = null
