package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterTick: ImageVector
    get() {
        val current = _filterTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FilterTick",
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
                moveTo(x = 21.63f, y = 14.75f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.68f, dy1 = 2.45f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.07f, dy1 = 2.3f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.56f, dy1 = -0.77f)
                arcToRelative(a = 4.69f, b = 4.69f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.19f, dy1 = -3.98f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.79f, dy1 = -4.63f)
                arcToRelative(a = 4.74f, b = 4.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.71f, dy1 = 4.63f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.03f, y = 14.75f)
                lineToRelative(dx = 1.17f, dy = 1.17f)
                lineToRelative(dx = 2.53f, dy = -2.34f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.69f, y = 4.02f)
                verticalLineToRelative(dy = 2.22f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = 2.33f)
                lineToRelative(dx = -1.76f, dy = 1.55f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.88f, y1 = 10.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.56f, dy1 = 8.73f)
                verticalLineToRelative(dy = 0.34f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.61f, dx2 = -0.4f, dy2 = 1.42f, dx3 = -0.91f, dy3 = 1.72f)
                lineTo(x = 12.0f, y = 21.7f)
                curveToRelative(dx1 = -1.31f, dy1 = 0.81f, dx2 = -3.13f, dy2 = -0.1f, dx3 = -3.13f, dy3 = -1.72f)
                verticalLineToRelative(dy = -5.35f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.81f, dy1 = -2.12f)
                lineTo(x = 4.22f, y = 8.47f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.91f, dy1 = -2.02f)
                verticalLineTo(y = 4.12f)
                arcTo(horizontalEllipseRadius = 2.05f, verticalEllipseRadius = 2.05f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.33f, y1 = 2.0f)
                horizontalLineToRelative(dx = 13.34f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.02f, dy1 = 2.02f)
            }
        }.build().also { _filterTick = it }
    }

@Suppress("ObjectPropertyName")
private var _filterTick: ImageVector? = null
