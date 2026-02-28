package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smileys: ImageVector
    get() {
        val current = _smileys
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Smileys",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 6.2f)
                verticalLineTo(y = 10.0f)
                curveToRelative(dx1 = -2.79f, dy1 = 0.05f, dx2 = -3.95f, dy2 = 1.21f, dx3 = -4.0f, dy3 = 4.0f)
                horizontalLineTo(x = 6.2f)
                curveTo(x1 = 3.2f, y1 = 14.0f, x2 = 2.0f, y2 = 12.8f, x3 = 2.0f, y3 = 9.8f)
                verticalLineTo(y = 6.2f)
                curveTo(x1 = 2.0f, y1 = 3.2f, x2 = 3.2f, y2 = 2.0f, x3 = 6.2f, y3 = 2.0f)
                horizontalLineToRelative(dx = 3.6f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.2f, dy2 = 1.2f, dx3 = 4.2f, dy3 = 4.2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.96f, y = 5.87f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.2f, y1 = 5.89f)
                moveToRelative(dx = 5.76f, dy = -0.02f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.2f, y1 = 5.89f)
                moveToRelative(dx = -1.04f, dy = 5.53f)
                horizontalLineTo(x = 5.84f)
                arcToRelative(a = 0.54f, b = 0.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.54f, dy1 = -0.54f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.39f, dy1 = -2.11f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 14.2f)
                verticalLineToRelative(dy = 3.6f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -1.2f, dy2 = 4.2f, dx3 = -4.2f, dy3 = 4.2f)
                horizontalLineToRelative(dx = -3.6f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -4.2f, dy2 = -1.2f, dx3 = -4.2f, dy3 = -4.2f)
                verticalLineTo(y = 14.0f)
                curveToRelative(dx1 = 0.05f, dy1 = -2.79f, dx2 = 1.21f, dy2 = -3.95f, dx3 = 4.0f, dy3 = -4.0f)
                horizontalLineToRelative(dx = 3.8f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 4.2f, dy2 = 1.2f, dx3 = 4.2f, dy3 = 4.2f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.96f, y = 13.62f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.76f, dy1 = -0.02f)
                moveToRelative(dx = 5.76f, dy = 0.02f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.76f, dy1 = -0.02f)
                moveToRelative(dx = -3.36f, dy = 2.58f)
                horizontalLineToRelative(dx = 4.32f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.54f, dy2 = 0.24f, dx3 = 0.54f, dy3 = 0.54f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.4f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.3f, dx2 = 0.24f, dy2 = -0.54f, dx3 = 0.54f, dy3 = -0.54f)
            }
        }.build().also { _smileys = it }
    }

@Suppress("ObjectPropertyName")
private var _smileys: ImageVector? = null
