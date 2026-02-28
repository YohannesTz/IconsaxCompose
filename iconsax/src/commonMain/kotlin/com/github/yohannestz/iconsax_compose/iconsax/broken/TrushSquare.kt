package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrushSquare: ImageVector
    get() {
        val current = _trushSquare
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TrushSquare",
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
                moveTo(x = 2.0f, y = 13.05f)
                verticalLineTo(y = 15.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.0f, dx3 = 7.0f, dy3 = -7.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.9f, y = 9.05f)
                arcToRelative(a = 66.0f, b = 66.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -6.57f, dy1 = -0.33f)
                quadToRelative(dx1 = -1.95f, dy1 = 0.0f, dx2 = -3.89f, dy2 = 0.2f)
                lineTo(x = 6.1f, y = 9.05f)
                moveTo(x = 9.7f, y = 8.4f)
                lineToRelative(dx = 0.15f, dy = -0.86f)
                curveToRelative(dx1 = 0.1f, dy1 = -0.62f, dx2 = 0.18f, dy2 = -1.09f, dx3 = 1.29f, dy3 = -1.09f)
                horizontalLineToRelative(dx = 1.72f)
                curveToRelative(dx1 = 1.1f, dy1 = 0.0f, dx2 = 1.19f, dy2 = 0.5f, dx3 = 1.29f, dy3 = 1.1f)
                lineToRelative(dx = 0.14f, dy = 0.84f)
                moveToRelative(dx = 2.2f, dy = 0.75f)
                lineToRelative(dx = -0.43f, dy = 6.6f)
                curveToRelative(dx1 = -0.07f, dy1 = 1.03f, dx2 = -0.13f, dy2 = 1.83f, dx3 = -1.96f, dy3 = 1.83f)
                horizontalLineTo(x = 9.89f)
                curveToRelative(dx1 = -1.83f, dy1 = 0.0f, dx2 = -1.89f, dy2 = -0.8f, dx3 = -1.96f, dy3 = -1.83f)
                lineTo(x = 7.5f, y = 9.13f)
            }
        }.build().also { _trushSquare = it }
    }

@Suppress("ObjectPropertyName")
private var _trushSquare: ImageVector? = null
