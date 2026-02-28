package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Python: ImageVector
    get() {
        val current = _python
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Python",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.56f, y = 7.56f)
                verticalLineTo(y = 3.89f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = -1.65f)
                curveToRelative(dx1 = 2.0f, dy1 = -0.31f, dx2 = 4.04f, dy2 = -0.31f, dx3 = 6.04f, dy3 = 0.0f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.42f, dy1 = 1.65f)
                verticalLineToRelative(dy = 5.89f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.22f, y1 = 12.0f)
                horizontalLineTo(x = 9.78f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.22f, dy1 = 2.22f)
                verticalLineToRelative(dy = 5.89f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.42f, dy1 = 1.65f)
                curveToRelative(dx1 = 2.0f, dy1 = 0.31f, dx2 = 4.04f, dy2 = 0.31f, dx3 = 6.04f, dy3 = 0.0f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.42f, dy1 = -1.65f)
                verticalLineToRelative(dy = -3.67f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.44f, y = 7.56f)
                horizontalLineToRelative(dx = 3.67f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.65f, dy1 = 1.42f)
                quadToRelative(dx1 = 0.46f, dy1 = 3.02f, dx2 = 0.0f, dy2 = 6.04f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.65f, dy1 = 1.42f)
                horizontalLineTo(x = 12.0f)
                moveToRelative(dx = 0.0f, dy = -8.88f)
                horizontalLineTo(x = 3.88f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.65f, dy1 = 1.42f)
                quadToRelative(dx1 = -0.47f, dy1 = 3.02f, dx2 = 0.0f, dy2 = 6.04f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.65f, dy1 = 1.42f)
                horizontalLineToRelative(dx = 3.67f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 19.15f)
            }
        }.build().also { _python = it }
    }

@Suppress("ObjectPropertyName")
private var _python: ImageVector? = null
