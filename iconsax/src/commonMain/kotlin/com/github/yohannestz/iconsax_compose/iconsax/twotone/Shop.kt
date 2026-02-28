package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Shop: ImageVector
    get() {
        val current = _shop
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Shop",
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
                moveTo(x = 12.0f, y = 12.0f)
                arcToRelative(a = 2.96f, b = 2.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.32f)
                lineTo(x = 14.34f, y = 2.0f)
                horizontalLineTo(x = 9.67f)
                lineTo(x = 9.0f, y = 8.68f)
                arcTo(horizontalEllipseRadius = 2.96f, verticalEllipseRadius = 2.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 12.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.31f, y = 12.0f)
                curveToRelative(dx1 = 2.02f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -1.64f, dx3 = 3.3f, dy3 = -3.65f)
                lineTo(x = 21.33f, y = 5.6f)
                curveTo(x1 = 20.97f, y1 = 3.0f, x2 = 19.97f, y2 = 2.0f, x3 = 17.35f, y3 = 2.0f)
                horizontalLineTo(x = 14.3f)
                lineTo(x = 15.0f, y = 9.01f)
                arcTo(horizontalEllipseRadius = 3.4f, verticalEllipseRadius = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.31f, y1 = 12.0f)
                moveTo(x = 5.64f, y = 12.0f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.3f, dy1 = -2.99f)
                lineTo(x = 9.16f, y = 6.8f)
                lineTo(x = 9.64f, y = 2.0f)
                horizontalLineTo(x = 6.59f)
                curveTo(x1 = 3.97f, y1 = 2.0f, x2 = 2.97f, y2 = 3.0f, x3 = 2.61f, y3 = 5.6f)
                lineTo(x = 2.34f, y = 8.35f)
                arcTo(horizontalEllipseRadius = 3.26f, verticalEllipseRadius = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.64f, y1 = 12.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.01f, y = 11.22f)
                verticalLineToRelative(dy = 4.49f)
                curveTo(x1 = 3.01f, y1 = 20.2f, x2 = 4.81f, y2 = 22.0f, x3 = 9.3f, y3 = 22.0f)
                horizontalLineToRelative(dx = 5.39f)
                curveToRelative(dx1 = 4.49f, dy1 = 0.0f, dx2 = 6.29f, dy2 = -1.8f, dx3 = 6.29f, dy3 = -6.3f)
                verticalLineToRelative(dy = -4.48f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 17.0f)
                quadToRelative(dx1 = -2.5f, dy1 = 0.0f, dx2 = -2.5f, dy2 = 2.5f)
                verticalLineTo(y = 22.0f)
                horizontalLineToRelative(dx = 5.0f)
                verticalLineToRelative(dy = -2.5f)
                quadToRelative(dx1 = 0.0f, dy1 = -2.5f, dx2 = -2.5f, dy2 = -2.5f)
            }
        }.build().also { _shop = it }
    }

@Suppress("ObjectPropertyName")
private var _shop: ImageVector? = null
