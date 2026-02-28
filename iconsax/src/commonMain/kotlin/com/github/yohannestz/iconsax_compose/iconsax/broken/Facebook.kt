package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Facebook: ImageVector
    get() {
        val current = _facebook
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Facebook",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 9.3f)
                verticalLineToRelative(dy = 2.95f)
                horizontalLineToRelative(dx = 2.63f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.29f, dy1 = 0.36f)
                lineToRelative(dx = -0.38f, dy = 1.9f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.29f, dy1 = 0.24f)
                horizontalLineTo(x = 14.0f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = -3.0f)
                verticalLineToRelative(dy = -7.25f)
                horizontalLineTo(x = 9.3f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.3f, dy1 = -0.3f)
                verticalLineToRelative(dy = -1.9f)
                arcToRelative(a = 0.3f, b = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.3f, dy1 = -0.3f)
                horizontalLineTo(x = 11.0f)
                verticalLineTo(y = 9.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.0f, dy1 = -3.0f)
                horizontalLineToRelative(dx = 2.7f)
                arcTo(horizontalEllipseRadius = 0.3f, verticalEllipseRadius = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 6.3f)
                verticalLineToRelative(dy = 2.4f)
                arcTo(horizontalEllipseRadius = 0.3f, verticalEllipseRadius = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.7f, y1 = 9.0f)
                horizontalLineToRelative(dx = -2.4f)
                arcTo(horizontalEllipseRadius = 0.3f, verticalEllipseRadius = 0.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.0f, y1 = 9.3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 12.83f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
            }
        }.build().also { _facebook = it }
    }

@Suppress("ObjectPropertyName")
private var _facebook: ImageVector? = null
