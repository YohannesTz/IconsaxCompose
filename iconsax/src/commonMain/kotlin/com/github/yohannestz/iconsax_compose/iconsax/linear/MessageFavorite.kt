package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageFavorite: ImageVector
    get() {
        val current = _messageFavorite
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageFavorite",
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
                moveTo(x = 22.0f, y = 8.0f)
                verticalLineToRelative(dy = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 6.0f, dx2 = -6.0f, dy2 = 6.0f)
                horizontalLineToRelative(dx = -0.5f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = 0.4f)
                lineToRelative(dx = -1.5f, dy = 2.0f)
                curveToRelative(dx1 = -0.66f, dy1 = 0.88f, dx2 = -1.74f, dy2 = 0.88f, dx3 = -2.4f, dy3 = 0.0f)
                lineToRelative(dx = -1.5f, dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.1f, verticalEllipseRadius = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 19.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -4.0f, dy1 = 0.0f, dx2 = -6.0f, dy2 = -1.0f, dx3 = -6.0f, dy3 = -6.0f)
                verticalLineTo(y = 8.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -6.0f, dx2 = 6.0f, dy2 = -6.0f)
                horizontalLineToRelative(dx = 4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 15.2f, y = 4.62f)
                curveToRelative(dx1 = -0.33f, dy1 = -0.99f, dx2 = 0.06f, dy2 = -2.21f, dx3 = 1.14f, dy3 = -2.55f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 2.57f)
                curveToRelative(dx1 = 0.38f, dy1 = -0.55f, dx2 = 1.1f, dy2 = -0.67f, dx3 = 1.66f, dy3 = -0.5f)
                curveToRelative(dx1 = 1.08f, dy1 = 0.33f, dx2 = 1.47f, dy2 = 1.56f, dx3 = 1.14f, dy3 = 2.55f)
                curveTo(x1 = 20.29f, y1 = 6.19f, x2 = 18.5f, y2 = 7.0f, x3 = 18.0f, y3 = 7.0f)
                reflectiveCurveToRelative(dx1 = -2.27f, dy1 = -0.8f, dx2 = -2.8f, dy2 = -2.38f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 16.0f, y = 11.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
                moveToRelative(dx = -4.0f, dy = 0.0f)
                close()
            }
        }.build().also { _messageFavorite = it }
    }

@Suppress("ObjectPropertyName")
private var _messageFavorite: ImageVector? = null
