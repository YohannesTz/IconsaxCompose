package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardTick: ImageVector
    get() {
        val current = _cardTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardTick",
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
                moveTo(x = 2.0f, y = 10.0f)
                horizontalLineToRelative(dx = 20.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.55f, y = 20.5f)
                horizontalLineTo(x = 6.44f)
                curveToRelative(dx1 = -3.55f, dy1 = 0.0f, dx2 = -4.45f, dy2 = -0.88f, dx3 = -4.45f, dy3 = -4.39f)
                verticalLineTo(y = 7.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.18f, dx2 = 0.74f, dy2 = -4.2f, dx3 = 3.53f, dy3 = -4.36f)
                lineToRelative(dx = 0.92f, dy = -0.02f)
                horizontalLineToRelative(dx = 11.1f)
                curveTo(x1 = 21.1f, y1 = 3.51f, x2 = 22.0f, y2 = 4.4f, x3 = 22.0f, y3 = 7.91f)
                verticalLineToRelative(dy = 4.4f)
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
                moveTo(x = 6.0f, y = 16.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = 12.0f, dy = 2.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = 2.06f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 22.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.42f, dy1 = -1.94f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 14.0f, y1 = 18.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 8.0f, dy1 = 0.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.44f, y = 18.0f)
                lineToRelative(dx = 1.0f, dy = 0.99f)
                lineToRelative(dx = 2.12f, dy = -1.97f)
            }
        }.build().also { _cardTick = it }
    }

@Suppress("ObjectPropertyName")
private var _cardTick: ImageVector? = null
